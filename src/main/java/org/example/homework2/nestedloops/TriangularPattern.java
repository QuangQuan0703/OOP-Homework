package org.example.homework2.nestedloops;

import java.util.Scanner;

public class TriangularPattern {

    static Scanner scanner = new Scanner(System.in);
    public TriangularPattern() {
        testTriangularPattern();
    }

    private void testTriangularPattern() {
        String caption = " Enter the size: ";
        System.out.println(caption);
        int size = scanner.nextInt();
        triangularPatter(size);
    }

    private void triangularPatter(int size) {
        int numberShape = 4;
        for(int row = 0; row < size; row++) {
            for( int indexShape = 1; indexShape <= numberShape; indexShape++) {
                for( int column = 0; column < size; column++ ) {
                    printShapeTriangular(indexShape, column, row, size);
                }
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int indexShape = 1; indexShape <= numberShape; indexShape++) {
            String caption = "("+indexShape+")";
            System.out.printf("%" + (size + 3) + "s" + " ".repeat(size - 2), caption );
        }

    }

    void  printShapeTriangular(int type, int column, int row, int size){
        switch (type){
            case 1:
                if(row >= column){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
                break;
            case 2:
                if(row + column <= size - 1 ){
                    System.out.print("# ");
                }else {
                    System.out.print("  ");
                }
                break;
            case 3:
                if(row > column){
                    System.out.print("  ");
                }else {
                    System.out.print("# ");
                }
                break;
            case 4:
                if(row + column < size - 1){
                    System.out.print("  ");
                }else {
                    System.out.print("# ");
                }
                break;
        }
    }
}
