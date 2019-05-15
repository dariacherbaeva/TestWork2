package task3;

import java.util.Random;

public class WriterRunner implements Runnable {
    @Override
    public void run() {
        while (FileWriter.fileCount.get() < 10) {
            Random random = new Random();
            StringBuilder randomStringBuilder = new StringBuilder();
            for (int i = 0; i < 100; i++) {
                randomStringBuilder.append(random.nextInt(9));
            }
            String randString = randomStringBuilder.toString();
            FileWriter.writeStringToFile(randString);
        }
    }
}
