package edu.java.animal;

public class Main {

    public static void main(String[] args) {
        All lion = new Lion();
        All eagle = new Eagle();
//        printName(lion);
//        printName(eagle);
        System.out.println(((Animal) lion).name);
        ((Animal) lion).walk();
        ((Animal) eagle).run();
        ((Animal) lion).fly();
        ((Animal) eagle).sound();
    }

    public static void printName(All all) {

        System.out.println(((Animal) all).name);
        }
    }
