package JavaArrays;

public class LargestNumber {

    public static int findLargestNum(int arr[]){
        int largeNum = 0;

        for(int i = 0; i < arr.length; i++){
            if(largeNum < arr[i]){
                largeNum = arr[i];
            }
        }
        return largeNum;
    }

    public static void main(String[] args) {
        int arr[] = {2,4,16,8,10};

        System.out.println("Largest Number is : " +findLargestNum(arr));
    }
}
