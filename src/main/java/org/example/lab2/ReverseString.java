package org.example.lab2;

import java.util.Scanner;

public class ReverseString {
    Scanner scanner = new Scanner(System.in);
    String inStr = "";
    int inStrLen = Integer.MIN_VALUE;
    public ReverseString(){
        testReverseString();
    }
    public  ReverseString(boolean check){}

    void testReverseString(){
        System.out.println("Enter a string: ");
        inStr = scanner.next();
        inStrLen = inStr.length();
        String reverseStringResult = reverseString();
        System.out.println("The reverse of the String " + inStr  + " is "+ reverseStringResult);
    }

    String reverseString(){
        String reverseStringResult = "";
        for (int charIdx = inStrLen - 1; charIdx >= 0; charIdx --) {
            reverseStringResult += inStr.charAt(charIdx);
        }
        return reverseStringResult;
    }
}
