package task3;


public class Main {
    public static void main(String[] args) {
        new Thread(new WriterRunner()).start();
        new Thread(new WriterRunner()).start();
        new Thread(new WriterRunner()).start();
    }
}

