
import java.util.Scanner;

public class Sumoftwo {
    public static void main(String[] args) {

        // Using third variable --------

        // int a = 10;
        // int b = 5;
        // int sum = a + b;

        // System.out.println(sum);
        // System.out.println(a + b);       // Without Using third variable


        // Using User-Input --------

        // Scanner sc = new Scanner(System.in);
        // int c = sc.nextInt();
        // int d = sc.nextInt();

        // System.out.println(c + d);

        Scanner sc = new Scanner(System.in);
        float a = sc.nextFloat();
        float b = sc.nextFloat();
        float sum = a + b;

        System.out.println(sum);
        System.out.println(a + b); 
    }
}
