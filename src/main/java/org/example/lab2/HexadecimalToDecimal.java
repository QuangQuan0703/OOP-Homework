package org.example.lab2;

import java.util.Scanner;

public class HexadecimalToDecimal {
    Scanner scanner = new Scanner(System.in);
    String hex = "0123456789abcdef";

    public HexadecimalToDecimal() {
        testHexadecimalToDecimal();
    }
    public HexadecimalToDecimal(boolean  check ) {
    }

    private void testHexadecimalToDecimal() {
        System.out.println("Enter a Hexadecimal String: ");
        String hexStr = scanner.next();
        int hexadecimalToDecimal = hexadecimalToDecimal(hexStr.toLowerCase());
        String result = "The equivalent decimal number for Hexadecimal " + hexStr + " is : " + hexadecimalToDecimal;
        String error = "error : invalid binary string " + hexStr;
        String printResult = hexadecimalToDecimal == -1 ? error : result;
        System.out.println(printResult);
    }

    public int hexadecimalToDecimal(String hexStr) {
        int decimal = 0;
        boolean check = new CheckHexString(true).isHexString(hexStr);
        if (check) {
            for (int charIndex = 0; charIndex < hexStr.length(); charIndex++) {
                int numberChar = hex.indexOf(hexStr.charAt(hexStr.length() -charIndex - 1)) ;
                decimal += numberChar * Math.pow(16,charIndex);
            }
            return decimal;
        } else return -1 ;
    }
}
