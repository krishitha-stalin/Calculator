package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        double num1=0.0, num2=0.0;
        double sum=0.0, sub=0.0, multiple=0.0;
        double divide=0.0, remainder=0.0, power=0.0;
        char operator='\0';
        boolean nextOperation = true;
        char ch='\0';

        // create Scanner class object to
        // read inputs
        Scanner scan = new Scanner(System.in);

        // loop to repeat the process
        while(nextOperation) {

            // read numbers
            System.out.print("Enter two numbers: ");
            num1 = scan.nextDouble();
            num2 = scan.nextDouble();

            // read operation
            System.out.println("Which operation "
                    + "do you want to perform? \n"
                    + "Options are:- \n"
                    + "1. Addition \n"
                    + "2. Subtraction \n"
                    + "3. Multiplication \n"
                    + "4. Division \n"
                    + "5. Remainder \n"
                    + "6. Power value \n"
                    + "7. Exit");
            System.out.print("Enter option number: ");
            operator = scan.next().charAt(0);

            // switch-case
            switch(operator) {

                case '1':
                    sum = add(num1, num2);
                    System.out.println(num1 + " + "
                            + num2 + " = " + sum);
                    break;

                case '2':
                    sub = subtract(num1, num2);
                    System.out.println(num1 + " - "
                            + num2 + " = " + sub);
                    break;

                case '3':
                    multiple = multiply(num1, num2);
                    System.out.println(num1 + " * "
                            + num2 + " = " + multiple);
                    break;

                case '4':
                    divide = division(num1,num2);
                    System.out.println(num1 + " / "
                            + num2 + " = " + divide);
                    break;

                case '5':
                    remainder = findRemainder(num1, num2);
                    System.out.println(num1 + " % "
                            + num2 + " = " + remainder);
                    break;

                case '6':
                    power = Math.pow(num1, num2);
                    System.out.println(num1 + " ^ "
                            + num2 + " = " + power);
                    break;

                case '7':
                    // Shutdown JVM
                    System.exit(0);

                default:
                    System.out.println("Invalid operator");
            } // end of switch-case

            // ask for continue
            System.out.println("\nDo you want to continue?");
            System.out.print("Enter Y/N:: ");
            ch = scan.next().charAt(0);

            // continue when user enter 'y' or 'Y'
            // convert input into upper-case and check
            if(Character.toUpperCase(ch)!='Y')
                nextOperation = false;

            System.out.println(); // space
        } // while loop

        System.out.println("Thank You.");

        // close Scanner class object
        scan.close();
    }

    // method to calculate addition of two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // method to calculate subtraction of two numbers
    public static double subtract(double num1, double num2){
        return num1 - num2;
    }

    // method to calculate multiplication of two numbers
    public static double multiply(double num1, double num2){
        return num1 * num2;
    }

    // method to calculate division of two numbers
    public static double division(double num1, double num2){
        return num1 / num2;
    }

    // method to calculate remainder of two numbers
    public static double findRemainder(double num1,
                                       double num2) {
        return num1 % num2;
    }
}
