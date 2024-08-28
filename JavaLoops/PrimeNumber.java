package JavaLoops;

import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number : ");
        int n = sc.nextInt();
        boolean isPrime = true;

    // Normal Code 
      /*
      for (int i = 2; i < n; i++){
            if(n % i == 0){
                System.out.println("Non-Prime Number");
                isPrime = false;
                break;
            }
        }

        if(isPrime == true){
            System.out.println("Prime Number");
        }
      */  



    // Optimize Code 
    for (int i = 2; i <= Math.sqrt(n); i++){
            if(n % i == 0){
                System.out.println("Non-Prime Number");
                isPrime = false;
                break;
            }
        }

        if(isPrime == true){
            System.out.println("Prime Number");
        }
    }
}
