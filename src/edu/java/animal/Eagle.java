package edu.java.animal;

public class Eagle extends Animal {

public Eagle() {this.sort="조류";
this.name="독수리";}
    public void sound() {
        System.out.println(sort+"의 "+name+"는 짖지 못합니다");
    }
//안하도록 오버라이딩

}

