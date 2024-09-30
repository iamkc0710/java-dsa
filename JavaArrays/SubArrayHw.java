public class SubArrayHw {

    /* public static void subArraysSum(int arr[]){

        int maxValue = 0, minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j <= arr.length; j++) {
                int sum = 0;
                for(int k = i; k < j ; k++){
                    sum += arr[k];
                }
                System.out.print(sum +" ");

                if(sum > maxValue){
                    maxValue = sum;
                }
                if(sum < minValue){
                    minValue = sum;
                }
            }
            System.out.println();
        }

        System.out.println("The maximum number of sub array is :" +maxValue);
        System.out.println("The minimum number of sub array is :" +minValue);

    } */

    public static void subArraysSumOptimize(int arr[]){
        int maxValue = 0;
        int minValue = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int currentSum = 0;
            for (int j = i; j < arr.length; j++){
                currentSum += arr[j];
                System.out.print(currentSum +" ");

                if (currentSum > maxValue) {
                    maxValue = currentSum;
                }
                if (currentSum < minValue) {
                    minValue = currentSum;
                }
            }

            System.out.println();
        }

        System.out.println("The maximum sum of subarrays is: " + maxValue);
        System.out.println("The minimum sum of subarrays is: " + minValue);
    }

    public static void main(String[] args) {
       
     int arr[]  = {3,-4,2,-8,15,1};

    // subArraysSum(arr);      // Find MAX MIN SUM of all sub arrays

       subArraysSumOptimize(arr);   // Find MAX MIN SUM of all sub arrays (Optimize Code)
    }
}

