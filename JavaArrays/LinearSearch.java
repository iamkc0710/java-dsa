package JavaArrays;

public class LinearSearch {

    public static int linearSearch(int arr[], int key){
        for(int i =0; i < arr.length; i++){
            if(arr[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static int StringSearch(String menu[], String key){
        for(int i =0; i < menu.length; i++){
            if(menu[i] == key){
                return i;
            }
        }
        return -1;
    }
  
    public static void main(String[] args) {
        int arr[] = {2,6,4,8,10};
        // int key = 10;

        // if(linearSearch(arr, key) == -1){
        //     System.out.println("Key was not found.");
        // }
        // else{
        //     System.out.println("Key found at index : " +linearSearch(arr, key));
        // }

        String menu[] = {"Dosa", "Samosa", "Vadapav"};
        String key = "Vadapav";

        if(StringSearch(menu, key) == -1){
            System.out.println("Key was not found.");
        }
        else{
            System.out.println("Key found at index : " +StringSearch(menu, key));
        }
    }
}
