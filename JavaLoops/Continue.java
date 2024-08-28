package JavaLoops;

import java.util.Scanner;

public class Continue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        do{
            System.out.print("Enter any number (Enter '0' to exit) : ");
            int num = sc.nextInt();

            if (num % 10 == 0) {
                continue;
            }

            System.out.println(num);
        }while(true);
    }
}
