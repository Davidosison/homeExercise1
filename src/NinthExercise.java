import java.util.Scanner;

public class NinthExercise {
    public static void main(String[] args) {
        int newInt = positiveNumberCheck();
        primeNumberCheck(newInt);
        for (int i = 2; i < newInt; i++){
            boolean prime = primeNumberCheck(i);

            if (prime == true){
                System.out.println(i + " ");
            }
        }
    }

    public static boolean moduloTwoNumbers(int firstNumber, int secondNumber) {
        boolean moduloWithRemaining;

        if(firstNumber % secondNumber != 0){
            moduloWithRemaining = false;
        }else {
            moduloWithRemaining = true;
        }
        return moduloWithRemaining;
    }

    public static boolean primeNumberCheck(int primeNumber) {
       boolean prime = true;

       if (primeNumber == 1){
           prime = false;
       }

       for (int i = 2; i < primeNumber; i++){
           if (moduloTwoNumbers(primeNumber, i) == true){
               prime = false;
           }
       }
       return prime;
    }

        public static int positiveNumberCheck() {
            Scanner scanner = new Scanner(System.in);
            int positiveNumber;

            do {
                System.out.println("Please enter a positive number: ");
                positiveNumber = scanner.nextInt();
            } while (positiveNumber < 0);
            return positiveNumber;
        }
    }

