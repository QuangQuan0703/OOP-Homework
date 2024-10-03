package org.example.lab2;

import java.util.Scanner;

public class Exponent {
    public Exponent() {
        testExponent();
    }

    private void testExponent() {
        Scanner scanner = new Scanner(System.in);
        String enterBase = "Enter the base: ";
        String enterExponent = "Enter the exponent: ";
        System.out.print("Enter the base: ");
        int base = scanner.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = scanner.nextInt();
        String resultStr = base + " raises to the power of "  + exponent + " is: " ;
        int result =  exponent(base, exponent);
        System.out.println(resultStr + result);
    }

    private int exponent(int base, int exponent) {
        int result = 1;
        for (int count = 0; count < exponent; count++) {
            result = result*base;
        }
        return result;
    }
}
