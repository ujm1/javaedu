package edu.java;

public class Exam7 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*");
            }

            for (int l = 1; l < i; l++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int a = 0; a <= 1; a++) {


            for (int b = 0; b <= a; b++) {
                System.out.print(" ");
            }
            for (int c = 0; c < 1-a; c++) {
                System.out.print("*");
            }

            for (int d = 0; d <= 1-a; d++) {
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
