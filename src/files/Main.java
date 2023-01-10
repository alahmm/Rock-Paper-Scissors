package files;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
    public static void main(String[] args) {
/*        File file = new File("/home/username/Documents/javamaterials.pdf");

        System.out.println("File name: " + file.getName());
        System.out.println("File path: " + file.getPath());
        System.out.println("Is file: " + file.isFile());
        System.out.println("Is directory: " + file.isDirectory());
        System.out.println("Exists: " + file.exists());
        System.out.println("Parent path: " + file.getParent());*/

        File file = new File("/home/username/Documents/javamaterials.pdf");

        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                System.out.print(scanner.nextLine() + " ");
            }
        }  catch (FileNotFoundException e) {
            System.out.println("No file found: " + "/home/username/Documents/javamaterials.pdf");
        }
    }
}
class ReadingFileDemo {
    public static String readFileAsString(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    public static void EvenNumberCounter (String pathTotext) throws FileNotFoundException{
        int counter = 0;
        File file = new File(pathTotext);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            if (!input.equals("0")) {
                if (Integer.parseInt(input) % 2 == 0) {
                    counter++;
                }
            } else {
                break;
            }
            //System.out.println(scanner.nextLine());
        }
        System.out.println(counter);
        //System.out.println(readFileAsString(pathTotext));
    }

    public static void maximalFinder(String path) throws FileNotFoundException {
        ArrayList<Integer> numbers = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String input = scanner.next();
            try {
                numbers.add(Integer.parseInt(input));
            } catch (Exception e) {
                System.out.println("Error: not a number");
            }
        }
        int max = numbers.get(0);
        for (int number : numbers
             ) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println(max);
    }
    public static void sumCounter(String path) throws FileNotFoundException {
        int sum = 0;
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            try {
                sum += Integer.parseInt(input);
            } catch (Exception e) {
                System.out.println("Error: not a number");
            }
        }
        System.out.println(sum);
    }

    public static void BigNumberCounter (String pathTotext) throws FileNotFoundException{
        int counter = 0;
        File file = new File(pathTotext);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String input = scanner.next();
            try {
                long number = Integer.parseInt(input);
                if (number >= 9999) {
                    counter ++;
                }
            } catch (Exception e) {
                System.out.println("Error: not a number");
            }
        }
        System.out.println(counter);
        //System.out.println(readFileAsString(pathTotext));
    }
    public static void main(String[] args) throws FileNotFoundException {
/*        String pathTotext = "C:\\Users\\alahmm\\Downloads\\dataset_91065.txt";
        try {
            EvenNumberCounter(pathTotext);
        } catch (Exception E) {
            System.out.println("error");
        }*/

/*        String pathTotext = "C:\\Users\\alahmm\\Downloads\\dataset_91007.txt";
        maximalFinder(pathTotext);*/

/*        String pathTotext = "C:\\Users\\alahmm\\Downloads\\dataset_91033.txt";
        sumCounter(pathTotext);*/

        String pathTotext = "C:\\Users\\alahmm\\Downloads\\dataset_91022.txt";
        BigNumberCounter(pathTotext);
    }


}
