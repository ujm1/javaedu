package edu.java.animal;

public abstract class Animal implements Walkable, Runnable,
    Flyable, Soundable {


    String sort;
    String name;
    //인터페이스는 상수랑 추상메소드밖에 못넣으니까 이런건 여기 추상클래스에

Animal() {}

    public void walk() {
        System.out.println(sort+"의 동물 "+name+"가 걷는다");
    }

    public void run() { System.out.println(sort+"의 동물 "+name+"가 뛴다");
    }

    public void fly() { System.out.println(sort+"의 동물 "+name+"가 난다");}

    public void sound() { System.out.println(sort+"의 동물 "+name+"가 짖는다");}




}
