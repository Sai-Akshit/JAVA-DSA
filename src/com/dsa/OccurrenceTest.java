package com.dsa;

import java.util.Scanner;

public class OccurrenceTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();
        System.out.print("Enter the number you want to check for occurrence: ");
        int num1 = input.nextInt();

        int count = 0;

       while (num > 0) {
           int rem = num % 10;
            if (rem == num1) {
                count++;
            }
            num = num / 10;
       }
        System.out.println(count);
    }
}
