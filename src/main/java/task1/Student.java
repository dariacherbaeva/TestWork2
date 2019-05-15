package task1;

public class Student {

    String name;
    String surname;
    Group group;

    public Student(String name, String surname, Group group) {
        this.name = name;
        this.surname = surname;
        this.group = group;
    }

    @Override
    public String toString() {
        return "task1.Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", group=" + group +
                '}';
    }
}
