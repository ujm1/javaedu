package edu.java;

public class TypeCastingMain {
    public static void main(String[] args) {

         Parent parent2=new Child();  //자동형변환
        System.out.println(parent2.getName()); //이러면 Child가 나온다. parent의 변수와 void만 쓸 수 있지만 값(참조값)은 오버라이딩


       Child child2=(Child) new Parent();     //명시적 형변환이나 실제론 Array 오류
       Parent parent3=new Child();
        Child child3=(Child) parent3;  //오류 없이 강제형변환 가능

        System.out.println(child3.getName());

    }
}
