package org.example.lab2.method;

import java.util.Arrays;
import java.util.Scanner;

public class Exponent {
    public Exponent() {
        Scanner scanner = new Scanner(System.in);
        //testExponent();
        //testMagicSum(scanner);
        testArray();
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

    public void testMagicSum(Scanner scanner) {
        int sumMagic =0;
        int inputNumber = 0;
        final int SENTINEL = -1;
        String caption = "Enter a positive integer (or -1 to end): ";
        while (inputNumber != SENTINEL) {
            System.out.println(caption);
            inputNumber = scanner.nextInt();
            if(hasEight(inputNumber)) {
                sumMagic += inputNumber;
            }
        }
        System.out.println("The magic sum is: " + sumMagic);
    }
    public static boolean hasEight(int number) {
        String numberStr = String.valueOf(number);
        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) == '8') {
                return true;
            }
        }
        return false;
    }


    public void testArray(){
        int [] arrIntTest = {
            1, 2, 3, 452452, 3, 2346, 324, 52
        };
        print(arrIntTest);
        reverse(arrIntTest);
        print(arrIntTest);

    }

    public static void print(int [] array ){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1){
                result += array[i] + ",";
            }else {
                result += array[i];
            }
        }
        result += "]";
        System.out.println(result);
    }
    public static void print(double [] array ){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1){
                result += array[i] + ",";
            }else {
                result += array[i];
            }
        }
        result += "]";
        System.out.println(result);
    }
    public static void print(float [] array ){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1){
                result += array[i] + ",";
            }else {
                result += array[i];
            }
        }
        result += "]";
        System.out.println(result);
    }
    public static String arrayToString(int [ ] array){
        String result = "[";
        for (int i = 0; i < array.length; i++) {
            if(i != array.length-1){
                result += array[i] + ",";
            }else {
                result += array[i];
            }
        }
        result += "]";
        return result;
    }
    public static boolean contains(int [] array, int key){
        for (int i = 0; i < array.length; i++) {
            return array[i] == key;
        }
        return false;
    }
    public static int search(int [] array, int key){
        for (int i = 0; i < array.length; i++) {
            if(array[i] == key){
                return i;
            }
        }
        return -1;
    }
    public static boolean equals(int [] array1, int [] array2){
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                if(array1[i] != array2[i]){
                    return false;
                }
            }
            return true;
        }else {
            return false;
        }
    }

    public static int[] copyOf(int [] array, int newLength){
        int[] newArray = new int[newLength];
        for (int i = 0; i < newLength; i++) {
            newArray[i] = array[i];
        }
        return newArray;
    }

    public static boolean swap(int [] array1, int[] array2){
        if(array1.length == array2.length){
            for (int i = 0; i < array1.length; i++) {
                int temp = array1[i];
                array1[i] = array2[i];
                array2[i] = temp;
            }
            return true;
        }else {
            return false;
        }
    }

    public static void reverse(int [] array){
        for(int fIdx = 0, bIdx = array.length - 1; fIdx < bIdx; fIdx++){
            int temp = array[fIdx];
            array[fIdx] = array[bIdx];
            array[bIdx] = temp;
        }
    }
}
