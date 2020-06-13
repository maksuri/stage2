package exceptions.printer;

import exceptions.actions.Actions;
import exceptions.exceptions.UniversityHasNoFacultiesException;
import exceptions.university.University;

public class Printer {
    public static void printAverageMarkOfStudentOnAllSubject(String studentName) {
        double averageMarkOfStudentDefoeOnAllSubject;
        try {
               averageMarkOfStudentDefoeOnAllSubject = Actions.getAverageMarkOfStudentOnAllSubject("Defoe");
            System.out.println("Average mark of student:" + studentName + " on all subject");
            if (averageMarkOfStudentDefoeOnAllSubject != -1) {
                System.out.println(averageMarkOfStudentDefoeOnAllSubject);
            } else {
                System.out.println("There is no such student:" + studentName + "in university");
           }
        }
        catch (UniversityHasNoFacultiesException e) {
            System.out.println("There is no faculties in university");
        }
    }
    public static void printAverageMarkOnSubjectOfAllUniversity(String subjectName){
        try {
            double averageMarkOnEnglishOfAllUniversity = Actions.
                    getAverageMarkOnSubjectOfAllUniversity(subjectName);
            System.out.println("Average mark on subject:" + subjectName);
            if (averageMarkOnEnglishOfAllUniversity != -1) {
                System.out.println(averageMarkOnEnglishOfAllUniversity);
            } else {
                System.out.println("There is no subject:" + subjectName + " in University");
            }
        }catch(UniversityHasNoFacultiesException e){
            System.out.println("There is no faculties in university");
        }

    }
    public static void printAverageMarkOnSubjectOnGroupOnFaculty(String subjectName,String groupName,String facultyName){
       try {
           double averageMarkOnSubjectBiologyOnGroup10OnFacultyBiological =
                   Actions.getAverageMarkOnSubjectOnGroupOnFaculty(subjectName, groupName, facultyName);
           System.out.println("Average mark on subject:" + subjectName +
                   " on group:" + groupName + " on faculty:" + facultyName);
           if (averageMarkOnSubjectBiologyOnGroup10OnFacultyBiological != -1) {
               System.out.println(averageMarkOnSubjectBiologyOnGroup10OnFacultyBiological);
           } else {
               System.out.println("There is no such subject:" + subjectName +
                       " in such group:" + groupName + " in such faculty:" + facultyName);
           }
       }catch(UniversityHasNoFacultiesException e){
           System.out.println("There is no faculties in university");
       }
    }
    public static void printInfoAboutUniversity(){
        University university = new University();
        System.out.println(university);
    }
}
