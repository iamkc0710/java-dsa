package PracticeSet;

public class PracticeSet5 {

    // Average of three numbers
    public static double avgNum(int a, int b, int c){
        return (double)(a+b+c)/3;
    }

    // Number is Even or not
    public static boolean isEven(int num){
        if(num % 2 == 0){
            return true;
        }

        return false;
    }

    // Palindrome Number
    public static void checkPalindrome(int pad){
        int rev = 0;
        int org = pad;

        while(pad != 0){
            int lastdigit = pad % 10;

            rev = (rev * 10) + lastdigit;
            pad /= 10;
        }

        if(rev == org){
            System.out.println("Palindrome Number.");
        }
        else{
            System.out.println("Non-Palindrome Number.");
        }
    }


    // Sum of the digits
    public static void sumDigit(int num){
        int sum = 0;

        while (num > 0) { 
            int lastdigit = num % 10;
            sum += lastdigit;
            num /= 10;
        }

        System.out.println("Sum of the digits : " +sum);
    }


    public static void main(String[] args) {
        
    // Question 1 : Write a Java method to compute the average of three numbers..
        System.out.println(avgNum(5, 6, 3));


    /*
    Question 2 : Write a method named isEven that accepts an int argument. The method
    should return true if the argument is even, or false otherwise. Also write a program to test your
    method.
    */

        int num = 1;
        if(isEven(num)){
            System.out.println("Even Number");
        }
        else{
            System.out.println("Odd Number");
        }



    /*
    Write a Java program to check if a number is a palindrome in Java? ( 121 is a
    palindrome, 321 is not)
    */

        int pad = 121;
        checkPalindrome(pad);


    /*
    Search about(Google) & use the following methods of the Math class in Java:
        a. Math.min( )
        b. Math.max( )
        c. Math.sqrt( )
        d. Math.pow( )
        e. Math.avg( )
        f. Math.abs( )
    */

    System.out.println(Math.min(5, 6));
    System.out.println(Math.max(10, 25));
    System.out.println(Math.sqrt(2));
    System.out.println(Math.pow(5, 2));
    // System.out.println(Math.average);
    System.out.println(Math.abs(5));


    // Write a Java method to compute the sum of the digits in an integer.
        sumDigit(1528);


    }
}
