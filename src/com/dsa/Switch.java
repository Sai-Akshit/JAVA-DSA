package com.dsa;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.next();

        switch (fruit) {
            case "mango" -> System.out.println("King of fruits");
            case "apple" -> System.out.println("Sweet red fruit");
            case "orange" -> System.out.println("Round fruit");
            default -> System.out.println("enter a valid fruit");
        }
    }
}
