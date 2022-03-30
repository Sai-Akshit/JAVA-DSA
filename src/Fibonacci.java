public class Fibonacci {
    public static void main(String[] args) {
        int a = 12345;
        String rev_num = "";

        while (true) {
            int b = a%10;
            rev_num += b;
            a = a - (b*10);
            if (a<=0) {
                break;
            }
        }
        System.out.println(rev_num);
    }
}
