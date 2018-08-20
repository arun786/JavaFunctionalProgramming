package chapter1;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * Created by Adwiti on 8/19/2018.
 */
public class Step3_Files {

    public static void main(String[] args) throws URISyntaxException {

        Step3_Files step3_files = new Step3_Files();
        step3_files.readAFile();

    }

    public void readAFile() throws URISyntaxException {
        final Path path = Paths.get(getClass().getClassLoader().getResource("java.txt").toURI());
        try {
            try (Stream<String> lines = Files.lines(path)) {
                lines.forEach(line -> System.out.println(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
