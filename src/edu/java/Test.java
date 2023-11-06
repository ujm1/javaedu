package edu.java;

public class Test {
    int point;

    Test() {}

    Test(int point) {this.point=point;
   }

    void result(int month,int days) {
        System.out.println(month + "월" + days + "일에 본 시험 성적은 " + point + "점입니다.");
    }
}
