package rockpaperscissors;

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
    public static void chooseAnOption (String input) {
        String computerOption = RandomOptionGenerator();
        if (input.equals("paper")) {
            if (computerOption.equals("scissors")) {
                System.out.println("Sorry, but the computer chose scissors");
            } else if (computerOption.equals("paper")) {
                System.out.println("There is a draw (paper)");
            } else {
                System.out.println("Well done. The computer chose rock and failed");
            }
        } else if (input.equals("scissors")) {
            if (computerOption.equals("rock")) {
                System.out.println("Sorry, but the computer chose rock");
            } else if (computerOption.equals("scissors")) {
                System.out.println("There is a draw (scissors)");
            } else {
                System.out.println("Well done. The computer chose paper and failed");
            }
        } else if (input.equals("rock")) {
            if (computerOption.equals("paper")) {
                System.out.println("Sorry, but the computer chose paper");
            } else if (computerOption.equals("rock")) {
                System.out.println("There is a draw (rock)");
            } else {
                System.out.println("Well done. The computer chose scissors and failed");
            }
        } else {
            System.out.println("Invalid input");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String input = scanner.next();
            if (input.equals("!exit")) {
                System.out.println("Bye!");
                return;
            }
            chooseAnOption(input);
        }
    }
}