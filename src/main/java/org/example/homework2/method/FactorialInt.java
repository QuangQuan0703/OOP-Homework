package org.example.homework2.method;

import java.util.Scanner;

public class FactorialInt {
    static Scanner scanner = new Scanner(System.in);
    public FactorialInt() {
        testFactorianlInt();
    }

    private void testFactorianlInt() {
        String caption = "The factorianl of ";
        int count = 1;
        int factorianl = 0;
        while (factorianl >= 0){
            factorianl = factorialInt( count, 1);

            if (factorianl == -1){
                System.out.println(caption + count + " is out range");
            }else {
                System.out.println(caption + count + " is " + factorianl);
            }
            count++;
        }

    }

    private int factorialInt(int count, int num) {
        int factor = num;
        for (int i = 1; i <= count; i++) {
            if(Integer.MAX_VALUE/ factor > i){
                factor *= i;
            }else {
                return  - 1;
            }
        }
        return factor;
    }
}
