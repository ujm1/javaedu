package edu.java;

public class JavaVariable2 {

    int realnsi=1; //진짜 논스태틱 멤버변수
    {
        int nsi=1;  //안에서 선언했으니 지역변수, 안에서 못꺼냄
        realnsi=20; //안에서 변경했어도 밖에서 선언했으니 이 값이 출력된다
        realsi=3; //마찬가지. 스태틱블록에서 선언했지만 이 일반블록에서도 변경 가능
        //여기서 Class class1= new ClassA(); 라고 선언하면 (클래스 class1을 다른 곳에서 써놨다고 가정)
// 이 class1또한 지역 변수 취급, 그래서 여기서만 사용 가능
    }

    static int realsi=1; //진짜 스태틱 멤버변수
    static {
        int si=2; //안에서 선언했으니 지역변수, 안에서 못꺼냄
//        realnsi=4; //스태틱 블록 안엔 스태틱만 쓸 수 있다
        realsi=5; //이유는 모르지만 출력되지 않는다
    }

    public static void main(String[] args) {
        JavaVariable2 a= new JavaVariable2();
//        System.out.println(nsi);
//        System.out.println(a.nsi);
        System.out.println(a.realnsi);
//
//        System.out.println(si);
//        System.out.println(a.si);
        System.out.println(a.realsi);
    }
}
