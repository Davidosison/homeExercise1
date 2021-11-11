import java.util.Scanner;
//A program that counts the salary of a chosen employee.

public class FifthExercise {
    //Function for counting the salary of a senior employee.
    public static int seniorEmployeeSalarySum(int monthlyHour, int dailyGoalDays) {
        int dailyGoalBonus = 250;
        int seniorEmployeeSalary = 200;
        return (seniorEmployeeSalary * monthlyHour) + (dailyGoalDays * dailyGoalBonus);

    }
    //Function for counting the salary on a junior employee.
    public static int juniorEmployeeSalarySum(int monthlyHour, int dailyGoalDays) {
        int dailyGoalBonus = 250;
        int juniorEmployeeSalary = 50;
        return  (juniorEmployeeSalary * monthlyHour) + (dailyGoalDays * dailyGoalBonus);

    }
    //The main function that gets all the data from the user.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        do {
            System.out.println("Enter the Employee type. \nFor junior employee enter 0 and for senior employee enter 1.");
            int employeeType = in.nextInt();

            System.out.println("Enter how much hour the employee worked this month :");
            int monthlyHour = in.nextInt();

            System.out.println("How much days the employee reached the daily goal ?");
            int dailyGoalDays = in.nextInt();

            if (employeeType == 1) {
                System.out.println("The salary is: " + seniorEmployeeSalarySum(monthlyHour, dailyGoalDays));
            } else if (employeeType == 0) {
                System.out.println("The salary is: " + juniorEmployeeSalarySum(monthlyHour, dailyGoalDays));
            }
                System.out.println("If you want to continue press 1, if not press 0");
                int continueInput = in.nextInt();
                if (continueInput == 0) {
                    System.out.println("Thank you and have a nice day.");
                    break;
                }else{
                    System.out.println("Please continue");
                }
            }
        while(true);
        }
    }
//End of program