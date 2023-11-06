package doing.java;

import doing.java.Baseball;

import java.util.Scanner;

public class BaseballMain {
    final static int MAX_COUNT = 10;

    public static void main(String[] args) {
        Baseball b = new Baseball();
        b.getBaseballData();
        System.out.println("숫자 야구를 시작합니다. 1-9까지의 숫자 3개를 순서대로 입력해주세요. \n입력 후 엔터를 눌러 주세요");
        Scanner scanner = new Scanner(System.in);
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();
        String thirdInput = scanner.nextLine();
        b.scan(firstInput,secondInput,thirdInput);
b.check();


        while (b.count < MAX_COUNT) {
        }


        System.out.printf("정답 확인용 : %d,%d,%d\n", b.firstAnswer, b.secondAnswer, b.thirdAnswer);
        System.out.printf("%d,%d,%d를 입력하셨습니다.\n", b.firstInputParse, b.secondInputParse, b.thirdInputParse);


    }

}



