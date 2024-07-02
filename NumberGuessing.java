import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        int tries = 0;
        int guess = 0;
        Scanner sc = new Scanner(System.in);
        Random ra = new Random();
        int numberToGuess = ra.nextInt(100);
        System.out.println("*** NUMBER GUESSING GAME ***");
        while (guess != numberToGuess) {
            System.out.print("Enter a guess number: ");
            guess = sc.nextInt();
            tries++;
            if (guess < numberToGuess) {
                System.out.println("Too low");
            } else if (guess > numberToGuess) {
                System.out.println("Too high");
            } else if (guess == numberToGuess) {
                System.out.println("CORRECT! No.of tries: " + tries);
            }
        }
        System.out.println("*** GAME COMPLETED ***");
    }
}