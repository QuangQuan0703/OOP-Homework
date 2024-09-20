package org.example.lab2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PhoneKeyPad {
    Map<String, Integer> mappingToDigits = new HashMap<>();
    Scanner scanner = new Scanner(System.in);


    public PhoneKeyPad(){
        testPhoneKey();
    }

    void initMapping(){
        mappingToDigits.put("a", 2);
        mappingToDigits.put("b", 2);
        mappingToDigits.put("c", 2);
        mappingToDigits.put("d", 3);
        mappingToDigits.put("e", 3);
        mappingToDigits.put("f", 3);
        mappingToDigits.put("g", 4);
        mappingToDigits.put("h", 4);
        mappingToDigits.put("i", 4);
        mappingToDigits.put("j", 5);
        mappingToDigits.put("k", 5);
        mappingToDigits.put("l", 5);
        mappingToDigits.put("m", 6);
        mappingToDigits.put("n", 6);
        mappingToDigits.put("o", 6);
        mappingToDigits.put("p", 7);
        mappingToDigits.put("q", 7);
        mappingToDigits.put("r", 7);
        mappingToDigits.put("s", 7);
        mappingToDigits.put("t", 8);
        mappingToDigits.put("u", 8);
        mappingToDigits.put("v", 8);
        mappingToDigits.put("w", 9);
        mappingToDigits.put("x", 9);
        mappingToDigits.put("y", 9);
        mappingToDigits.put("z", 9);
    }
    void  testPhoneKey (){
        initMapping();
        System.out.println("Enter the phone number : ");
        String phoneStringPad = scanner.next();
        String phoneNumber = phoneKeyPad(phoneStringPad);
        System.out.println("Phone is: " +phoneNumber);
    }

    String phoneKeyPad(String inStr){
        String phoneKey = "";
        for(int charIndex = 0; charIndex < inStr.length(); charIndex++){
            char charValueOfIngdex = inStr.charAt(charIndex);
            phoneKey += mappingToDigits.get(Character.toString(charValueOfIngdex)).toString();
        }
        return phoneKey;
    }


}
