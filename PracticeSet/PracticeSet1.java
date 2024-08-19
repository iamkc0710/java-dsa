package PracticeSet;

import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {

    /* 
    Question 1: In a program to take input 3 numbers, A, B and C. You have to output the average of
    these 3 numbers.
    */  

    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();

    double avg = (a + b + c)/3;
    System.out.println("Average of three number :" +avg);


    /*
    Question 2: In a program, input the side of a square. You have to output the area of the
    square.
    */

    int side = sc.nextInt();
    int areaSq = side * side;

    System.out.println("Area of Square is :" +areaSq);


    /*
    Question 3: Enter cost of 3 items from the user (using float data type) - a pencil, a pen and
    an eraser. You have to output the total cost of the items back to the user as their bill.
    (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
    */

    float pencil = sc.nextFloat();
    float pen = sc.nextFloat();
    float eraser = sc.nextFloat();
    
    float sum = pencil + pen + eraser;
    float gst = sum * 0.18f;

    System.out.println("-------- Item Bill --------");
    System.out.println("Pencil :" +pencil +"\nPen :" +pen +"\nEraser :" +eraser +"\nGST :" +gst);
    System.out.println("Total Bill :" +(sum+gst));

    /*
    What will be the type of result in the following Java code?
    */

    byte byt = 4;
    char ch = 'a';
    short s = 512;
    int i = 1000;
    float f = 3.14f;
    double d = 99.9954;

    double result = (f*byt) + (i*ch) - (d*s);
     
     System.err.println(result);

    /*
    Question 5: (Advanced) Will the following statement give any error in Java?
    int $ = 24;
    */

    int $ = 24;
    System.out.println($);

    }
}
