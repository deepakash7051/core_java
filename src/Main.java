import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // int day = 2;
        // traditionalSwitch(day);
        // enhacedSwitch(day);
        // forLoop();
        // whileLoop();
        // doWhileLoop();
        int currentYear = 2025;
        // System.out.println(getInputFromConsole(currentYear));
        System.out.println(getInputFromScanner(currentYear));
    }

    /**
     * Traditional switch statement
     */
    public static void traditionalSwitch(int day) {
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");

            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
        }
    }

    /**
     * Enhanced switch statement
     */
    public static void enhacedSwitch(int day) {
        String dayOfWeek = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println(dayOfWeek);
    }

    /**
     * For loop
     */
    public static void forLoop() {
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    /**
     * While loop
     */
    public static void whileLoop() {
        int i = 0;
        int sum = 0;
        while (i < 10) {
            sum += i;
            i++;
        }
        System.out.println(sum);
    }

    /**
     * Do-while loop
     */
    public static void doWhileLoop() {
        int i = 0;
        boolean isReady = false;
        do {
            if (i >= 5) {
                break;
            }
            System.out.println(i);
            i++;
            isReady = (i > 0);
        } while (isReady);
    }
    /**
     * System.in
     * Like system.out, java proide system.in which can read input from console and
     * terminal
     */

    /*
     * System.console
     * This is java's solution for easier support for reading single line and
     * prompting user for information.
     * It is not available in all environments, so it is not recommended to use it.
     */
    public static String getInputFromConsole(int currentYear) {
        String name = System.console().readLine("Enter your name: ");
        System.out.println("Hello " + name);

        String dateOfBirth = System.console().readLine("What year you were born? ");
        int yearOfBirth = Integer.parseInt(dateOfBirth);
        int age = currentYear - yearOfBirth;
        return "You are " + age + " years old";  
    }
    /*
     * Command Line Arguments
     * This is calling the java program and specifying the data in the call, This is
     * very commomnly used but doesn't let us create *interactive application in
     * loop in java
     */

    /*
     * Scanner
     * Scanner class was built to be a common way to read input either using System.in or file.
     */
    public static String getInputFromScanner(int currentYear) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hi, what's your name.");
        
        String name = scanner.nextLine();
        System.out.println("Hi "+ name +"!");
        
        System.out.println("What year were you born?");
        String dateOfBirth = scanner.nextLine();
        
        int age = currentYear - Integer.parseInt(dateOfBirth); 

        return "So you are " + age + " year old";
    }
}   