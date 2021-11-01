import java.util.Scanner;
// A program that finds two  x1 and x2 of a quadratic equation.
public class fourthExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 parameters.");
        System.out.println("Parameter a :");
        int parameterA = in.nextInt();
        System.out.println("Parameter b :");
        int parameterB = in.nextInt();
        System.out.println("Parameter c :");
        int parameterC = in.nextInt();

        if((Math.sqrt(parameterB * parameterB - 4 * parameterA * parameterC) > 0 )) {
            System.out.println("There are two solutions :" + "x1 = " + ((-parameterB + (Math.sqrt(parameterB * parameterB - 4 * parameterA * parameterC))) / 2 * parameterA));
            System.out.println("There are two solutions :" + "x2 = " + ((-parameterB - (Math.sqrt(parameterB * parameterB - 4 * parameterA * parameterC)))/ 2 * parameterA));
        }
        if (Math.sqrt(parameterB * parameterB - 4 * parameterA * parameterC) == 0) {
            System.out.println("There is one solution for the equation : " + (-parameterB / 2 * parameterA));
        }
        if (2 * parameterA == 0){
            System.out.println("There is no solution for the equation.");
        }
        if ((parameterB * parameterB - 4 * parameterA * parameterC) < 0){
            System.out.println("There is no solution for the equation.");
        }
    }
}// End of program.