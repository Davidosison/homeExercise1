import java.util.Scanner;

public class ThirdExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 numbers and you will get them in decreasing order.");
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int num3 = in.nextInt();

        if (num1 >= num2 && num1 >= num3 && num2 >= num3) {
            System.out.println("The new order is :" + num1 + " " + num2 + " " + num3);
        }
        else if (num1 >= num2 && num1 >= num3 && num3 >= num2){
            System.out.println("The new order is :" + num1 + " " + num3 + " " + num2);
        }
        else if (num2 >= num3 && num2 >= num1 && num3 >= num1) {
            System.out.println("The new order is :" + num2 + " " + num3+ " " + num1);
        }
        else if (num2 >= num3 && num2 >= num1 && num1 >= num3) {
            System.out.println("The new order is :" + num2 + " " + num1+ " " + num3);
        }
        else if (num3 >= num2 && num3 >= num1 && num2 >= num1) {
            System.out.println("The new order is :" + num3 + " " + num2+ " " + num1);
        }
        else if (num3 >= num2 && num3 >= num1 && num1 >= num2) {
            System.out.println("The new order is :" + num3 + " " + num1+ " " + num2);
        }
    }
}