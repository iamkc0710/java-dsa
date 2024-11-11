public class KadaneAlgorithm {

    public static void Kadanemethod(int arr[]){
        int currentSum = 0, maxValue = Integer.MIN_VALUE;


        for (int i = 0; i < arr.length; i++) {
            
            // if(currentSum + arr[i] > 0){
            //     currentSum += arr[i];
            // }

            currentSum += arr[i];

            if(currentSum < 0){
                currentSum = 0;
            }
    
            maxValue = Math.max(currentSum, maxValue);
        }

        System.out.println(maxValue);
    }

    public static void main(String[] args) {
        int arr[] = {-2};
        Kadanemethod(arr);
    }
}
