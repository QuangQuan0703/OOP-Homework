package org.example.homework2.method;

public class TrigonometricsSeries {


    public TrigonometricsSeries() {
        testTrigonometricsSeries();
    }

    private void testTrigonometricsSeries() {
        System.out .println("Sin of pi/2: " + Math.sin(Math.PI / 2));
        System.out.println("sin of pi/2: " + sin(Math.PI / 2, 10));
        System.out .println("cos of pi/2: " + Math.cos(Math.PI / 3 * 2));
        System.out.println("cos of pi/2: " + cos(Math.PI / 3 * 2, 10));
    }

    public static double sin(double x, int numTerms) {
        double result = 0;
        for (int i = 0; i <= numTerms; i++) {
            result += pow(-1, i)*pow(x, i*2 +1)/exponential(i*2 +1);
        }
        return result;
    }

    public static double cos(double x, int numTerms) {
        double result = 0;
        for (int i = 0; i <= numTerms; i++) {
            result += pow(-1, i)*pow(x, i*2 )/exponential(i*2 );
        }
        return result;
    }
    static double pow(double x, int n) {
        double result = 1;
        for (int i = 0; i < n; i++) {
            result *= x;
        }
        return result;
    }
    static double exponential(int n) {
        double result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
