package org.example.lab3;

import org.example.lab2.PrintArray;

import java.util.ArrayList;
import java.util.Arrays;

public class Algorithms {

    public Algorithms() {
        testAlgorithms();
    }

    private void testAlgorithms() {
        int [] arrayTest = { 5,6,8,17,9,1,0,2,1,15,8,6 };
        int [] arrayTest1 = {9,6,4,1,5};
        //boolean searchBinaryArray = binarySearch(arrayTest, 10, 0, arrayTest.length - 1);
        //System.out.println("10 is " +  searchBinaryArray + " in array ");
       // bubbleSort(arrayTest);
        //selectionSort(arrayTest1);
        insertionSort(arrayTest1);

    }

    public static boolean linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return true;
            }
        }
        return false;
    }

    public static int linearSearchIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public boolean binarySearch(int[] arr, int target, int fromIdx, int toIdx) {
        if (fromIdx <= toIdx) {
            int midIdx = (fromIdx + toIdx) / 2;

            if (arr[midIdx] == target) {
                return true;
            }
            if (arr[midIdx] > target) {
                return binarySearch(arr, target, fromIdx, midIdx - 1);
            }
            return binarySearch(arr, target, midIdx + 1, toIdx);
        }
        return false;
    }

    public static void bubbleSort(int[] arr) {
        int [] arrCopy = arr ;
        for (int i = 0; i < arr.length; i++) {
            for( int j = 0 ; j < arr.length - i - 1; j++ ) {

                if(arrCopy[j] > arrCopy[j+1]) {
                    PrintArray.printArray(arrCopy);
                    int temp = arrCopy[j];
                    arrCopy[j] = arrCopy[j+1];
                    arrCopy[j+1] = temp;
                    PrintArray.printArray(arrCopy);
                }

            }
        }
    }

    public static void selectionSort( int []array){

        for (int i = 0; i < array.length - 1; i++) {
            int minValueOfArrayIdx = i;
            PrintArray.printArray(array);
            for (int j = i+1; j < array.length; j++) {
                if(array[minValueOfArrayIdx] > array[j]){
                    minValueOfArrayIdx = j;
                }
            }
            int temp = array[minValueOfArrayIdx];
            array[minValueOfArrayIdx] = array[i];
            array[i] = temp;
            PrintArray.printArray(array);
        }
    }

    public static  void insertionSort( int []array){
        for(int i = 1; i < array.length; i++){
            int key = array[i];
            int j = i - 1;
            PrintArray.printArray(array);
            while(j >= 0 && array[j] > key){
                array[j+1] = array[j];
                j = j - 1;
            }
            array[j+1] = key;
            PrintArray.printArray(array);
        }
    }

    public static void printArray(ArrayList arr) {
        String caption = "The values are: ";
        String result = "";
        for (int index = 0; index < arr.size(); index++) {
            if(index == 0){
                result += "[" + arr.get(index) + ",";
            }else if(index == arr.size()-1){
                result +=  arr.get(index) + "]";
            }else {
                result += arr.get(index) + ",";
            }
        }
        System.out.println(
                caption + result + "\n"
        );
    }

}
