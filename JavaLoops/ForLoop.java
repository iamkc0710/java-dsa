package JavaLoops;

public class ForLoop {
    public static void main(String[] args) {
        
    // Print 1 to 10 number using ForLoop

    for(int i = 1; i <= 10; i++){
        System.out.print(i + " ");
    }

    System.out.println();

    /*
    Print Square pattern: ****
                          ****
                          ****
                          ****
     */

     for(int i = 1; i<=4; i++){
        System.out.println("****");
     }


    // Print Reverse of a number / eg. 5654 -> 4565 
    
    // int num = 10899;
    // int n;

    // while(num > 0){
    //     n = num%10;
    //     System.out.print(n);
    //     num /= 10;
    // }


    // Print Reverse of a  given number / eg. 5654 -> 4565 
    
    int num = 10899;
    int rev = 0;
    int lastdigit = 0;


    while(num > 0){
        lastdigit = num%10;
        rev = (rev * 10) + lastdigit;
        num /= 10;
    }

    System.out.println(rev);


    }
}
