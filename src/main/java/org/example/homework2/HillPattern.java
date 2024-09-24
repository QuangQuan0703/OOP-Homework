package org.example.homework2;

import java.util.Scanner;

public class HillPattern {
    static Scanner scanner = new Scanner(System.in);

    public HillPattern() {
        testHillPattern();
    }

    private void testHillPattern() {
        String caption = "Enter the rows: ";
        System.out.println(caption);
        int rows = scanner.nextInt();
        hillPattern(rows);
    }

    private void hillPattern(int numberRows) {
        int number = 4;
        String character = " # ";
        String nonCharacter = "   ";
        for (int indexShape = 1; indexShape <= number; indexShape++) {
            String caption = "("+indexShape+")";
            if(indexShape < 3){
                printTriangular(numberRows, indexShape, "", character, nonCharacter);
                System.out.printf("%" + (numberRows*3 + 1) + "s" , caption);
                System.out.println();
            }else if(indexShape == 3) {
                printTriangular(numberRows, 1, "", character, nonCharacter);
                printTriangular(numberRows - 1, 2, "   ", character, nonCharacter);
                System.out.printf("%" + (numberRows*3 + 1) + "s" , caption);
                System.out.println();
            }else if(indexShape == 4) {
                printNonTriangular(numberRows, 1, "", nonCharacter, character);
                printNonTriangular(numberRows, 2, "", nonCharacter, character);
                System.out.printf("%" + (numberRows*3 + 1) + "s" , caption);
                System.out.println();
            }
        }
    }

    void printTriangular(int numberRows, int indexShape , String space , String character, String nonCharacter){
        for(int row = 1; row <= numberRows; row++){
            System.out.print(space);
            for (int colum = 1; colum <= numberRows*2 -1 ; colum++) {
                printHillShape(indexShape, row, colum, numberRows, character, nonCharacter);
            }
            System.out.println();
        }
    }

    void printNonTriangular(int numberRows, int indexShape , String space , String character, String nonCharacter){
        for(int row = 1; row <= numberRows; row++){
            System.out.print(space);
            for (int colum = 1; colum <= numberRows*2 -1 ; colum++) {
                printNonHillShape(indexShape, row, colum, numberRows, character, nonCharacter);
            }
            System.out.println();
        }
    }
    private void printNonHillShape(int indexShape, int row, int colum, int rows, String character, String nonCharacter) {
        switch (indexShape){
            case 1:
                if((row + colum > rows + 1) && (row > colum - rows + 1)){
                    System.out.print(character);
                }else {
                    System.out.print(nonCharacter);
                }
                break;
            case 2:
                if(colum <= rows){
                    if(row >= colum ){
                        System.out.print(nonCharacter);
                    }else {
                        System.out.print(character);
                    }
                }else {
                    if (row + colum < rows*2 ){
                        System.out.print(character);
                    }else {
                        System.out.print(nonCharacter);
                    }
                }
                break;

        }
    }


    private void printHillShape(int indexShape, int row, int colum, int rows, String character, String nonCharacter) {
        switch (indexShape){
            case 1:
                if((row + colum >= rows + 1) && (row >= colum - rows + 1)){
                    System.out.print(character);
                }else {
                    System.out.print(nonCharacter);
                }
                break;
            case 2:
                if(colum <= rows){
                    if(row > colum ){
                        System.out.print(nonCharacter);
                    }else {
                        System.out.print(character);
                    }
                }else {
                    if (row + colum <= rows*2 ){
                        System.out.print(character);
                    }else {
                        System.out.print(nonCharacter);
                    }
                }
                break;

        }
    }
}
