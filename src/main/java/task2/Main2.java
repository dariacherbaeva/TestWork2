package task2;

import java.io.FileReader;
import java.io.IOException;

public class Main2 {
    public static void main(String[] args) {

        try (FileReader reader = new FileReader("src/main/java/task2/result.txt")) {
            int c;
            while ((c = reader.read()) != -1) {

                System.out.print((char) c);
            }
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }
    }
}

