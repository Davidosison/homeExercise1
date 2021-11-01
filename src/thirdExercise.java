import java.util.Scanner;

// A prgram that putting numbers in a decreasing order.

public class thirdExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 numbers and I put them in a decreasing order.");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
            System.out.println("The new order is :" + num1 + " " + num2+ " " + num3);
        }
        if (num1 >= num2 && num1 >= num3 && num3 >= num2){
            System.out.println("The new order is :" + num1 + " " + num3 + " " + num2);
        }
        if (num2 >= num3 && num2 >= num1 && num3 >= num1) {
            System.out.println("The new order is :" + num2 + " " + num3+ " " + num1);
        }
        if (num2 >= num3 && num2 >= num1 && num1 >= num3) {
            System.out.println("The new order is :" + num2 + " " + num1+ " " + num3);
        }
        if (num3 >= num2 && num3 >= num1 && num2 >= num1) {
            System.out.println("The new order is :" + num3 + " " + num2+ " " + num1);
        }
        if (num3 >= num2 && num3 >= num1 && num1 >= num2) {
            System.out.println("The new order is :" + num3 + " " + num1+ " " + num2);
        }
    }
}// End of program.