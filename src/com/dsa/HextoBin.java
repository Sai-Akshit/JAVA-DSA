package com.dsa;
import java.util.*;

public class HextoBin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hex = scanner.next();
        hex = hex.toUpperCase();

        HashMap<Character, String> hashMap = new HashMap<>();

        hashMap.put('0', "0000");
        hashMap.put('1', "0001");
        hashMap.put('2', "0010");
        hashMap.put('3', "0011");
        hashMap.put('4', "0100");
        hashMap.put('5', "0101");
        hashMap.put('6', "0110");
        hashMap.put('7', "0111");
        hashMap.put('8', "1000");
        hashMap.put('9', "1001");
        hashMap.put('A', "1010");
        hashMap.put('B', "1011");
        hashMap.put('C', "1100");
        hashMap.put('D', "1101");
        hashMap.put('E', "1110");
        hashMap.put('F', "1111");

        char ch;
        String binary = "";
        for (int i=0; i<hex.length(); i++) {
            ch = hex.charAt(i);
            if (hashMap.containsKey(ch)) {
                binary += hashMap.get(ch);
            } else {
                System.out.print("Invalid Hexadecimal value");
            }
        }
        System.out.println(binary);

    }
}
