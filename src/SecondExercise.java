import java.util.Scanner;

public class SecondExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter the first number :"); //Asking to use to input the first number.
        int firstNumber = in.nextInt();
        System.out.println("Please enter the second number :"); //Asking the user to input the second number.
        int secondNumber = in.nextInt();
        int sum = firstNumber + secondNumber; //summing up the first and the second numbers/
        if (sum % 2 == 0){ // Making a modulo 2 to know if the sum is even.
            System.out.println("The sum is even.");
        }
        else{ // If the sum isn't even then it is odd.
            System.out.println("The sum is odd.");
        }
    }
}
