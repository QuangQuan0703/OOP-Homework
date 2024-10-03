package org.example.homework2.nestedloops;

import java.util.Scanner;

public class CheckerPattern {
    Scanner scanner = new Scanner(System.in);
    public CheckerPattern() {
        testCheckerPatter();
    }

    private void testCheckerPatter() {
        String caption = "Enter the size: ";
        System.out.println(caption);
        int size = scanner.nextInt();
        checkerPatter(size);
    }

    private void checkerPatter(int size) {
        String character = "#";
        for(int row = 0; row < size; row++) {
            for(int col = 0; col < size; col++) {
                if(row % 2 != 0 && col == 0){
                    System.out.print( " " + character + " ");
                }else {
                    System.out.print( character + " ");
                }
            }
            System.out.println();
        }
    }
}
