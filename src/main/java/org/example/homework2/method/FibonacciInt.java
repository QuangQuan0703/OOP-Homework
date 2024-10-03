package org.example.homework2.method;

public class FibonacciInt {
    public FibonacciInt() {
        testFibonacciInt();
    }

    private void testFibonacciInt() {
        int idxFirst = 1;
        int idxSecond = 1;
        int fibonacci = 0;
        int count = 0;
        while (fibonacci > -1 ){

            if(count < 2){
                System.out.println("F(" + count + ") = " + 1);
            }else {
                fibonacci = idxFirst + idxSecond;
                idxFirst = idxSecond;
                idxSecond = fibonacci;
                System.out.println("F(" + count + ") = " + fibonacci);
            }
            count++;
            if(Integer.MAX_VALUE - idxSecond < idxFirst) {
                fibonacci = -1;
            }

        }
    }
}
