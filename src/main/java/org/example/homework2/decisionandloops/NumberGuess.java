package org.example.homework2.decisionandloops;

import java.util.Scanner;

public class NumberGuess {
    private  static Scanner scanner = new Scanner(System.in);

    public NumberGuess() {
        NumberGuess.guessNumber();
    }
    public  static  void guessNumber(){
        final int SECRET_NUMBER = (int)(Math.random()*100);
        System.out.println("Key in your guess: ");
        guessNumber(SECRET_NUMBER, scanner);
    }
    public static void guessNumber(int number, Scanner scanner) {
        int countTrials = 0;
        final String lower = "Try lower";
        final String higher = "Try higher";
        int guess;
        do {
            guess =  Integer.parseInt(scanner.nextLine().trim());
            countTrials++;
            if (guess != number){
                final String tryFinal = (guess > number) ? lower : higher;
                System.out.println(tryFinal);
            }else break;
        }
        while (guess != number);
        final  String result = "You got it in " + countTrials + " trials";
        System.out.println(result);
    }

}
