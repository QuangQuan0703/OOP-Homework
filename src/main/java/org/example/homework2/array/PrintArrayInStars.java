package org.example.homework2.array;

import java.util.Scanner;

public class PrintArrayInStars {
    static Scanner scanner = new Scanner(System.in);
    public PrintArrayInStars() {
        printArrayStars(scanner);
    }

    private void printArrayStars(Scanner scanner) {
        String numberCap = "Enter the number of items: ";
        System.out.print(numberCap);
        final String number = scanner.nextLine();
        String valueItemsCap = "Enter the value of all items (separated by space): ";
        System.out.print(valueItemsCap);
        final String [] arrayValueItems = scanner.nextLine().split(" ");
        for(int idx = 0; idx < arrayValueItems.length; idx++) {
            System.out.print(idx + ": ");
            for(int starNo = 1; starNo <= Integer.parseInt(arrayValueItems[idx]); starNo++) {
                System.out.print( " * ");
            }
            System.out.println("(" + arrayValueItems[idx] + ")");
        }

    }
}
