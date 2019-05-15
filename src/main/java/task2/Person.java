package task2;

public class Person {
    public String name;
    public String surname;
    public int age;
    public boolean isMale;

    public Person(String name, String surname, int age, boolean isMale) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.isMale = isMale;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }
}
