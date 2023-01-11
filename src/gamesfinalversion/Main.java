package gamesfinalversion;

import java.io.*;
import java.util.*;

public class Main {

    public static String RandomOptionGenerator(String[] myArray) {
/*        ArrayList<String> randomList = new ArrayList<>(List.of("paper", "scissors", "rock"));
        Collections.shuffle(randomList);
        return randomList.get(0);*/
        //String[] myArray = new String[] {"paper", "scissors", "rock"};
        Random generator = new Random();
        int randomIndex = generator.nextInt(myArray.length);
        return myArray[randomIndex];

    }
    public static void chooseAnOption (String name, String input, String[] myArray) throws IOException {
        String computerOption = RandomOptionGenerator(myArray);
        int score = ScoreProvoider(name);

        if (input.equals("paper")) {
            if (computerOption.equals("scissors") || computerOption.equals("fire") || computerOption.equals("snake") ||
                    computerOption.equals("human") || computerOption.equals("Tree") || computerOption.equals("wolf")
                    || computerOption.equals("sponge")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("paper")) {
                System.out.println("There is a draw (paper)");
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("rock") || computerOption.equals("Gun") || computerOption.equals("lightning")
                    || computerOption.equals("devil") || computerOption.equals("dragon") || computerOption.equals("water")
                    || computerOption.equals("air")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("scissors")) {
            if (computerOption.equals("water") || computerOption.equals("dragon") ||
                    computerOption.equals("devil") || computerOption.equals("lightning") || computerOption.equals("Gun")
                    || computerOption.equals("rock") || computerOption.equals("fire")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("scissors")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("air") || computerOption.equals("paper") ||
                    computerOption.equals("sponge") || computerOption.equals("wolf") ||
                    computerOption.equals("Tree") || computerOption.equals("human") ||
                    computerOption.equals("snake")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("rock")) {
            if (computerOption.equals("paper") ||
                    computerOption.equals("air") || computerOption.equals("water") || computerOption.equals("dragon") ||
                    computerOption.equals("devil") || computerOption.equals("lightning") || computerOption.equals("Gun")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("rock")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("sponge") || computerOption.equals("wolf") || computerOption.equals("Tree") || computerOption.equals("human") ||
                    computerOption.equals("snake") || computerOption.equals("scissors") ||
                    computerOption.equals("fire")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("fire")) {
            if (computerOption.equals("air") || computerOption.equals("water") || computerOption.equals("dragon") ||
                    computerOption.equals("devil") || computerOption.equals("lightning") || computerOption.equals("Gun")
            || computerOption.equals("rock")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("fire")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("paper") || computerOption.equals("sponge") || computerOption.equals("wolf") || computerOption.equals("Tree") || computerOption.equals("human") ||
                    computerOption.equals("snake") || computerOption.equals("scissors")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("snake")) {
            if (computerOption.equals("dragon") ||
                    computerOption.equals("devil") || computerOption.equals("lightning") || computerOption.equals("Gun")
                    || computerOption.equals("rock") || computerOption.equals("fire") || computerOption.equals("scissors")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("snake")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("water") || computerOption.equals("air") || computerOption.equals("paper") ||
                    computerOption.equals("sponge") || computerOption.equals("wolf") ||
                    computerOption.equals("Tree") || computerOption.equals("human")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("human")) {
            if (computerOption.equals("devil") || computerOption.equals("lightning") || computerOption.equals("Gun")
                    || computerOption.equals("rock") || computerOption.equals("fire") || computerOption.equals("scissors")
            || computerOption.equals("snake")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("human")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("dragon") || computerOption.equals("water") || computerOption.equals("air") || computerOption.equals("paper") ||
                    computerOption.equals("sponge") || computerOption.equals("wolf") ||
                    computerOption.equals("Tree")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("tree")) {
            if (computerOption.equals("lightning") || computerOption.equals("Gun")
                    || computerOption.equals("rock") || computerOption.equals("fire") || computerOption.equals("scissors")
                    || computerOption.equals("snake") || computerOption.equals("human")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("Tree")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("devil") || computerOption.equals("dragon") || computerOption.equals("water") || computerOption.equals("air") || computerOption.equals("paper") ||
                    computerOption.equals("sponge") || computerOption.equals("wolf")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("wolf")) {
            if (computerOption.equals("Gun")
                    || computerOption.equals("rock") || computerOption.equals("fire") || computerOption.equals("scissors")
                    || computerOption.equals("snake") || computerOption.equals("human") || computerOption.equals("Tree")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("wolf")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("lightning") || computerOption.equals("devil") || computerOption.equals("dragon") || computerOption.equals("water") || computerOption.equals("air") || computerOption.equals("paper") ||
                    computerOption.equals("sponge")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("gun")) {
            if (computerOption.equals("sponge") || computerOption.equals("paper") ||
                    computerOption.equals("air") || computerOption.equals("water") || computerOption.equals("dragon") ||
                    computerOption.equals("devil") || computerOption.equals("lightning")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("Gun")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("wolf") || computerOption.equals("Tree") || computerOption.equals("human") ||
                    computerOption.equals("snake") || computerOption.equals("scissors") ||
                    computerOption.equals("fire") || computerOption.equals("rock")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("lightning")) {
            if (computerOption.equals("wolf") || computerOption.equals("sponge") || computerOption.equals("paper") ||
                    computerOption.equals("air") || computerOption.equals("water") || computerOption.equals("dragon") ||
                    computerOption.equals("devil")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("lightning")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("Tree") || computerOption.equals("human") ||
                    computerOption.equals("snake") || computerOption.equals("scissors") ||
                    computerOption.equals("fire") || computerOption.equals("rock") || computerOption.equals("Gun")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("devil")) {
            if (computerOption.equals("Tree")
                    || computerOption.equals("wolf") || computerOption.equals("sponge") || computerOption.equals("paper") ||
                    computerOption.equals("air") || computerOption.equals("water") || computerOption.equals("dragon")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("devil")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if ( computerOption.equals("human") || computerOption.equals("snake") || computerOption.equals("scissors") || computerOption.equals("fire") || computerOption.equals("rock") || computerOption.equals("Gun")
                    || computerOption.equals("lightning")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("dragon")) {
            if (computerOption.equals("human") || computerOption.equals("Tree")
                    || computerOption.equals("wolf") || computerOption.equals("sponge") || computerOption.equals("paper") ||
                    computerOption.equals("air") || computerOption.equals("water")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("dragon")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if ( computerOption.equals("snake") || computerOption.equals("scissors") || computerOption.equals("fire") || computerOption.equals("rock") || computerOption.equals("Gun")
                    || computerOption.equals("lightning")
                    || computerOption.equals("devil")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("water")) {
            if (computerOption.equals("snake") || computerOption.equals("human") || computerOption.equals("Tree")
                    || computerOption.equals("wolf") || computerOption.equals("sponge") || computerOption.equals("paper") ||
                    computerOption.equals("air")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("water")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if ( computerOption.equals("scissors") || computerOption.equals("fire") || computerOption.equals("rock") || computerOption.equals("Gun")
                    || computerOption.equals("lightning")
                    || computerOption.equals("devil") || computerOption.equals("dragon")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("air")) {
            if (computerOption.equals("scissors") || computerOption.equals("snake") ||
                    computerOption.equals("human") || computerOption.equals("Tree") || computerOption.equals("wolf")
                    || computerOption.equals("sponge") || computerOption.equals("paper") ) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("air")) {
                System.out.println("There is a draw (air)");
                score += 50;
                ScoreWriter(name, score);
            }else if ( computerOption.equals("fire") || computerOption.equals("rock") || computerOption.equals("Gun")
                    || computerOption.equals("lightning")
                    || computerOption.equals("devil") || computerOption.equals("dragon") || computerOption.equals("water")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
                score += 100;
                ScoreWriter(name,score);
            }
        } else if (input.equals("sponge")) {
            if ( computerOption.equals("rock") || computerOption.equals("fire") || computerOption.equals("scissors")
                    || computerOption.equals("snake") || computerOption.equals("human") || computerOption.equals("Tree")
            || computerOption.equals("wolf")) {
                System.out.printf("Sorry, but the computer chose %s%n", computerOption);
                ScoreWriter(name, score);
            } else if (computerOption.equals("sponge")) {
                System.out.printf("There is a draw (%s)%n", computerOption);
                score += 50;
                ScoreWriter(name, score);
            }else if (computerOption.equals("Gun")
                    || computerOption.equals("lightning") || computerOption.equals("devil") || computerOption.equals("dragon") || computerOption.equals("water") || computerOption.equals("air") || computerOption.equals("paper")) {
                System.out.printf("Well done. The computer chose %s and failed%n", computerOption);
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
                //score += 350;
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

        if(name.equals("Bob")) {
            ScoreWriter(name, 350);
        }
        scanner.nextLine();
        String inputOfOptions = scanner.nextLine();
        String[] listOfOptions = !inputOfOptions.equals("") ? inputOfOptions.split(",") : new String[]{"paper", "scissors", "rock"};
        System.out.println("Okay, let's start");
        while (scanner.hasNextLine()) {
            String input = scanner.next();
            if (input.equals("!exit")) {
                System.out.println("Bye!");
                return;
            }
            chooseAnOption(name, input, listOfOptions);

        }
    }
}

