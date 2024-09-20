package org.example.lab2;

import java.util.Scanner;

public class DecipherCaesarsCode {

    int replaceLetter = 3;
    Scanner scanner = new Scanner(System.in);
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public DecipherCaesarsCode() {
        testDecipherCaesarCode();
    }

    private void testDecipherCaesarCode() {
        System.out.println("Enter a plaintext string: ");
        String input = scanner.next();
        String code = decipherCaesarCode(input);
        System.out.println("The ciphertext string is :" +code);
    }

    private String decipherCaesarCode(String input) {
        String code = "";
        for(int charIndex = 0; charIndex < input.length(); charIndex++){
            int indexOfCharInAlphabet = alphabet.indexOf(input.toLowerCase().charAt(charIndex));
            if(indexOfCharInAlphabet - replaceLetter < 0){
                code += Character.toString( alphabet.charAt(alphabet.length() - 1 +(indexOfCharInAlphabet - replaceLetter)));
            }else {
                code += Character.toString(alphabet.charAt(indexOfCharInAlphabet - replaceLetter));
            }
        }
        return code.toUpperCase();
    }
}
