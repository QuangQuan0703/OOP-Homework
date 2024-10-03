package org.example.lab2;

import java.util.Scanner;

public class DecimalToHexadecimal {

    Scanner scanner = new Scanner(System.in);
    String hexaNum = "0123456789abcdef";


    public DecimalToHexadecimal() {
        testDecimalToHexadecimal();
    }

    private void testDecimalToHexadecimal() {
        String enterDecimal = "Enter a decim al number :";
        System.out.println(enterDecimal);
        int decimal = Integer.parseInt(scanner.nextLine());
        String hex = decimalToHexadecimal(decimal);
        System.out.println("The equivalent hexadecimal number is: " + hex);
    }

    String decimalToHexadecimal(int positiveInteger){
        String hexadecimal = "";
        int numberQuotient = Integer.MAX_VALUE;
        int dividend = positiveInteger;
        int divisor = 16;
        int modulo = 0;

        while (numberQuotient > 0  ){
            numberQuotient = dividend / divisor;
            modulo = dividend - divisor*numberQuotient;
            hexadecimal += hexaNum.charAt(modulo);
            dividend = numberQuotient;
        }
        return reverse(hexadecimal);
    }

    String reverse(String hexaNum){
        String reversed = "";
        for (int i = hexaNum.length() - 1; i >= 0; i--) {
            reversed += hexaNum.charAt(i);
        }
        return reversed;
    }
}
