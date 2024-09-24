package org.example.homework2;

import java.util.Scanner;

public class BoxPattern {
    static Scanner scanner = new Scanner(System.in);
    public BoxPattern() {
        testBoxPattern();
    }

    private void testBoxPattern() {
        String caption = "Enter the size: ";
        System.out.println(caption);
        int size = scanner.nextInt();
        boxPattern(size);
    }

    private void boxPattern(int size) {
        int numberShape = 4;
        for(int row = 0; row < size; row++) {
            for( int indexShape = 1; indexShape <= numberShape; indexShape++) {
                for( int column = 0; column < size; column++ ) {
                    printShapeBox(indexShape, column, row, size);
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int indexShape = 1; indexShape <= numberShape; indexShape++) {
            String caption = "("+indexShape+")";
            System.out.printf("%" + (size + 3 + size/2) + "s" + " ".repeat(size - 2 + size/2), caption );
        }
    }
    void  printShapeBox(int type, int column, int row, int size){
        switch (type){
            case 1:
                if(row == 0 || row == size -1 || column == 0 || column == size -1){
                    System.out.print(" # ");
                }else {
                    System.out.print("   ");
                }
                break;
            case 2:
                if(row == 0 || row == size - 1 || column == row){
                    System.out.print(" # ");
                }else {
                    System.out.print("   ");
                }
                break;
            case 3:
                if(row == 0 || row == size - 1 || row == column){
                    System.out.print(" # ");
                }else {
                    System.out.print("   ");
                }
                break;
            case 4:
                if(row == 0 || row == size - 1 || row == column || column + row == size -1){
                    System.out.print(" # ");
                }else {
                    System.out.print("   ");
                }
                break;
        }
    }
}
