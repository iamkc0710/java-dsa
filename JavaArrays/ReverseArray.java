public class ReverseArray {

    public static void reverseArray(int arr[]){
        int first = 0, last = arr.length - 1;

        while(first != last){
            int swap = arr[first];
            arr[first] = arr[last];
            arr[last] = swap;

            first++;
            last--;
        }

    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,9,5,6};
        reverseArray(arr);

        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] +" ");
        }
    }
}
