import java.util.Scanner;

public class SeventhExercise {
    public static void main(String[] args) {
        openHours();
        dayChoosing();
    }

    public static void openHours() {
        System.out.println("Hello, \nThe opening hours are: ");
        System.out.println("\nSunday: 09:00-17:00");
        System.out.println("Monday: 09:00-17:00");
        System.out.println("Tuesday: 08:00-12:00");
        System.out.println("Wednesday: 09:00-17:00");
        System.out.println("Thursday: 09:00-17:00");
        System.out.println("Friday: closed");
        System.out.println("Saturday: closed");
    }

    public static void dayChoosing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nThis is an appointment system :)");
        System.out.println("\nPlease choose the day you would like to come to the appointment");
        System.out.println("1 - Sunday");
        System.out.println("2 - Monday");
        System.out.println("3 - Tuesday");
        System.out.println("4 - Wednesday");
        System.out.println("5 - Thursday");
        System.out.println("6 - Friday");
        System.out.println("7 - Saturday");
        System.out.println("Enter here: ");
        int day = scanner.nextInt();
        if (day < 1 || day > 7) {
            System.out.println("You chose an invalid day.");
        } else if (day == 7 || day == 6) {
            System.out.println("Sorry, but on weekends our office closed.");
        } else if (day == 1) {
            hourChoosing();
        } else if (day == 2) {
            hourChoosing();
        } else if (day == 3) {
            hourChoosingThursday();
        } else if (day == 4) {
            hourChoosing();
        } else if (day == 5) {
            hourChoosing();
        }

    }
    public static void hourChoosing() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the earliest hour you can arrive");
        int earliestHour = scanner.nextInt();
        if (earliestHour < 0 || earliestHour > 23) {
            System.out.println("You chose an invalid time.");
        }else if (earliestHour < 9 || earliestHour > 17){
            System.out.println("The opening hours are 09:00-17:00");
        } else {
            System.out.println("Please choose the latest hour you can arrive");

            int latestHour = scanner.nextInt();
            if (latestHour < 0 || latestHour > 23) {
                System.out.println("You chose an invalid time.");
            }else if (latestHour > 17){
                System.out.println("The opening hours are 09:00-17:00");
            } else if (earliestHour > latestHour) {
                System.out.println("The value of the earliest hour is bigger then the latest hour");
            }else{
                System.out.println("You're all set. \nThank you.");
            }

        }
    }
    public static void hourChoosingThursday(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose the earliest hour you can arrive");
        int earliestHour = scanner.nextInt();
        if (earliestHour < 0 || earliestHour > 23) {
            System.out.println("You chose an invalid time.");
        }else if (earliestHour < 8 || earliestHour > 12){
            System.out.println("The opening hours are 08:00-12:00");
        }else{
            System.out.println("Please choose the latest hour you can arrive");

            int latestHour = scanner.nextInt();
            if (latestHour < 0 || latestHour > 23) {
                System.out.println("You chose an invalid time.");
            }else if (latestHour > 12){
                System.out.println("The opening hours are 08:00-12:00");
            }else if (earliestHour > latestHour) {
                System.out.println("The value of the earliest hour is bigger then the latest hour");
            }else{
                System.out.println("You're all set. \nThank you.");
            }
        }
    }
}