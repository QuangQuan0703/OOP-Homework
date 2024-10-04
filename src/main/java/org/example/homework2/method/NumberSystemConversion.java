package org.example.homework2.method;

import java.util.Scanner;

public class NumberSystemConversion {
    public NumberSystemConversion() {
        testNumberConversion();
    }

    public void testNumberConversion() {
        String numberAndRadixCaption = "Enter a number and radix: ";
        String inputRadixStr = "Enter the input radix: ";
        String outputRadixStr = "Enter the output radix: ";
        Scanner scanner = new Scanner(System.in);
        System.out.println(numberAndRadixCaption);
        String numberAndRadixString = scanner.nextLine();
        System.out.println(inputRadixStr);
        int inputRadix = Integer.parseInt(scanner.nextLine());
        System.out.println(outputRadixStr);
        int outputRadix = Integer.parseInt(scanner.nextLine());
        String result = toRadix(numberAndRadixString, inputRadix, outputRadix);
        System.out.println(numberAndRadixString + " in radix " + inputRadix + " is " + result + " in radix " + outputRadix);
    }

    public static String toRadix(String in, int inRadix, int outRadix) {
        int inRadixToDecimal = radixToDecimal(in, inRadix);
        return  decimalToRadix(inRadixToDecimal, outRadix);

    }

    public static int radixToDecimal(String in, int inRadix) {
        int lengthInputStr = in.length();
        final int NUMBER_INPUT_RADIX = inRadix;
        int result = 0;

        for (int i = 0; i < lengthInputStr; i++) {
            result = result*NUMBER_INPUT_RADIX +  Character.digit(in.charAt(i), NUMBER_INPUT_RADIX);
        }
        return result;
    }
    public static String decimalToRadix(int input, int outRadix){
        int dividend = input;
        int divisor = outRadix;
        int modulo = 0;
        int numberQuotient = Integer.MAX_VALUE;
        String outputRadixStr = "";

        while (numberQuotient > 0) {
            numberQuotient = dividend / divisor;
            modulo = dividend - divisor * numberQuotient;
            outputRadixStr = Character.forDigit(modulo, outRadix) + outputRadixStr;
            dividend = numberQuotient;
        }
        return  outputRadixStr;
    }

    static String reverseString(String inputString) {
        String reverseStringResult = "";
        for (int charIdx = inputString.length() - 1; charIdx >= 0; charIdx--) {
            reverseStringResult += inputString.charAt(charIdx);
        }
        return reverseStringResult;
    }
}
