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
        step3_files.readAllTheFilesInADirectory();

    }

    public void readAFile() throws URISyntaxException {
        final Path path = Paths.get(getClass().getClassLoader().getResource("java.txt").toURI());
        try (Stream<String> lines = Files.lines(path)) {
            lines.forEach(line -> System.out.println(line));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public void readAllTheFilesInADirectory() throws URISyntaxException {
        final Path path = Paths.get(getClass().getClassLoader().getResource("chapter1").toURI());
        try (Stream<Path> list = Files.list(path)) {
            list.forEach(file -> System.out.println(file.getFileName()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
