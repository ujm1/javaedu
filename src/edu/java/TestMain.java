package edu.java;

import static jdk.nashorn.internal.objects.NativeRegExp.test;

public class TestMain {
    public static void main(String[] args) {
        Test test=new Test();
        MathTest mathtest=new MathTest();
        test.point=10;
        mathtest.point=50;
        test.result(4,10);
        mathtest.result(5,2);
        Test test2= new Test(30);
        test2.result(10,30);
        MathTest mathtest2=new MathTest(78);
        mathtest2.result(12,12);
    }
}
