package task5;

import task2.Person;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Ivan", "Ivanov", 25, true);
        Person person2 = new Person("Maria", "Ivanova", 22, false);
        Person person3 = new Person("Petr", "Petrov", 35, true);
        Person person4 = new Person("Mark", "Petrov", 30, true);
        Person person5 = new Person("Olga", "Sidorova", 45, false);

        ArrayList<Person> people = new ArrayList<>();
        people.add(person1);
        people.add(person2);
        people.add(person3);
        people.add(person4);
        people.add(person5);
        writeZip(people);
    }

    static void writeZip(ArrayList<Person> people) {
        StringBuilder sb = new StringBuilder();
        for (Person person : people) {
            String personData = person.toString();
            sb.append(personData);
        }

        try (ZipOutputStream zout = new ZipOutputStream(new FileOutputStream("students.zip"))) {
            ZipEntry zipEntry = new ZipEntry("students.txt");
            zout.putNextEntry(zipEntry);
            byte[] bData = sb.toString().getBytes();
            zout.write(bData, 0, bData.length);
            zout.closeEntry();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

