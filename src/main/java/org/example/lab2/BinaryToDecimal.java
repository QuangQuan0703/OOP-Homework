package org.example.lab2;

import java.util.Scanner;

public class BinaryToDecimal {
    Scanner scanner = new Scanner(System.in);
    String valid = "01";

    public BinaryToDecimal() {
        testBinaryDecimal();
    }

    void testBinaryDecimal() {
        System.out.println("Enter a binary String: ");
        String binaryString = scanner.next();
        int binaryToDecimal = binaryToDecimal(binaryString);
        String result = "The equivalent decimal number for binary " + binaryString + " is : " + binaryToDecimal;
        String error = "error : invalid binary string " + binaryString;
        String printResult = binaryToDecimal == -1 ? error : result;
        System.out.println(printResult);

    }

    int binaryToDecimal(String binary) {
        int decimal = 0;
        if (checkValid(binary)) {
            for (int charIndex = 0; charIndex < binary.length(); charIndex++) {
                int numberChar = Integer.parseInt(String.valueOf(binary.charAt(binary.length() - 1 - charIndex)));
                decimal += numberChar * Math.pow(2, charIndex);
            }
            return decimal;
        } else {
            return -1;
        }
    }


    private boolean checkValid(String binary) {
        for (int charIndex = 0; charIndex < binary.length(); charIndex++) {
            if (valid.indexOf(binary.charAt(charIndex)) == -1) {
                return false;
            }
        }
        return true;
    }
}
