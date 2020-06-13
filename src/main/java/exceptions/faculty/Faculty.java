package exceptions.faculty;

import exceptions.exceptions.GroupHasNoStudentsException;
import exceptions.exceptions.FacultyHasNoGroupsException;
import exceptions.group.Group;
import exceptions.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Faculty {

    String name;
    List<Group> listOfGroups = new ArrayList<>() ;
    public Faculty(String name){

        this.name = name;
    }
    public void addGroup(Group group) throws GroupHasNoStudentsException {
        if(group.getNumberOfStudents() == 0){
            throw new GroupHasNoStudentsException("Group:" + group.getName() + ";Impossible to add group without any students");
        }
        listOfGroups.add(group);
    }
    public List<Group> getListOfGroups()  {
      //  if (listOfGroups.size() == 0){
      //      throw new FacultyHasNoGroupsException("Faculty:" + name + ";Impossible that group has no students");
      //  }
        return listOfGroups;
    }
    public int getNumberOfGroups(){

        return listOfGroups.size();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
