package PracticeSet;

import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
        
    // Question 1: Write a Java program to get a number from the user and print whether it is positive or negative ?
        
        System.out.println("Enter any number :");
        int num = sc.nextInt();

        if(num == 0){
            System.out.println("Given number is zero");
        }
        else if(num > 0) {
            System.out.println("Given number is positive");
        }
        else{
            System.out.println("Given number is negative");
        }



    /*
    Question 2 : Finish the following code so that it prints You have a fever if your temperature
    is above 100 and otherwise prints You don't have a fever.
    */

        double temp = 103.5;

        if(temp > 100){
            System.out.println("You have a fever.");
        }
        else{
            System.out.println("You don't have a fever.");
        }


    /*
    Question 3 : Write a Java program to input week number(1-7) and print day of week name
    using switch case 
    */
    
    System.out.println("Enter any number between (1-7) :");
    int week = sc.nextInt();

    switch (week) {
        case 1:
            System.out.println("Sunday");
            break;
        case 2:
            System.out.println("Monday");
            break;
        case 3:
            System.out.println("Tuesday");
            break;
        case 4:
            System.out.println("Wednesday");
            break;
        case 5:
            System.out.println("Thursday");
            break;
        case 6:
            System.out.println("Friday");
            break;
        case 7:
            System.out.println("Saturday");
            break;            
        default:
            System.out.println("Invalid number");
        }


    // Question 4 : What will be the value of x & y in the following program:
    
        int a = 63, b = 36;
        boolean x = (a < b ) ? true : false;
        int y= (a > b ) ? a : b;

        System.out.println(x);
        System.out.println(y);


    /*
    Question 5 : Write a Java program that takes a year from the user and print whether that
    year is a leap year or no
    */

     

    }
}
