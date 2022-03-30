package com.dsa;

import java.util.Scanner;

public class Functions {

    static void greet(String s) {
        System.out.println("Hello "+s);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        greet(name);
    }
}
