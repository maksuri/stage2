package exceptions.runner;
import exceptions.creatorOfUniversity.CreatorOfUniversity;
import  exceptions.printer.Printer;


public class Runner {
    public static void main(String[] args) {
        CreatorOfUniversity.create();
        Printer.printInfoAboutUniversity();
        Printer.printAverageMarkOfStudentOnAllSubject("Defoe");
        Printer.printAverageMarkOnSubjectOfAllUniversity("English");
        Printer.printAverageMarkOnSubjectOnGroupOnFaculty("Biology","10","Biological");
        }
    }

