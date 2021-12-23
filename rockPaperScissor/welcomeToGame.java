
import java.util.Scanner;

public class welcomeToGame {
    public static void main(String[] args) {

        String message = "Hello world!";
        String newMessage = message.substring(6, 12) + message.substring(12, 6);
        System.out.println(newMessage);

        System.out.println("\nHello! Welcome to a game of rock paper scissor!\nIt's so good to have you here!");

    }

}
