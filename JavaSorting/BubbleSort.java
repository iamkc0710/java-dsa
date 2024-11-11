package JavaSorting;

public class BubbleSort {

    public static void bubbleSort(int arr[]){
        int temp = 0;
        int swap = 0;

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
               if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
               } 
            }

            if(swap == 0){
                System.out.println(swap);
                break;
            }
        }
        System.out.println(swap);


    }

    public static void main(String args[]){
        int arr[] = {1,2,7,4,5,6};
        bubbleSort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] +" ");
        }
    }
}
