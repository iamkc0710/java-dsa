package JavaStrings;

public class StringCompression {

    public static String toCompression(String str){
        StringBuilder sb = new StringBuilder(" ");
        int size = str.length();

        for (int i = 0; i < size; i++) {
            Integer count = 1;

            while (i < size-1 && str.charAt(i) == str.charAt(i+1)){ 
                count++;
                i++;
            }

            sb.append(str.charAt(i));
            if(count > 1){
                sb.append(count.toString());
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "aaabccd";

        System.out.println(toCompression(str));
        
    }
}
