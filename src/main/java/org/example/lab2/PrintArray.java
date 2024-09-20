package org.example.lab2;

import java.util.Scanner;

public class PrintArray {
    int NUM_ITEMS;
    int [] items ;
    public PrintArray() {
        createArray(new Scanner(System.in));
    }

    int[] createArray(Scanner scanner) {
        System.out.println("Enter the number of items: ");
        NUM_ITEMS = Integer.parseInt(Character.toString(scanner.nextLine().charAt(0)));
        items = new int[NUM_ITEMS];
        System.out.println("Enter the value of all items (separated by space): ");
        String input = scanner.nextLine();
        for(int indexArr = 0; indexArr < NUM_ITEMS; indexArr++) {
            items[indexArr] = Integer.parseInt(Character.toString(input.charAt(indexArr*2)));
        }
        printArray(items);
        return items;
    }

    void printArray(int[] arr) {
        String caption = "The values are: ";
        String result = "";
        for (int index = 0; index < arr.length; index++) {
            if(index == 0){
                result += "[" + arr[index] + ",";
            }else if(index == arr.length-1){
                result +=  arr[index] + "]";
            }else {
                result += arr[index] + ",";
            }
        }
        System.out.println(
                caption + result + "\n"
        );
    }
}
