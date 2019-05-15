package task3;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {

    }

    public static void writeCollectedData(String output, String filename, boolean append) {
        FileWriter fr = null;
        try {
            fr = new FileWriter(filename, append);
            fr.write(output);
            System.out.println("Запись успешна. \n");
        } catch (IOException e1) {
            e1.printStackTrace();
        } finally {
            try {
                assert fr != null;
                fr.close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
