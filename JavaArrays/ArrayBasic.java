package JavaArrays;

public class ArrayBasic {

    public static void updateMarks(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }
    }

    public static void main(String args[]){

        int arr[] = new int[10]; 

        arr[0] = 10;

        System.out.println(arr[0]);

        // passing arraysas argument
    
        int marks[] = {35, 23, 66};
        updateMarks(marks);

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] +" ");
        }
    }
}
