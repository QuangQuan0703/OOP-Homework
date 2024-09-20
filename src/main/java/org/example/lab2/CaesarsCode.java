package org.example.lab2;

import java.util.Scanner;

public class CaesarsCode {
    int replaceLetter = 3;
    Scanner scanner = new Scanner(System.in);
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public CaesarsCode() {
        testCipherCaesarCode();
    }

    void testCipherCaesarCode(){
        System.out.println("Enter a plaintext string: ");
        String input = scanner.next();
        String code = cipherCaesarCode(input);
        System.out.println("The ciphertext string is :" +code);
    }

    String cipherCaesarCode(String inStr){
        String code = "";
        for(int charIndex = 0; charIndex < inStr.length(); charIndex++){
            int indexOfCharInAlphabet = alphabet.indexOf(inStr.charAt(charIndex));
            if(indexOfCharInAlphabet + 3 > alphabet.length() - 1){
                code += Character.toString( alphabet.charAt(-(alphabet.length() - indexOfCharInAlphabet - replaceLetter - 1)));
            }else {
                code += Character.toString(alphabet.charAt(indexOfCharInAlphabet + replaceLetter));
            }
        }
        return code.toUpperCase();
    }



}
