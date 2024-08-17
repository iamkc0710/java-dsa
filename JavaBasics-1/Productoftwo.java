
import java.util.Scanner;

public class Productoftwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;

        System.out.println(a*b);
        System.out.println("Product of two number:"+ product);
    }
}
