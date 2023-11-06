package edu.java;

public class MathTest extends Test{
    MathTest() {}

    MathTest(int point) {this.point=point;}

    void point(int month, int days) {
        System.out.println(month+"월"+days+"일에 본 수학 성적은 "+point+"점입니다.");
    }
}
