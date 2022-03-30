package problems;

public class Fibonacci {
    static void Fibo(int n) {
        int a = 0;
        int b = 1;
        int count = 0;

        while (count < n) {
            System.out.print(a + " ");

            int c = a+b;
            a = b;
            b = c;
            count++;
        }
    }

    public static void main(String[] args) {
        Fibo(2);
    }
}
