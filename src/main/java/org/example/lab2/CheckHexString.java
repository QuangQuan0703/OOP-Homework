package org.example.lab2;

import java.util.Scanner;

public class CheckHexString {
    Scanner scanner = new Scanner(System.in);
    String charIsHex = "0123456789abcdef";

    public CheckHexString() {
        testHexString();
    }

    public CheckHexString(boolean check) {

    }

    void testHexString() {
        System.out.println("Enter a hex string:");
        String input = scanner.next();
        String check = isHexString(input) ? "" : "NOT";
        System.out.println(input + " is " + check + " a hex string");

    }

    boolean isHexString(String hexString) {
        for (int charIndex = 0; charIndex < hexString.length(); charIndex++) {
            if (charIsHex.indexOf(hexString.toLowerCase().charAt(charIndex)) == -1) {
                return false;
            }
        }
        return true;
    }
}
