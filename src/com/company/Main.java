package com.company;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final String alp = "abcdefghijklmnopqrstuvwxyz";

    public static String decrypt (String text, int key) {
        text = text.toLowerCase();
        String message = "";
        for (int i = 0; i < text.length(); i++){
            int pos = alp.indexOf(text.charAt(i));
            int val = (pos + key) % 26;
            char replace = alp.charAt(val);
            message += replace;
        }
        return message;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String message = new String();
        int key = 0;
        System.out.print("Enter string: ");
        message = sc.nextLine();
        System.out.println("Enter key: ");
        key = sc.nextInt();
        System.out.println("Encrypted message: " + decrypt(message, key));
    }
}
