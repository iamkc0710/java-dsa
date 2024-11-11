package PracticeSet;

public class PracticeSet6 {

    public static void countNumber(int matrix[][],int find){
        int count = 0;

        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j] == find){
                    count++;
                }
            }
        }
        System.out.println(count);
    }

    public static void sumofSecondRow(int matrix[][]) {
        int i = 1, sum = 0;
        for (int j = 0; j < matrix[0].length; j++) {
            sum += matrix[i][j];
        }
        System.out.println(sum);
    }

    public static void main(String args[]){
        int matrix[][] = {{1,7,3},
                          {4,7,6},
                          {5,7,9},
                         };
        int find = 7;

        countNumber(matrix,find);
        sumofSecondRow(matrix);
    }
}
