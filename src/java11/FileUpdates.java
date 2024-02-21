package java11;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileUpdates {
    public static void main(String[] args) throws IOException {
        Path path = Files.writeString(Files.createTempFile("vivek", ".txt"), "Java 11 is cool");
        System.out.println(path.toString());
        String s = Files.readString(path);
        System.out.println(s);

    }
}
