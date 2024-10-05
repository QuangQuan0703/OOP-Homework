package org.example.lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberTheory {

    public NumberTheory() {
        testNumberTheory();
    }

    private void testNumberTheory() {
       // testPerfectAndDeficient();
        //testPrimeNumber();
        testPrimeFactors();
    }

    private void testPrimeFactors() {
        String caption = "Enter the upper bound: ";
        Scanner scanner = new Scanner(System.in);
        System.out.println(caption);
        int upperNumber = scanner.nextInt();
        String primeFactor = "These numbers are equal to the product of prime factors:";
        ArrayList<Integer> numbersPrimeFactor = new ArrayList<>();
        for (int i = 1; i <= upperNumber; i++){
            if(isProductOfPrimeFactors(i)){
                numbersPrimeFactor.add(i);
            }
        }
        Algorithms.printArray(numbersPrimeFactor);
        System.out.println("[" + numbersPrimeFactor.size() + " numbers  founs (" + (double)numbersPrimeFactor.size()/upperNumber*100 + "%)]");
    }

    private void testPrimeNumber() {
        String caption = "Enter the upper bound: ";
        Scanner scanner = new Scanner(System.in);
        System.out.println(caption);
        int upperNumber = scanner.nextInt();
        ArrayList<Integer> numbersPrime = new ArrayList<>();
        for (int i = 1; i <= upperNumber; i++){
            if(isPrime(i)){
                numbersPrime.add(i);
            }
        }
        Algorithms.printArray(numbersPrime);
        System.out.println("[" + numbersPrime.size() + " primes  founs (" + (double)numbersPrime.size()/upperNumber*100 + "%)]");
    }


    private void testPerfectAndDeficient() {
        String caption = "Enter the upper bound: ";
        Scanner scanner = new Scanner(System.in);
        String numberPerfectStr = "These numbers are perfect: ";
        String numberDeficientStr = "These numbers are neither deficient non perfect: ";
        ArrayList<Integer> numberPerfectList = new ArrayList<>();
        ArrayList<Integer> numberNonDeficientList = new ArrayList<>();
        System.out.println(caption);
        int upperBound = scanner.nextInt();
        for (int i = 1; i <= upperBound; i++) {
            boolean isPerfect = isPerfect(i);
            boolean isDeficient = isDeficient(i);
            if(isPerfect){
                numberPerfectList.add(i);
            }
            if(!isDeficient && !isPerfect){
                numberNonDeficientList.add(i);
            }
        }
        System.out.println(numberPerfectStr);
        Algorithms.printArray(numberPerfectList);
        System.out.println("[" + numberPerfectList.size() + " perfect number founs (" + (double)numberPerfectList.size()/upperBound*100 + "%)]");
        System.out.println(numberDeficientStr);
        Algorithms.printArray(numberNonDeficientList);
        System.out.println("[" + numberNonDeficientList.size() + " numbers found (" + (double)numberNonDeficientList.size()/upperBound*100 + "%)]");

    }

    public static boolean isProductOfPrimeFactors(int aPosInt){
        int primeFactors = 1;
        for (int i = 1; i < aPosInt; i++){
            if(aPosInt % i == 0 && isPrime(i)){
                primeFactors*= i;
            }
        }
        return primeFactors == aPosInt;
    }


    public static boolean isPrime(int aPosInt) {
        if (aPosInt <= 3 && aPosInt >0) {
            return  true;
        }else {
            for(int i = 2; i <= Math.sqrt(aPosInt); i++){
                if(aPosInt % i == 0){
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean isPerfect(int aPosInt){
        int divisor = 0;
        int numberCount = 1;
        while (numberCount <= aPosInt/2){
            if(aPosInt % numberCount == 0){
                divisor += numberCount;
            }
            numberCount++;
        }

        return  divisor == aPosInt;

    }
    public static boolean isDeficient(int aPosInt){
        int divisor = 0;
        int numberCount = 1;
        while (numberCount <= aPosInt/2){
            if(aPosInt % numberCount == 0){
                divisor += numberCount;
            }
            numberCount++;
        }

        return  divisor < aPosInt;
    }

}

