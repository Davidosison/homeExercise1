import java.util.Random;
import java.util.Scanner;

public class TenthExercise {
    public static void main(String[] args) {
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(1000) + 1;
        int numberOfTries = 0;
        boolean win = false;
        System.out.println("This is a game of guessing a number from 1-1000 for two users.");
        int user1Guessing;
        int user2Guessing;
        while(win == false) {
            System.out.println("User 1 please enter your guess: ");
            user1Guessing = userGuess();
            numberOfTries++;
            if (user1Guessing == randomInt) {
                win = true;
            } else if (user1Guessing < randomInt) {
                toLow();
            } else if (user1Guessing > randomInt) {
                tooHigh();
            }

            System.out.println("User 2 please enter your guess: ");
            user2Guessing = userGuess();
            if (user2Guessing == randomInt) {
                win = true;
            } else if (user2Guessing < randomInt) {
                toLow();
            } else if (user2Guessing > randomInt) {
                tooHigh();
            }
        }
                System.out.println("You won");
                System.out.println("The number was " + randomInt);
                System.out.println("It took you " + numberOfTries + " tries.");
    }

    public static int userGuess(){
        Scanner scanner = new Scanner(System.in);
        int userGuessing = scanner.nextInt();
        return userGuessing;
    }

    public static void toLow(){
        System.out.println("You wrong, you're guess is too low.");
    }

    public static void tooHigh(){
        System.out.println("You wrong, you're guess is too high.");
    }
}