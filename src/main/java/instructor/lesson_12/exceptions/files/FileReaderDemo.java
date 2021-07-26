package instructor.lesson_12.exceptions.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class FileReaderDemo {

    public static void main(String[] args) {

        System.out.println("Before");

        try {
            String text = Files.readString(Paths.get("/Users/konstantins/Desktop/message.txt"));
            System.out.println("text = " + text);
        } catch (IOException ex) {
            System.err.println("An error occurred while reading file: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            System.out.println("The final block");
        }

        System.out.println("After");
    }
}
