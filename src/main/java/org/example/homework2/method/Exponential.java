package org.example.homework2.method;

import java.util.Scanner;

public class Exponential {
    Scanner scanner = new Scanner(System.in);

    public Exponential() {
        testSpecialSeries();
    }

    private void testSpecialSeries() {
        String caption = "Enter x and numTerms: ";
        System.out.print(caption);
        String[] input = scanner.nextLine().trim().split(" ");
        double x = Double.parseDouble(input[0]);
        int numTerms = Integer.parseInt(input[1]);
        double result = specialSeries(x, numTerms);
        System.out.println("Result: " + result);
    }

    private double specialSeries(double x, int numTerms) {
        double result = 0;
        double powX = x;
        for (int i = 1; i <= numTerms; i++) {
            double multi = multiply(i*2-1);
            double denominator = (2*i-1);
            if(i != 1){
                powX *= Math.pow(x,2);
            }
            result += powX*multi/denominator;
        }
        return result;
    }

    private double multiply(int n ){
        double result = 1;
        if(n == 1){
            return 1;
        }else {
            for (int i = 1; i < n ; i = i+ 2) {
                result *= (double) (i) /(i + 1);
            }
            return result;
        }
    }
}
