package exceptions.subject;

import java.util.Objects;

public class Subject {
    private String name;
    public String getName() {
        return name;
    }
    public Subject(String name){
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Subject subject = (Subject) o;
        return Objects.equals(name, subject.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
