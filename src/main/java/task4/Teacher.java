package task4;

import java.util.Random;

public class Teacher {

    private String subject;

    public Teacher(String subject) {
        this.subject = subject;
    }

    public void examine(Student student) {
        int time = new Random().nextInt(1000);
        System.out.println(
                "Экзамен начат по предмету " + subject + " у студента " + student + ", время выполнения - " + time
        );
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(
                "Экзамен принят по предмету " + subject + " у студента " + student + ", время выполнения - " + time
        );
    }

}
