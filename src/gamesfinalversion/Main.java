package gamesfinalversion;

import java.io.*;
import java.util.*;

public class Main {

    public static String RandomOptionGenerator() {
/*        ArrayList<String> randomList = new ArrayList<>(List.of("paper", "scissors", "rock"));
        Collections.shuffle(randomList);
        return randomList.get(0);*/
        String[] myArray = new String[] {"paper", "scissors", "rock"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(myArray.length);
        return myArray[randomIndex];

    }
    public static void chooseAnOption (String name, String input) throws IOException {
        String computerOption = RandomOptionGenerator();
        int score = ScoreProvoider(name);
        if (input.equals("paper")) {
            if (computerOption.equals("scissors")) {
                System.out.println("Sorry, but the computer chose scissors");
                ScoreWriter(name, score);
            } else if (computerOption.equals("paper")) {
                System.out.println("There is a draw (paper)");
                score += 50;
                ScoreWriter(name, score);
            } else {
                System.out.println("Well done. The computer chose rock and failed");
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("scissors")) {
            if (computerOption.equals("rock")) {
                System.out.println("Sorry, but the computer chose rock");
                ScoreWriter(name, score);
            } else if (computerOption.equals("scissors")) {
                System.out.println("There is a draw (scissors)");
                score += 50;
                ScoreWriter(name, score);
            } else {
                System.out.println("Well done. The computer chose paper and failed");
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("rock")) {
            if (computerOption.equals("paper")) {
                System.out.println("Sorry, but the computer chose paper");
                ScoreWriter(name,score);
            } else if (computerOption.equals("rock")) {
                System.out.println("There is a draw (rock)");
                score += 50;
                ScoreWriter(name,score);
            } else {
                System.out.println("Well done. The computer chose scissors and failed");
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("!rating")) {
            System.out.printf("Your rating: %d%n", ScoreProvoider(name));
        } else {
            System.out.println("Invalid input");
        }
    }
    public static void ScoreWriter (String name, int score) throws IOException {
        String path = "C:\\Users\\alahmm\\Downloads\\rating.txt";
        File file = new File(path);
        Scanner scannerRead = new Scanner(file);
        boolean isNotExist = false;
        ArrayList<String> array = new ArrayList<>();
        while (scannerRead.hasNext()) {
            String inputRead = scannerRead.next();
            array.add(inputRead);
        }
        String[] listOfContent = new String[array.size()];
        for (int i = 0; i < listOfContent.length; i++) {
            listOfContent[i] = array.get(i);
        }
        for (int i = 0; i < listOfContent.length - 1; i ++) {
            if (listOfContent[i].equals(name)) {
                listOfContent[i + 1] = Integer.toString(score);
                isNotExist = false;
                break;
            } else {
                isNotExist = true;
            }
        }
        if (!isNotExist) {
            PrintWriter printWriter = new PrintWriter(file);
            for (int i = 0; i < listOfContent.length - 1; i += 2) {
                printWriter.printf("%n%s %s", listOfContent[i], listOfContent[i + 1]);
            }
            printWriter.close();
        }
        if (isNotExist) {
            try (FileWriter fileWriter = new FileWriter(file, true)) {
                PrintWriter printWriter2 = new PrintWriter(fileWriter);
                printWriter2.printf("%n%s %d", name, score);
            }
        }
    }
    public static int ScoreProvoider (String name) throws FileNotFoundException{
        String path = "C:\\Users\\alahmm\\Downloads\\rating.txt";
        File file = new File(path);
        Scanner scannerRead = new Scanner(file);
        int score = 0;
        while (scannerRead.hasNext()) {
            String inputRead = scannerRead.next();
            if (inputRead.equals(name)) {
                score += Integer.parseInt(scannerRead.next());
                break;
            }
        }
        return score;
    }
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name:");
        String name = scanner.next();
        System.out.printf("Hello, %s%n", name);

        while (scanner.hasNextLine()) {
            String input = scanner.next();
            if (input.equals("!exit")) {
                System.out.println("Bye!");
                return;
            }
            chooseAnOption(name, input);

        }
    }
}

