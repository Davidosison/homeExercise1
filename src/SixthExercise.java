import java.util.Scanner;

public class SixthExercise {
    public static void userParameter(int firstNumber, int difference, int amountOfNumbers) {
        for (int i = 0; i < amountOfNumbers; i++){
            System.out.println(firstNumber);
            firstNumber = firstNumber + difference;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the first number of the set :");
        int firstNumber = scanner.nextInt();

        System.out.println("Please enter the difference between the numbers in the set :");
        int difference = scanner.nextInt();

        System.out.println("Please enter the amount of the numbers you want :");
        int amountOfNumbers = scanner.nextInt();

       userParameter(firstNumber, difference, amountOfNumbers);
    }
}

