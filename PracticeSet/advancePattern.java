package PracticeSet;


public class advancePattern {

    /*
    Hollow Rectangle Pattern -
        *****
        *   *
        *   *
        *****
    */ 
    public static void hollowPattern(int row, int col){
            for(int i = 1; i <= row; i++){
                for (int j = 1; j <= col; j++) {
                    if(i == 1 || j == 1 || i == row || j == col){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    

    /*
    Inverted & Rotated Half-Pyramid -
            *
           **
          ***
         ****
    */ 
    public static void halfPyramid(int row){
        // for (int i = 1; i <= row; i++) {
        //     for (int j = 1; j <= row; j++){
        //         if(j <= row-i){
        //             System.out.print(" ");
        //         }
        //         else{
        //             System.out.print("*");
        //         }
        //     }
        //     System.out.println();
        // }

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i ; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i ; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

 
    /*
    Inverted Half-Pyramid with number -
        12345
        1234
        123 
        12
        1  
    */ 
    public static void halfPyramidNum(int row){
        // One way
        // for (int i = row; i > 0; i--) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j +" ");
        //     }
        //     System.out.println();
        // }

        //Another way
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= row-i+1; j++) {
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }


    /*
    FLOYD'S Triangle -
        1 
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15
    */ 
    public static void floydTriangle(int row){
        int num = 1;
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++){
                System.out.print(num +" ");
                num++;
            }
            System.out.println();    
        }
    }


    /*
    0-1 Triangle -
        1 
        0 1
        1 0 1
        0 1 0 1
    */ 
    public static void zeroOne(int row){
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= i; j++){
                if((i+j) % 2 == 0){
                    System.out.print(1 + " ");
                }
                else{
                    System.out.print(0 +" ");
                }
            }
        System.out.println();   
        }
    }


    /*
    Butterfly Rhombus -
    *      *
    **    **
    ***  ***
    ********
    ********
    ***  ***
    **    **
    *      *    
    */ 
    public static void butterflyPattern(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            for(int j = 1; j <= 2*(row-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
        System.out.println();
        }

        for(int i = row; i >= 1; i--){
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
                for(int j = 1; j <= 2*(row-i); j++){
                    System.out.print(" ");
                }
                for(int j = 1; j <= i; j++){
                    System.out.print("*");
                }
            System.out.println();
        }
    }


    /*
    Solid Rhombus -
        *****
       *****
      *****
     *****
    *****
    */ 
    public static void solidRhombus(int row){
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= (row-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= row; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }


    /*
    Hollow Rhombus -
        *****
       *   *
      *   *
     *   *
    *****
    */ 
    public static void hollowRhombus(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= (row-i); j++){      //space
                System.out.print(" ");
            }

            for (int j = 1; j <= row; j++) {
                if(i == 1 || j == 1 || i == row || j == row){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }


    /*
    Diamond Pattern -
       *
      ***
     *****
    *******
    *******
     *****
      ***
       *
    */ 
    public static void diamondPattern(int row){
        // First Half
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= (row-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
                }
            
            System.out.println();
        }

        // Second Half
        for (int i = row; i >= 1; i--) {
            for(int j = 1; j <= (row-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= (2*i)-1; j++){
                System.out.print("*");
                }
            
            System.out.println();
        }
    }

    /*
    Number Pyramid Pattern -
        1
       2 2 
      3 3 3 
    */ 
    public static void numPyramid(int row){
        for (int i = 1; i <= row; i++) {
            for(int j = 1; j <= (row-i); j++){
                System.out.print(" ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        
        }
    }

    /*
    Palindromic Pattern with number
        1
       212
      32123
     4321234
    */
    
    public static void palindromicPattern(int row){
        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= (row-i); j++){
                System.out.print(" ");
            }

            for(int j=i; j >= 1; j--){
                System.out.print(j);
            }

            for(int j=2; j <= i; j++){
                System.out.print(j);
            }
        System.out.println();
        }
    }



    public static void main(String[] args) {
    
    // Question 1: Hollow Rectangle Pattern
       // hollowPattern(4, 5);

    // Question 2: Inverted & Rotated Half-Pyramid
      //  halfPyramid(10);

    // Question 3: Inverted Half-Pyramid with number
        // halfPyramidNum(10);

    // Question 4: FLOYD'S Triangle
        // floydTriangle(5);

    // Question 4: Zero-One Triangle
        // zeroOne(5);

    // Question 5: Butterfly Pattern
        // butterflyPattern(4);

    // Question 6: Solid Rhombus
        // solidRhombus(5);

    // Question 7: Hollow Rhombus
        // hollowRhombus(5);

    // Question 8: Diamond Pattern
        // diamondPattern(4);

    // Question 9: Number Pyramid Pattern
        // numPyramid(6);

    // Question 10: Palindromic Pattern with number
        palindromicPattern(5);

    }
}
