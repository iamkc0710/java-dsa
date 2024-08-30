package JavaFunctions;
import java.util.*;

public class Function {

    // Function/Methods without parameter
    public static void printHello(){
        System.out.println("Hello");
        return;
    }


    // Function/Methods with parameter
    public static int  calculateSum(int a, int b){
        int sum = a + b;
        return sum;
    }


    // Function/Methods using call by value
    public static void swap(int a, int b){
        int temp  = a;
        a = b;
        b = temp;

        System.out.println("a = " +a);
        System.out.println("b = " +b);
    }
    

    public static void main(String args[]){
        printHello();

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        swap(a, b);
        // int sum = calculateSum(a, b);

        // System.out.println("Sum of two number : " +sum);
    }
}
