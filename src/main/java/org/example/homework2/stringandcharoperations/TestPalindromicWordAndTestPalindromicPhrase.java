package org.example.homework2.stringandcharoperations;

import java.util.Scanner;

public class TestPalindromicWordAndTestPalindromicPhrase {

    public TestPalindromicWordAndTestPalindromicPhrase() {
        testPalindromicPhrase();
    }

    void testPalindromicPhrase(){
        Scanner scanner = new Scanner(System.in);
        String captionWord = "Enter the word";
        System.out.println(captionWord);
        String palindromicStr = cleanString(scanner.nextLine());
        String isPalindromic = isPalindromicPhrase(palindromicStr) ? " is a palindrome" : " is not a palindrome";
        System.out.println(palindromicStr.replaceAll(".", "X") + isPalindromic);

        String captionPhrase = "Enter phrase";
        System.out.println(captionPhrase);
        String phraseStr = scanner.nextLine();
        String isPhrase = isPalindromicPhrase(cleanString(phraseStr)) ? " is a palindrome " : " is not a palindrome";
        System.out.println(phraseStr  + isPhrase);


    }


    boolean isPalindromicWord(String inStr) {
        int fIdx = 0;
        int bIdx = inStr.length() - 1;
        while (fIdx < bIdx) {
            if (inStr.charAt(fIdx) != inStr.charAt(bIdx)) {
                return false;
            }
            fIdx++;
            bIdx--;
        }
        return true;
    }

    boolean isPalindromicPhrase(String inStr) {
        String phraseLeftToRight = inStr;
        boolean isPalindromic = isPalindromicWord(phraseLeftToRight);
        return isPalindromic;
    }

    private String cleanString(String inStr) {
        return inStr.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }


}
