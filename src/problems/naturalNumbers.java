package problems;

import java.util.Scanner;

public class naturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        for (int i = 1; i<=num; i++) {
            System.out.print(i);
        }
    }
}
