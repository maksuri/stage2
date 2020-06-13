package exceptions.creatorOfUniversity;

import exceptions.subject.Subject;
import exceptions.student.Student;
import exceptions.group.Group;
import exceptions.faculty.Faculty;
import exceptions.university.University;
import exceptions.exceptions.FacultyHasNoGroupsException;
import exceptions.exceptions.GroupHasNoStudentsException;
import exceptions.exceptions.StudentHasNoSubjectsException;
import exceptions.exceptions.MarkIsNotCorrectException;

public class CreatorOfUniversity {
    public static void create() {
        Subject subjectChemistry = new Subject("Chemistry");
        Subject subjectMaths = new Subject("Maths");
        Subject subjectBiology = new Subject("Biology");
        Subject subjectEnglish = new Subject("English");
        Subject subjectFrench = new Subject("French");
        Student studentGreen = new Student("Green");
        Student studentDefoe = new Student("Defoe");
        Student studentRooney = new Student("Rooney");
        Student studentHart = new Student("Hart");
        Student studentSancho = new Student("Sancho");
        Student studentMurray = new Student("Murray");
        Student studentKane = new Student("Kane");
        Student studentScott = new Student("Scott");

        try {
            studentDefoe.addSubjectAndMark(subjectBiology, 7);
            studentDefoe.addSubjectAndMark(subjectChemistry, 9);
            studentDefoe.addSubjectAndMark(subjectEnglish, 10);
            studentGreen.addSubjectAndMark(subjectBiology, 5);
            studentGreen.addSubjectAndMark(subjectChemistry, 3);
            studentGreen.addSubjectAndMark(subjectEnglish, 8);
            studentHart.addSubjectAndMark(subjectBiology, 4);
            studentHart.addSubjectAndMark(subjectChemistry, 5);
            studentHart.addSubjectAndMark(subjectEnglish, 5);
            studentKane.addSubjectAndMark(subjectBiology, 6);
            studentKane.addSubjectAndMark(subjectChemistry, 7);
            studentKane.addSubjectAndMark(subjectEnglish, 9);
            studentMurray.addSubjectAndMark(subjectMaths, 8);
            studentMurray.addSubjectAndMark(subjectFrench, 7);
            studentMurray.addSubjectAndMark(subjectEnglish, 9);
            studentRooney.addSubjectAndMark(subjectMaths, 6);
            studentRooney.addSubjectAndMark(subjectFrench, 5);
            studentRooney.addSubjectAndMark(subjectEnglish, 8);
            studentSancho.addSubjectAndMark(subjectMaths, 7);
            studentSancho.addSubjectAndMark(subjectFrench, 9);
            studentSancho.addSubjectAndMark(subjectEnglish, 5);
            studentScott.addSubjectAndMark(subjectMaths, 6);
            studentScott.addSubjectAndMark(subjectFrench, 5);
            studentScott.addSubjectAndMark(subjectEnglish, 8);
            Group group10 = new Group("10");
            Group group11 = new Group("11");
            Group group20 = new Group("20");
            Group group21 = new Group("21");
            group10.addStudent(studentDefoe);
            group10.addStudent(studentGreen);
            group11.addStudent(studentHart);
            group11.addStudent(studentKane);
            group20.addStudent(studentMurray);
            group20.addStudent(studentRooney);
            group21.addStudent(studentSancho);
            group21.addStudent(studentScott);
            Faculty facultyBiological = new Faculty("Biological");
            Faculty facultyLinguistics = new Faculty("Linguistics");
            facultyBiological.addGroup(group10);
            facultyBiological.addGroup(group11);
            facultyLinguistics.addGroup(group20);
            facultyLinguistics.addGroup(group21);
            University university = new University();
            university.addFaculty(facultyBiological);
            university.addFaculty(facultyLinguistics);
        }
        catch (MarkIsNotCorrectException|StudentHasNoSubjectsException|
                GroupHasNoStudentsException|FacultyHasNoGroupsException e ) {
            System.out.println("Exception in creator University");
            e.printStackTrace();
        }

    }
}
