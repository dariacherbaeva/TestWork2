package task4;

import task1.Group;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Exam implements Runnable {

    private Teacher teacher;
    private Student student;

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("English");
        Teacher teacher2 = new Teacher("IT");
        Student student1 = new Student("Daria", "Cherbaeva", Group.GROUP_5);
        Student student2 = new Student("Artyom", "Hakimov", Group.GROUP_5);
        Exam exam1 = new Exam(teacher1);
        exam1.setStudent(student1);
        Exam exam2 = new Exam(teacher1);
        exam2.setStudent(student2);
        Exam exam3 = new Exam(teacher2);
        exam3.setStudent(student1);
        Exam exam4 = new Exam(teacher2);
        exam4.setStudent(student2);

        ExecutorService executor = Executors.newFixedThreadPool(4);
        executor.submit(exam1);
        executor.submit(exam2);
        executor.submit(exam3);
        executor.submit(exam4);
    }

    public Exam(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public void run() {
        synchronized (student) {
            teacher.examine(student);
        }
    }

}

