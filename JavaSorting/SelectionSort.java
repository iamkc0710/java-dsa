package JavaSorting;

public class SelectionSort {

    public static void selectionSort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int minPos = i;
            
            for (int j = i+1; j < arr.length; j++) {
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
        
        int swap = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = swap; 

        }
    }

    public static void main(String[] args) {
        int arr[] = {1,7,4,5,6};
        selectionSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
