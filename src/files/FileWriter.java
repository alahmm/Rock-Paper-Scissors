package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileWriter {
}
class FilePrinter {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("C:\\Users\\alahmm\\Downloads\\file.txt"); // some file

        try (PrintWriter printWriter = new PrintWriter(file)) {
            printWriter.printf("%s dolor sit %s", "Lorem", "ipsum", "amet");
        }
    }
}
