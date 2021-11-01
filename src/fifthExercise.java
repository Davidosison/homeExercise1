import java.util.Scanner;

public class fifthExercise {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int juniorEmployee = 50;
        int seniorEmployee = 250;
        int bonus = 250;

        System.out.println("Please enter employee type :");
        int employeeType = in.nextInt();

        System.out.println("Enter how much hours the employee worked :");
        int monthlyHour = in.nextInt();

        System.out.println("Enter how much days the employee reached the daily goal :");
        int daysReachedBonus = in.nextInt();

        while(employeeType == 0) {
            System.out.println("The monthly salary is :" + (juniorEmployee * monthlyHour + daysReachedBonus * bonus));
                break;
        }
        while(employeeType == 1) {
            System.out.println("The monthly salary is :" + (seniorEmployee * monthlyHour + daysReachedBonus * bonus));
                break;
        }
    }
}

