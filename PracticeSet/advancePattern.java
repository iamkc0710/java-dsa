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
    public static void halfPyramid(int row, int col){
        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= col; j++){
                if(j <= row-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
    
    // Question 1: Hollow Rectangle Pattern
       // hollowPattern(4, 5);


    // Question 2: Inverted & Rotated Half-Pyramid
        halfPyramid(4,4);


    }
}
