package edu.java;

public class Exam7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int k = 3; k <= 5; k++) {
            for (int q = 0; q <= 5 - k; q++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}


