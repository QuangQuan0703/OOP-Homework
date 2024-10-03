package org.example.lab2;

import java.util.Scanner;

public class GradesStatistics {

    enum ChoesTypeSearch {SEARCH_MIN, SEARCH_MAX};

    static Scanner scanner = new Scanner(System.in);

    public GradesStatistics() {
        simpleGradesStatistics();
    }

    int[] generateStudentGrades(Scanner in) {
        int numStudents = Integer.parseInt(in.nextLine().trim());
        String captionEnterStudent = "Enter the grade for student ";
        int[] studentGrades = new int[numStudents];


        for (int idcStudent = 0; idcStudent < numStudents; idcStudent++) {
            System.out.println(captionEnterStudent + idcStudent + ": ");
            studentGrades[idcStudent] = Integer.parseInt(in.nextLine().trim());
        }
        return studentGrades;
    }

    void simpleGradesStatistics() {
        String caption = "Enter the number of students: ";
        System.out.println(caption);
        int[] studentGrades = generateStudentGrades(scanner);
        double averageGrade = average(studentGrades);
        int min = searchMinMx(studentGrades, ChoesTypeSearch.SEARCH_MIN);
        int max = searchMinMx(studentGrades, ChoesTypeSearch.SEARCH_MAX);
        System.out.println("The a verage is:" + averageGrade);
        System.out.println("The minimum is: " + min);
        System.out.println("The maximum is: " + max);
    }

    double average(int[] studentGrades) {
        double sum = 0;
        for (int student : studentGrades) {
            sum += student;
        }
        return Math.round((sum / studentGrades.length) * 100) / 100;
    }

    int searchMinMx(int[] studentGrades, ChoesTypeSearch choesTypeSearch) {
        int valueOfSearch = 0;
        switch (choesTypeSearch) {
            case SEARCH_MIN:
                valueOfSearch = Integer.MAX_VALUE;
                for (int student : studentGrades) {
                    valueOfSearch = valueOfSearch > student ? student : valueOfSearch;
                }
                break;
            case SEARCH_MAX:
                valueOfSearch = Integer.MIN_VALUE;
                for (int student : studentGrades) {
                    valueOfSearch = valueOfSearch < student ? student : valueOfSearch;
                }
                break;
        }

        return valueOfSearch;
    }

}
