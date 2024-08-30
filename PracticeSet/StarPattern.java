package PracticeSet;

public class StarPattern {
    public static void main(String[] args) {
        
    /*
    Question 1 : Star Pattern
        *
        **
        ***
        ****
    */ 
    
    // for(int i = 1; i <= 4; i++){
    //     for(int j = 1; j <= i; j++){
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }



    /*
    Question 2 : Star Pattern
        ****
        ***
        **
        *
    */ 

    // for(int k = 4; k > 0; k--){
    //     for (int l = 1; l <= k; l++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }

    // int n = 4;
    // for(int k = 1; k <= 4; k++){
    //     for (int l = 1; l <= n-k+1; l++) {
    //         System.out.print("*");
    //     }
    //     System.out.println();
    // }



    /*
    Question 3 : Number Pattern
        1
        12
        123
        1234 
    */ 

    // for(int i = 1; i <= 4; i++){
    //     for(int j = 1; j <= i; j++){
    //         System.out.print(j);
    //     }
    //     System.out.println();
    // }

    /* Question 3 : Character Pattern
        A
        BC
        DEF
        GHIJ 
    */ 

    char ch = 'A';
    for(int i = 1; i <= 4; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(ch);
            ch++   ;
        }
        System.out.println();
    }


    }
}
