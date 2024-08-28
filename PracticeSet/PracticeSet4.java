package PracticeSet;

import java.util.Scanner;

public class PracticeSet4 {
    public static void main(String[] args){
    
    
    
    // Question 1 : How many times 'Hello' is printed?
    
    // for(int i=0; i<5; i++) {
    //     System.out.println("Hello");
    //     i += 2;
    // }


    /* Question 2 : Write a program that reads a set of integers, and then prints the sum of the
    even and odd integers.  */

    Scanner sc = new Scanner(System.in);
    int number;
    int sumEven = 0; int sumOdd = 0;
    char choice;

    

    do { 
        System.out.println("Enter the number : ");
        number = sc.nextInt();

        if(number % 2 == 0){
            sumEven += number;
        }
        else{
            sumOdd += number;
        }

        System.out.print("Do you want to continue? Type (y or n) :");
        choice = sc.next().charAt(0);
     
    } while (choice == 'y');

    System.out.println("Sum of even numbers : " +sumEven);
    System.out.println("Sum of odd numbers : " +sumOdd);



    // Question 3 : Write a program to find the factorial of any number entered by the user.
    System.out.print("Enter number :");
    int num = sc.nextInt();
    int fact = 1;


    while (num > 0) { 
        fact *= num;
        num--;
    }

    System.out.println(fact);


    // Question 4 : Write a program to print the multiplication table of a number N, entered by the use.
    int n = sc.nextInt();
    int i = 1;
    
    while (i <= 10) { 
        System.out.println(n + "*" + i + "=" + n*i);
        i++;
    }

   

    }
}
