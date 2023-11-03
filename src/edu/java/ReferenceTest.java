package edu.java;

public class ReferenceTest {


    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("ㅇ");
        person1.setNsi(10);
        System.out.println(person1);

        System.out.println(person2.si);
        person1.setName("홍길동");
        person2.setName("홍길동");

        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person1.name.hashCode());
        System.out.println(person2.name.hashCode());
        System.out.println(new String("홍길동").hashCode());
        System.out.println(person1.name==person2.name);


        System.out.println(person1.name==person2.name);
        System.out.println(person1.nsi==person2.nsi);
    }
}
