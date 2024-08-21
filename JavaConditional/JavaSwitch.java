package JavaConditional;

import java.util.Scanner;

public class JavaSwitch {
    public static void main(String[] args) {

    // Question 1:

        int num = 2;

        switch(num) {
            case 1:
                System.out.println("Samosa");
                break;
            case 2:
                System.out.println("Vadapav");
                break;
            case 3:
                System.out.println("Bhajiya");
                break;
            default:
                System.out.println("You are in diet");
                break;
        }


    // Question 2: Calculator using switch

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
                break;
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
            case '%':
                System.out.println(a%b);
                break;

            default:
            System.out.println("Something wrong !");
        }

    }
}
