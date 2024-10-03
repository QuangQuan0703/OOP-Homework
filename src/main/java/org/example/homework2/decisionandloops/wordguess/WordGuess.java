package org.example.homework2.decisionandloops.wordguess;


import org.example.homework2.utils.ReadTextFile;

import java.util.*;

public class WordGuess {
    static final  String pathProject= "/home/quan/Desktop/";
    static Scanner scanner = new Scanner(System.in);
    static final  String pathTextFile = "OOPCLASS/OOP-Class/src/main/java/org/example/homework2/wordguess/text.txt";
    static ArrayList<String> listStringData ;

    public WordGuess() {
        guessWord();
    }

    public static void guessWord() {
        String path = pathProject + pathTextFile;
        String textData = ReadTextFile.readFile(path).trim();
        //System.out.println(textData);
        listStringData =  ReadTextFile.filterCharacter(textData);
        String guessWord = ramdomGuessWord(listStringData);
        //System.out.println(guessWord);
        guessWord(guessWord, scanner);

    }

    // random string trong list string lay ra tu text file
    public static String ramdomGuessWord(ArrayList<String> listWord) {
        String guessWord = "";
        do {
            guessWord = listWord.get(new Random().nextInt(listWord.size()));
        }while (
                guessWord.equals("")
        );
        return guessWord;
    }
    public static void guessWord(String guessdString, Scanner sacnner){

        String wordCheck = "_".repeat(guessdString.length()) ;
        String endGame = "Congratulation";
        int count = 0;
        String tryCount = "You got in " ;
        String enterGuessWord = "Key in one character or your guess word: ";
        do {
            count++;
            System.out.println(enterGuessWord + count);
            String inputGuess = sacnner.nextLine().trim().toLowerCase();
            if(inputGuess.length() <= 1 ){
                wordCheck = checkCorrectWord(inputGuess, wordCheck, guessdString);
               if(wordCheck.equals(guessdString)){
                   System.out.println(endGame);
                   System.out.println(tryCount + count + "trials");
                   break;
               }else {
                   System.out.println(wordCheck);
               }
            }else {
                if (inputGuess.equals(guessdString.toLowerCase())){
                    System.out.println(endGame);
                    System.out.println(tryCount + count + "trials");
                    break;
                }else {
                    System.out.println(wordCheck);
                }
            }
        }while (true);
    }

    // checkCorrectWord dùng để thay wordCheck đóan đúng vào wordTry gồm _____ khi so với wordSample
    public static String checkCorrectWord(String wordCheck, String wordTry, String wordSample){
        for(int indexOfWordInSample = 0 ; indexOfWordInSample < wordSample.length() ; indexOfWordInSample++){
            String wordCharacter= Character.toString(wordSample.charAt(indexOfWordInSample));
            if (wordCheck.equals(wordCharacter.toLowerCase())){
                wordTry = wordTry.substring(0,indexOfWordInSample) + wordCharacter + wordTry.substring(indexOfWordInSample + 1);
            }
        }
        return  wordTry;
    }
}
