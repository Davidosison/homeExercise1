import java.util.Scanner;

public class FirstExercise {
    public static void main(String[] args) {
        System.out.println("Please enter your chosen number: "); //Asking the user to choose a number.
     Scanner scanner = new Scanner(System.in);
     int num1 = scanner.nextInt();

     System.out.println("The absolute of " + num1 + " is " + (Math.abs(num1)) + ".");
    }
}
