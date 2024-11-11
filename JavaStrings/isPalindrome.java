package JavaStrings;

public class isPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        int size = str.length()-1;
        int flag = 0;

        for (int i = 0; i < size/2; i++) {
            if(str.charAt(i) != str.charAt(size - i)){
                System.out.println("This is not a Palindrome.");
                flag = 1;
                break;
            }
        }
    
        if(flag == 0){
            System.out.println("This is Palindrome");
        }
    }
}
