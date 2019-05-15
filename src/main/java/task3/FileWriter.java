package task3;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

public class FileWriter {
    static volatile AtomicInteger fileCount = new AtomicInteger(0);

    public synchronized static void writeStringToFile(String string) {
        if (fileCount.get() < 10) {
            try {
                FileOutputStream out = new FileOutputStream(new File("random_strings/" + fileCount.get() + ".txt"));
                out.write(string.getBytes());
                fileCount.incrementAndGet();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

