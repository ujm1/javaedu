package edu.java;

public class Exam6 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }
            for (int q = 0; q < i; q++) {
                System.out.print("*");
            }

            for (int k = 1; k < i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        for (int a = 0; a <5; a++) {
            for (int b = 1; b < (5-a); b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < (2*a+1); c++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
