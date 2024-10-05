package org.example.lab3;

public class Recursion {


    public Recursion() {
        testRecursion();
    }

    private void testRecursion() {
       // lengthOfNumberSequence(12);
        System.out.println("gcd 30 12 : " + gcd(30,12));
    }

    public static int factorial(int n){
        return n==0 ? 1 : n*factorial(n-1);
    }
    public static int fibonacci(int n){
        if(n==0 ){
            return 0;
        }
        if(n==1 ){
            return 1;
        }
        else {
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static String lengthOfNumberSequence(int n ){
        String caption = "S(";
        if(n==1 ){
            caption = caption + "1) = " + 1;
            System.out.println(caption);
            return "1";
        }else {
            caption = caption + n + ") = " + lengthOfNumberSequence(n-1) + n;
            System.out.println(caption);
            return  lengthOfNumberSequence(n-1) + n;
        }
    }

    public static  int gcd (int a, int b){
        if (b == 0){
            return a;
        }else {
            return gcd(b,a % b );
        }
    }




}
