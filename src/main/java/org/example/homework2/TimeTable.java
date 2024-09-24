package org.example.homework2;

import java.util.Scanner;

public class TimeTable {
    static Scanner scanner = new Scanner(System.in);
    public TimeTable() {
        testTimeTable();
    }

    private void testTimeTable() {
        String caption = "Enter the size";
        System.out.println(caption);
        int size = scanner.nextInt();
        timeTable(size);
    }

    private void timeTable(int size) {
        String character = "*";
        String format = "%3s";
        for( int row = 0; row <= size + 1; row++) {
            for( int col = 0; col <= size; col++) {
                if(col == 0 && row == 0) {
                    System.out.printf(format + "  |", character);
                }
                else if (row == 0 && col != 0){
                    System.out.printf("%5s", col);
                }
                else if (row == 1 ){
                    System.out.printf("_____");
                }
                else if ( row > 1 && col == 0 ){
                    System.out.printf(format + "  |", row - 1);
                }
                else if ( row > 1 && col > 0 ){
                    System.out.printf("%5s" , (row - 1)*col);
                }
            }
            System.out.println();
        }
    }

}
