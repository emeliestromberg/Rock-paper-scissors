
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class runnerTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Introduktion till spelet

        System.out.println("\n\nHello! Welcome to a game of rock paper scissor!\nIt's so good to have you here!");
        System.out.println("What type of game do you want to play? Best of three of first to three wins?");
        System.out.println("Type 1 for best of three and 2 for first to three wins");

        int gameChoice = scanner.nextInt();

        // Kod för när datorn ska slumpa sten sax eller påse
        // ---> Skriva en rad för listan????? <---
        List<String> choicesList = new ArrayList<>();
        choicesList.add("rock");
        choicesList.add("paper");
        choicesList.add("scissor");

   //     String[] choicesList = {"rock", "paper", "scissor"};   Varför funkar det inte att skriva så här?

        // Specificering för jämförelse mot playerInput

        String r = "rock";
        String p = "paper";
        String s = "scissor";

        // Antal vinster för spelaren och datorn

        int winsComputer = 0;
        int winsPlayer = 0;

        // Bäst av tre

        if (gameChoice == 1) {
            System.out.println("\nOkay we're gonna play best of three rounds. Let's go.");

            for (int i = 1; winsComputer + winsPlayer < 3; i++) {

                System.out.println("\nRound " + i
                        + ". When I say go, please press 1 for rock, 2 for paper or 3 for scissor.\n\n3...\n\t2...\n\t\t1...\n\t\t\tGO!");
                int playerInput = scanner.nextInt();
                System.out.println("You chose " + playerInput);
                Random random = new Random();
                int randomitem = random.nextInt(choicesList.size());
                String randomElement = choicesList.get(randomitem);
                System.out.println("\nAlriiight I choose...\n" + randomElement + "!!!!");

                if (playerInput == 1 && randomElement.equals(s)) {
                    winsPlayer++;
                    System.out.println("Okay you won, your " + r + " beats my " + randomElement + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 2 && randomElement.equals(r)) {
                    winsPlayer++;
                    System.out.println("Okay you won, your " + p + " beats my " + randomElement + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 3 && randomElement.equals(p)) {
                    winsPlayer++;
                    System.out.println("Okay you won, your " + s + " beats my " + randomElement + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 1 && randomElement.equals(p)) {
                    winsComputer++;
                    System.out.println("Okay I won, my " + randomElement + " beats your " + r + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 2 && randomElement.equals(s)) {
                    winsComputer++;
                    System.out.println("Okay I won, my " + randomElement + " beats your " + p + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 3 && randomElement.equals(r)) {
                    winsComputer++;
                    System.out.println("Okay I won, my " + randomElement + " beats your " + s + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 1 && randomElement.equals(r)) {
                    System.out.println("Oups, we both chose " + randomElement + ". Let's try again.");
                } else if (playerInput == 2 && randomElement.equals(p)) {
                    System.out.println("Oups, we both chose " + randomElement + ". Let's try again.");
                } else if (playerInput == 3 && randomElement.equals(s)) {
                    System.out.println("Oups, we both chose " + randomElement + ". Let's try again.");
                }
            }
        }
        // Först till tre

        if (gameChoice == 2) {
            System.out.print("\nOkay we're gonna play first to three. Let's go.");

            for (int i = 1; winsComputer < 3 && winsPlayer < 3; i++) {
                System.out.println("\nRound " + i
                        + ". When I say go, please press 1 for rock, 2 for paper or 3 for scissor.\n\n3...\n\t2...\n\t\t1...\n\t\t\tGO!");
                int playerInput = scanner.nextInt();
                System.out.println("You chose " + playerInput);

                Random random = new Random();
                int randomitem = random.nextInt(choicesList.size());
                String randomElement = choicesList.get(randomitem);
                System.out.println("\nAlriiight I choose...\n" + randomElement + "!!!!");

                if (playerInput == 1 && randomElement.equals(s)) {
                    winsPlayer++;
                    System.out.println("Okay you won, your " + r + " beats my " + randomElement + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 2 && randomElement.equals(r)) {
                    winsPlayer++;
                    System.out.println("Okay you won, your " + p + " beats my " + randomElement + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 3 && randomElement.equals(p)) {
                    winsPlayer++;
                    System.out.println("Okay you won, your " + s + " beats my " + randomElement + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 1 && randomElement.equals(p)) {
                    winsComputer++;
                    System.out.println("Okay I won, my " + randomElement + " beats your " + r + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 2 && randomElement.equals(s)) {
                    winsComputer++;
                    System.out.println("Okay I won, my " + randomElement + " beats your " + p + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 3 && randomElement.equals(r)) {
                    winsComputer++;
                    System.out.println("Okay I won, my " + randomElement + " beats your " + s + ". The score is you: "
                            + winsPlayer + " - computer: " + winsComputer);
                } else if (playerInput == 1 && randomElement.equals(r)) {
                    System.out.println("Oups, we both chose " + randomElement + ". Let's try again.");
                } else if (playerInput == 2 && randomElement.equals(p)) {
                    System.out.println("Oups, we both chose " + randomElement + ". Let's try again.");
                } else if (playerInput == 3 && randomElement.equals(s)) {
                    System.out.println("Oups, we both chose " + randomElement + ". Let's try again.");
                }

            }
        }

        // Spelet är slut. Nu visas resultatet.
        System.out.println("\nThis is the final score:\nYou: " + winsPlayer + " - Computer: " + winsComputer);
        if (winsPlayer > winsComputer) {
            System.out.println("Congratulations, you won! KING!!!");
        } else if (winsComputer > winsPlayer) {
            System.out.println("OMG I won!! You lost, suckah.");
        }

        // Fortsätt eller avsluta spelet?
        System.out.println(
                "\nWe have finished our game. Do you want to play again or quit? Write 1 for play again and 2 for quit.");
        int askQuit = scanner.nextInt();

        if (askQuit == 1) {
            System.out.println("\nAlright, brave one, let's go!\n...prank. This doesn't work yet. Bu-bye\n");
        } else if (askQuit == 2) {
            System.out.println("\nSo sorry to see you leave! Thank you for playing!\n");
        }

    }
}
