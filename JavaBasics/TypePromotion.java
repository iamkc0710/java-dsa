public class TypePromotion {
    public static void main(String args[]){
        char a = 'a';
        char b = 'b';

        System.out.println(a);
        System.out.println((int) b);
        System.out.println(b-a);

        byte bt = 5;
        byte bt1 = (byte) (bt * 5);
        System.out.println(bt1);


    }
}
