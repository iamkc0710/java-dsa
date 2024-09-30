package Java2DArrays;

import java.util.Scanner;

public class Basic2D {
    public static void main(String args[]){
      int matrix[][] = new int[3][3];  

      Scanner sc = new Scanner(System.in);
      // Input 
      for(int i = 0; i < matrix.length; i++) {
          for (int j = 0; j < matrix[0].length; j++) {
              matrix[i][j] = sc.nextInt();
          }
      }

      int key = 5;
      // Output
      for(int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            System.out.print(matrix[i][j] +" ");
        }
      }

      // Search
      for(int i = 0; i < matrix.length; i++) {
        for (int j = 0; j < matrix[0].length; j++) {
            if(matrix[i][j] == key){
                System.out.println("Number found.");
            }
        }
      }
    

    }
}
