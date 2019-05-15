package task3;

import java.io.FileWriter;
import java.io.IOException;

public class FileGenerator implements Runnable {

    String name;
    Thread thread;

    public FileGenerator(String name, Thread thread) {
        this.name = name;
        this.thread = thread;
    }

    public void run() {

    }
}
