package JavaConditional;

import java.util.Scanner;

public class JavaElseif {
    public static void main(String[] args) {
    
    // Question 1 : Print you are adult or not?

        int age = 10;

        if(age >= 18){
            System.out.println("You are Adult.");
        }
        else if(age>=13 && age<=17){
            System.out.println("You are a Teenager");
        }
        else{
            System.out.println("You are a child");
        }

    // Question 2 : Income Tax Calculator

        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        int tax;


        if (income < 500000) {
            tax = 0;
        }
        else if(income >= 500000 && income < 1000000){
            tax = (int)(income * 0.2);
        }
        else{
            tax = (int)(income * 0.3);
        }

        System.out.println("Your tax is :" +tax);
        

    // Question 2 : Print the largest of 3 number

        int a = 10, b = 15, c = 10;

        if(a == b && b == c){
            System.out.println("a,b,c are equal");
        }
        else if (a > b && a > c) {
            System.out.println("a is greater");
        }
        else if(b > c) {
            System.out.println("b is greater");
        }
        else {
            System.out.println("c is greater");
        }


    }
}
