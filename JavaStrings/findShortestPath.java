package JavaStrings;

public class findShortestPath {

    public static float isShortestPath(String str){
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'N' -> y++;
                case 'S' -> y--;
                case 'W' -> x--;
                default -> x++;
            }
        }
   
        int x1 = x*x;
        int y1 = y*y;

        return (float) Math.sqrt(x1+y1);
    }

    public static void main(String[] args) {
        String str = "WNEENESENNN";
        
        System.out.println(isShortestPath(str));

    }
}
