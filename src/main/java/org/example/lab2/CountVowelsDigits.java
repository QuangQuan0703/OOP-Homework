package org.example.lab2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CountVowelsDigits {
    String[] vowelsArr = {"a","e","i","o","u"};
    String[] digitsArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    Scanner scanner = new Scanner(System.in);
    public CountVowelsDigits() {
        testCountVowelsDigits();
    }
    void testCountVowelsDigits() {
        String inStr = "";
        int numberVowels = Integer.MIN_VALUE;
        int numberDigits = Integer.MIN_VALUE;
        System.out.println("Enter a String: ");
        inStr = scanner.next();
        numberVowels = countVowels(inStr);
        numberDigits = countDigits(inStr);
        System.out.println("Number of vowels: " + numberVowels + " (" + percentRound(numberVowels, inStr.length()) + "%)");
        System.out.println("Number of digits: " + numberDigits + " (" + percentRound(numberDigits, inStr.length()) + "%)");


    }

    double percentRound(double numerator,double denominator) {
        return Math.round((numerator/denominator*100)*100.0)/100.0;
    }
    int countVowels(String inStr) {
        int countNumberVowels = 0;
        for (int charIndex = 0; charIndex < inStr.length(); charIndex++) {
            if(match(vowelsArr, inStr.toLowerCase().charAt(charIndex))){
                countNumberVowels++;
            }
        }
        return countNumberVowels;
    }
    int countDigits(String inStr) {
        int countNumberDigits = 0;
        for (int charIndex = 0; charIndex < inStr.length(); charIndex++) {
            if(match(digitsArr, inStr.toLowerCase().charAt(charIndex))){
                countNumberDigits++;
            }
        }
        return countNumberDigits;
    }

    boolean match(String [] arr, char intStr){
        for (String valueStrOfArr : arr) {
            if(valueStrOfArr.equals(""+ intStr)){
                return true;
            }
        }
        return false;
    }
}
