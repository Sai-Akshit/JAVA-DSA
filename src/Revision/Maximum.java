package Revision;

public class Maximum {
    static int max(int a, int b, int c) {
        if (a>=b && b>=c) {
            return a;
        } else if (b>=c && c>=a) {
            return b;
        } else if (c>=a && a>=b) {
            return c;
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(max(10, 30, 20));
    }
}
