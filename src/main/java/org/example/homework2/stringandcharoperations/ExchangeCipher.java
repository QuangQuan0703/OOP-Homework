package org.example.homework2.stringandcharoperations;

import java.util.Scanner;

public class ExchangeCipher {
    static Scanner scanner = new Scanner(System.in);
    static final  String alphabet = "abcdefghijklmnopqrstuvwxyz";
    static final  String digits = "0123456789";

    public ExchangeCipher() {
        testExchangeCipher();
    }

    private void testExchangeCipher() {
        String caption = "Enter a plaintext string: ";
        String text = scanner.nextLine().trim().toLowerCase();
        String resultCaption = "The ciphertext string is: ";
        String textCipher = exchangeCipher(text);
        System.out.println(resultCaption +  textCipher);
    }

    private String exchangeCipher(String text) {
        String [] arrayText = text.split("");
        String result = "";
        for( String character : arrayText){
            result  += Character.toString(alphabet.charAt(alphabet.length() - 1 - alphabet.indexOf(character)));
        }
        return result.toUpperCase();
    }
}
