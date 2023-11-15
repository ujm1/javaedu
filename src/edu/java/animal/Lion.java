package edu.java.animal;

public class Lion extends Animal {

public Lion() {
    this.sort="포유류";
    this.name="사자";
}

    public void fly() {
        System.out.println(sort+"의 " +name+"는 날지 못합니다");
    }
//안하도록 오버라이딩
}
