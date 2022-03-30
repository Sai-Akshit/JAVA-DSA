package com.dsa;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            //take operator as input
            System.out.print("Enter the operator: ");
            char op = input.next().trim().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.println("Enter number1: ");
                int num1 = input.nextInt();
                System.out.println("Enter number2: ");
                int num2 = input.nextInt();
                    if (op == '+') {
                        System.out.println("Addition: " + (num1+num2));
                    }
                    if (op == '-') {
                        System.out.println("Subtraction: " + (num1-num2) );
                        int ans = num1 - num2;
                        System.out.println("Absolute value: " + Math.abs(ans));
                    }
                    if (op == '*') {
                        System.out.println("Multiplication: "+ (num1 * num2));
                    }
                    if (op == '/') {
                        if (num2 != 0) {
                            System.out.println("Division: " + num1/num2);
                        } else {
                            System.out.println("Number 2 cannot be zero");
                        }
                    }
                    if (op == '%') {
                        System.out.println("Remainder: " + num1 % num2);
                    }
            } else if (op == 'x' || op == 'X') {
                System.out.println("Thank you for using :)");
                break;
            } else {
                System.out.println("Invalid operator input!!");
            }
        }
    }
}
