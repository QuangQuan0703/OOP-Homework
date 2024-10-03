package org.example.homework2.nestedloops;

import java.util.Scanner;

public class SquarePattern {
    Scanner scanner = new Scanner(System.in);
    public SquarePattern() {
        testSquarePattern();
    }
    public  void testSquarePattern() {
        String caption = "Enter the size: ";
        System.out.println(caption);
        int size = scanner.nextInt();
        squarePattern(size);
    }
    public void squarePattern(int n) {
        String character = "#";
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                System.out.print(" " +  character);
            }
            System.out.println();
        }
    }
}
