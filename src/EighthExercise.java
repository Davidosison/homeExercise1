import java.util.Scanner;

public class EighthExercise {
    public static void main(String[] args) {

        asteriskOrder();
    }

    public static int numberChoosing() {
        Scanner scanner = new Scanner(System.in);
        int chosenNumber;

        do {
            System.out.println("Please choose a number between 5-20. \nEnter the number here: ");
            chosenNumber = scanner.nextInt();
        } while (chosenNumber <= 5 && chosenNumber >= 20);

        return chosenNumber;
    }

    public static void asteriskOrder() {
        int maxValue = numberChoosing();

        for (int i = 0; i < maxValue; i++) {         //Rows
            for (int j = 0; j < i; j++) {     //columns
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}

