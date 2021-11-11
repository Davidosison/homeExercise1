import java.util.Scanner;
// A program that finds two  x1 and x2 of a quadratic equation.
public class FourthExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter 3 parameters.");

        System.out.println("Parameter a: ");
        int parameterA = in.nextInt();

        System.out.println("Parameter b: ");
        int parameterB = in.nextInt();

        System.out.println("Parameter c: ");
        int parameterC = in.nextInt();

        if (parameterA == 0) {
            System.out.println("There is no solution for the equation.");

        }else if ((Math.pow(parameterB, 2) - 4 * parameterA * parameterC) < 0){
            System.out.println("There is no solution for the equation.");

        }else if (rootFormula(parameterA, parameterB, parameterC) == 0) {
            System.out.println("There is one solution for the equation: " + (-parameterB / 2 * parameterA));

        }else if (rootFormula(parameterA, parameterB, parameterC) > 0 ) {
            System.out.println("The first solutions is: " + "x1 = " + ((-parameterB - (rootFormula(parameterA, parameterB, parameterC))) / 2 * parameterA));
            System.out.println("The second solution is: " + "x2 = " + ((-parameterB + (rootFormula(parameterA, parameterB, parameterC))) / 2 * parameterA));
        }
    }

    public static double rootFormula (int parameterA, int parameterB, int parameterC){
        return Math.sqrt(Math.pow(parameterB, 2) - 4 * parameterA * parameterC);
    }
}// End of program.