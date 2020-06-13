package exceptions.university;

import exceptions.exceptions.UniversityHasNoFacultiesException;
import exceptions.faculty.Faculty;
import exceptions.group.Group;
import exceptions.student.Student;
import exceptions.subject.Subject;
import exceptions.exceptions.FacultyHasNoGroupsException;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class University {
    private static String name = "BSU";
    private static List<Faculty> listOfFaculties = new ArrayList<>();
    public void addFaculty(Faculty faculty) throws FacultyHasNoGroupsException{
        if(faculty.getNumberOfGroups() == 0){
            throw new FacultyHasNoGroupsException("Faculty:" + faculty.getName() + ";has no groups");
        }
        listOfFaculties.add(faculty);
    }
    public List<Faculty> getListOfFaculties() throws UniversityHasNoFacultiesException{
        if(listOfFaculties.size() == 0){
            throw new UniversityHasNoFacultiesException("University:" + name + "has no faculties");
        }
        return listOfFaculties;
    }
    public String getName(){
        return name;
    }

    public String toString(){
        if( listOfFaculties.size()==0 ){
            return "There is no faculties in university";
        }
        String s = "";
        List<Group> listOfGroups;
        List<Student> listOfStudents;
        Set<Subject> setOfSubjects;
        Map<Subject,Integer> mapOfSubjectsAndMarks;
        int mark;
        for(Faculty faculty : listOfFaculties){
            listOfGroups = faculty.getListOfGroups();
            for(Group group : listOfGroups){
                listOfStudents = group.getListOfStudents();
                for(Student student : listOfStudents){
                    mapOfSubjectsAndMarks = student.getSubjectsAndMarks();
                    setOfSubjects = mapOfSubjectsAndMarks.keySet();
                    for(Subject subject: setOfSubjects){
                        mark = mapOfSubjectsAndMarks.get(subject);
                        s = s + "{Faculty:" + faculty.getName() + ";Group:" + group.getName() + ";Student:" +
                                student.getName() + ";Subject:" + subject.getName() + ";Mark:" + mark +"}\n";
                    }
                }
            }
        }
        return s;
    }
}
