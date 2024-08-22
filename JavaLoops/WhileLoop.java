package JavaLoops;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        
    // Print Helloworld for 100times

    // int counter = 0;
    // while(counter <= 100){
    //     System.out.println("Hello World");
    //     counter++; 
    // }

    // Print number from 1 to 10

    // int num = 1;
    // while(num <= 10){
    //     System.out.println(num);
    //     num++;
    // }


    // Print number from 1 to n

     Scanner sc = new Scanner(System.in);

    // int limit = sc.nextInt();
    // int num = 1;

    // while(num <= limit){
    //     System.out.print(num + " ");
    //     num++;
    // }


    // Print sum of first n natural number

    int n = sc.nextInt();

    int total = 0;
    int sum = 1;

    // while(sum <= n){
    //     total += sum;
    //     sum++;
    // }

    while(n > 0){
        total += n;
        n--;
    }

    System.out.println("Sum of natural numbers :" +total);


    }
}
