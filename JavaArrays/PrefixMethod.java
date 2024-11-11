public class PrefixMethod {

    public static void MaxSubArray(int arr[]){
        int currentSum = 0;
        int maxValue = Integer.MIN_VALUE;
        int prefixArr[] = new int[arr.length];

        prefixArr[0] = arr[0];

        for(int i=1; i<prefixArr.length; i++){
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                currentSum = i == 0 ? prefixArr[j] : prefixArr[j] - prefixArr[i-1];

                if(currentSum > maxValue){
                    maxValue = currentSum;
                }
            }
        }

        System.out.println("The maximum number of sub array : " +maxValue );

    }

    public static void main(String[] args) {
        
        int arr[] = {2,4,6,9,5};
        MaxSubArray(arr);
    }
}
