package JavaConditional;

public class JavaIfelse {
    public static void main(String[] args) {
        
    // Question 1: Print you are adult or not ?

        int age = 20;

        if(age >= 18){
            System.out.println("You are Adult.");
        }
        else{
            System.out.println("You are not a Adult");
        }

    
    // Question 2: Print the largest of 2 numbers ?

        int a = 5;
        int b = 10;

        if(a >= b){
            System.out.println("a is greater than b");
        }
        else {
            System.out.println("b is greater than a");
        }


    // Question 3: Print if number is odd or even ?
        
        int num = 5;
        if(num % 2 == 0){
            System.out.println("Number is Even");
        }
        else{
            System.out.println("Number is Odd");
        }


    }
}
