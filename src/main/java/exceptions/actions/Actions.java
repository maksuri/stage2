package exceptions.actions;

import exceptions.exceptions.UniversityHasNoFacultiesException;
import exceptions.student.Student;
import exceptions.subject.Subject;
import exceptions.faculty.Faculty;
import exceptions.group.Group;
import exceptions.university.University;

import java.util.Collection;
import java.util.List;

import java.util.Map;

public class Actions {
    public static double getAverageMarkOfStudentOnAllSubject(String nameOfStudent) throws UniversityHasNoFacultiesException {
        int numberOfMarksOfStudent = 0;
        int sumOfMarksOfStudent = 0;
        University university = new University();
        List<Faculty> listOfFaculties = university.getListOfFaculties();
        List<Group> listOfGroups;
        List<Student> listOfStudents;
        for (Faculty faculty : listOfFaculties) {
            listOfGroups = faculty.getListOfGroups();
            for (Group group : listOfGroups) {
                listOfStudents = group.getListOfStudents();
                for (Student student : listOfStudents) {
                    if (student.getName().equals(nameOfStudent)) {
                        Collection<Integer> marksOfStudent = student.getSubjectsAndMarks().values();
                        for (int mark : marksOfStudent) {
                            sumOfMarksOfStudent += mark;
                            numberOfMarksOfStudent += 1;
                        }
                    }
                }
            }
        }
           if(numberOfMarksOfStudent != 0){
               return ((double) Math.round( (double) sumOfMarksOfStudent/numberOfMarksOfStudent * 100))/100;
           }
            return -1;

    }
    public static double getAverageMarkOnSubjectOnGroupOnFaculty(String subjectName,String groupName,String facultyName)
            throws UniversityHasNoFacultiesException {
        int numberOfMarksOnSubjectOnGroupOnFaculty = 0;
        int sumOfMarksOnSubjectOnGroupOnFaculty = 0;
        University university = new University();
        List<Faculty> listOfFaculties =  university.getListOfFaculties();
        List<Group>  listOfGroups;
        List<Student> listOfStudents;
        Map <Subject,Integer> mapOfSubjectAndMarks;
        for(Faculty faculty : listOfFaculties) {
            if(faculty.getName().equals(facultyName)) {
                listOfGroups = faculty.getListOfGroups();
                for(Group group: listOfGroups){
                    if(group.getName().equals(groupName)){
                        listOfStudents = group.getListOfStudents();
                        for(Student student: listOfStudents){
                            mapOfSubjectAndMarks = student.getSubjectsAndMarks();
                            Subject subject = new Subject(subjectName);
                            if(mapOfSubjectAndMarks.containsKey(subject)){
                                sumOfMarksOnSubjectOnGroupOnFaculty += mapOfSubjectAndMarks.get(subject);
                                numberOfMarksOnSubjectOnGroupOnFaculty += 1;
                            }
                        }
                    }
                }
            }
        }
        if( numberOfMarksOnSubjectOnGroupOnFaculty > 0 ){
            return ((double)Math.round ((double) sumOfMarksOnSubjectOnGroupOnFaculty
                    /numberOfMarksOnSubjectOnGroupOnFaculty*100))/100;
        }
        return -1;
    }



    public static double getAverageMarkOnSubjectOfAllUniversity(String subjectName) throws UniversityHasNoFacultiesException{
        int numberOfMarksOnSubject = 0;
        int sumOfMarksOnSubject = 0;
        University university = new University();
        List<Faculty> listOfFaculties =  university.getListOfFaculties();
        List<Group>  listOfGroups;
        List<Student> listOfStudents;
        for(Faculty faculty : listOfFaculties){
            listOfGroups = faculty.getListOfGroups();
            for(Group group : listOfGroups ){
                listOfStudents = group.getListOfStudents();
                 for(Student student: listOfStudents){
                        Map<Subject,Integer> mapOfSubjectAndMarks = student.getSubjectsAndMarks();
                        Subject subject = new Subject(subjectName);
                        if(mapOfSubjectAndMarks.containsKey(subject)){
                            sumOfMarksOnSubject += mapOfSubjectAndMarks.get(subject);
                            numberOfMarksOnSubject +=1;
                        }
                 }
            }
        }
        if(numberOfMarksOnSubject != 0){
            return ((double)Math.round ((double) sumOfMarksOnSubject/numberOfMarksOnSubject * 100)) /100;
        }
        return -1;
    }
}