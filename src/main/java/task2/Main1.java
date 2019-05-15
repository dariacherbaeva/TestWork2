package task2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class Main1 {

    public static void main(String[] args) {

        Person[] people = new Person[5];
        Person person1 = new Person("Ivan", "Ivanov", 25, true);
        Person person2 = new Person("Maria", "Ivanova", 22, false);
        Person person3 = new Person("Petr", "Petrov", 35, true);
        Person person4 = new Person("Mark", "Petrov", 30, true);
        Person person5 = new Person("Olga", "Sidorova", 45, false);
        people[0]=person1;
        people[1]=person2;
        people[2]=person3;
        people[3]=person4;
        people[4]=person5;

        FileOutputStream fileOutputStream = null;
        File file;

            try {
                file = new File("src/main/java/task2/result.txt");
                fileOutputStream = new FileOutputStream(file);

                if (!file.exists()) {
                    file.createNewFile();
                }

                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i<people.length; i++) {
                    stringBuilder.append(people[i].toString());
                }
                String peopleList = stringBuilder.toString();

                byte [] contentInBytes = peopleList.getBytes();

                fileOutputStream.write(contentInBytes);
                fileOutputStream.flush();
                fileOutputStream.close();

                System.out.println("Done");

            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }