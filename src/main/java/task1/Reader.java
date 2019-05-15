package task1;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {
    public static void main(String[] args) throws IOException{
        List<Student> studentList = studentsRead();
        for (Student student:
                studentList) {
            System.out.println(student);
        }

    }

    public static List<Student> studentsRead() throws IOException{
        List<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(new FileReader("input.txt"));
        Group group = new Group(sc.next());
        while (sc.hasNext()){
            Student student = new Student(sc.next(),sc.next(),group);
            list.add(student);
        }
        sc.close();
        return list;
    }
}