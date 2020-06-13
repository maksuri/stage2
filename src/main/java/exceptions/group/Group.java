package exceptions.group;
import exceptions.exceptions.GroupHasNoStudentsException;
import exceptions.student.Student;
import exceptions.exceptions.StudentHasNoSubjectsException;
import java.util.List;
import java.util.ArrayList;
public class Group {
    String name;
    List<Student> listOfStudents;
    public Group(String name){
        this.name = name;
        listOfStudents = new ArrayList<Student>();
    }
    public void addStudent(Student student) throws StudentHasNoSubjectsException {
        if(student.getNumberOfSubjects() == 0){
            throw new StudentHasNoSubjectsException("Student:" + student.getName() + ";Impossible to add student without any subject");
        }
        listOfStudents.add(student);
    }
    public List<Student> getListOfStudents()  {
     //   if (listOfStudents.size() == 0){
     //       throw new GroupHasNoStudentsException("Impossible that group has no students");
     //   }
        return listOfStudents;
    }
    public int getNumberOfStudents(){
        return listOfStudents.size();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
