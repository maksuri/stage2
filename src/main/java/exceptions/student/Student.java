package exceptions.student;

import exceptions.subject.Subject;
import exceptions.exceptions.MarkIsNotCorrectException;

import java.util.HashMap;
import java.util.Map;
public class Student {
    private String name;
    private Map<Subject,Integer> subjectsAndMarks = new HashMap<>();

    public Student(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void addSubjectAndMark(Subject subject,int Mark) throws MarkIsNotCorrectException {
        if( Mark < 1 || Mark >10 ){
            throw new MarkIsNotCorrectException("Student:" + getName() + ";Mark should be an integer between 1 and 10");
        }
        subjectsAndMarks.put(subject,Mark);
    }
    public Map<Subject,Integer> getSubjectsAndMarks(){
        return subjectsAndMarks;
    }
    public int getNumberOfSubjects(){
        return subjectsAndMarks.size();
    }
}
