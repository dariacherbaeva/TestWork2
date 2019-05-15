package task1;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Writer {
    public static void write(List<Student> data)throws IOException {
        FileWriter fileWriter = new FileWriter("data.txt");
        fileWriter.write(data.get(0).group.toString());
        fileWriter.write("\n");
        for (Student student : data) {
            fileWriter.write(student.name);
            fileWriter.write(" ");
            fileWriter.write(student.surname);
        }
        fileWriter.close();
    }

    public static void main(String[] args) throws IOException {
        List<Student> students = new ArrayList<>(5);
        Group group = new Group("11-805");
        students.add(new Student("John", "Black", group));
        students.add(new Student("Dog", "Doggs", group));
        students.add(new Student("Ivan", "Ivanushkin", group));
        students.add(new Student("Petr", "Petrov", group));
        students.add(new Student("Radimir", "Mamedov", group));
        write(students);
    }

}