package JavaFunctions;

import java.util.Scanner;

public class FunctionQues {
   
    // Find Product
    public static int multiply(int a, int b){
        int prod = a*b;
        return prod;
    }

    // Find Factorial
    public static int findFactorial(int num){
        int fact = 1;

        while(num > 0){
            fact *= num;
            num--;
        }

        return fact;
    }


    // Find Binomial Coefficient
    public static int binCoeff(int n, int r){

        int nfact = findFactorial(n);
        int rfact = findFactorial(r);
        int nrfact = findFactorial(n-r);

        int binSoln = nfact/(rfact*nrfact);
        return binSoln;

    }


    // Find Prime or Not
    public static boolean checkPrime(int num){
        // boolean isPrime = true;

        // Corner Cases
        if(num == 2){
            return true;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
        
    }


    // Convert from Binary to Decimal
    public static int BintoDec(int bin){
        int pow = 0;
        int dec = 0;
        int lastDigit = 0;

        while (bin > 0) {
            lastDigit = bin%10;
            dec += lastDigit * Math.pow(2, pow);

            bin /= 10;
            pow ++;
        }

        return dec;
    }

    // Convert from Decimal to Binary
    public static int DectoBin(int dec){
        int bin = 0;
        int pow = 0;

        while (dec > 0) {
           int rem = dec % 2;

            bin += rem * (int) Math.pow(10, pow);
            pow++;

            dec /= 2;
            
        }


        return bin;
    }


          


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


    // Question 1 : Find Product of two number.

        // System.out.println("Enter two number :");
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // int prod = multiply(a,b);
        // System.out.println("Product of two number is : " +prod);


    // Question 2 : Find Factorial of a number.
   
        // System.out.println("Enter number :");
        // int num = sc.nextInt();

        // int fact = findFactorial(num);
        // System.out.println("Factorial of given number is : " +fact);
    

    // Question 3 : Binomial Coefficient 

        // System.out.println("Enter two number :");

        // int n = sc.nextInt();
        // int r = sc.nextInt();

        // int binSoln = binCoeff(n, r);
        // System.out.println(binSoln);

    
    // Question 4 : Check if a number is Prime or not 
    
        // System.out.print("Enter number : ");
        // int num = sc.nextInt();

        // boolean isPrime = checkPrime(num);

        // if(isPrime == true){
        //     System.out.println("Prime");
        // } 
        // else{
        //     System.out.println("Not Prime");
        // }


    // Question 5 : Print all Primes in a Range 

        // System.out.print("Enter End number : ");
        // int end = sc.nextInt();

        // boolean isPrime;

        // for(int i = 2; i <= end; i++){

        //     if(checkPrime(i)){
        //         System.out.print(" " +i);
        //     }
        // }


    // Question 5 : Convert from Binary to Decimal
        // int bin = 10100011;

        // System.out.println(BintoDec(bin));


    // Question 6 : Convert from Decimal to Binary
        int dec = 7;
        System.out.println(DectoBin(dec));


    }
}
