package edu.java;

import java.util.Scanner;

//public void Calculator {return 0;
//}

public class Baseball {

    final static int MAX_COUNT = 10;

    public static void main(String[] args) {
        int firstAnswer = (int) (Math.random() * 9 + 1);
        int secondAnswer = (int) (Math.random() * 9 + 1);
        int thirdAnswer = (int) (Math.random() * 9 + 1);
        int[] Answer = {firstAnswer, secondAnswer, thirdAnswer};
        int count = 1;
        int strike = 0;
        int ball = 0;


        while (count < MAX_COUNT) {
            strike = 0;
            ball = 0;

            System.out.println("숫자 야구를 시작합니다. 1-9까지의 숫자 3개를 순서대로 입력해주세요. 입력 후 엔터를 눌러 주세요");
            Scanner scanner = new Scanner(System.in);
            String firstInput = scanner.nextLine();
            String secondInput = scanner.nextLine();
            String thirdInput = scanner.nextLine();

            int firstInputParse = Integer.parseInt(firstInput);
            int secondInputParse = Integer.parseInt(secondInput);
            int thirdInputParse = Integer.parseInt(thirdInput);

            int[] Input = {firstInputParse, secondInputParse, thirdInputParse};
            System.out.printf("%d번째\n\n", count);

            System.out.printf("정답 확인용 : %d,%d,%d\n", firstAnswer, secondAnswer, thirdAnswer);
            System.out.printf("%d,%d,%d를 입력하셨습니다.\n", firstInputParse, secondInputParse, thirdInputParse);

            for (int i = 0; i < Answer.length; i++) {
                if (Input[i] == (Answer[i])) {
                    strike++;
                }
            }

            for (int i = 0; i < Answer.length; i++) {

                if ((firstInputParse == (Answer[i])) && (Input[i] != (Answer[i]))) {
                    ball++;
                }
                if ((secondInputParse == (Answer[i])) && (Input[i] != (Answer[i]))) {
                    ball++;
                }
                if ((thirdInputParse == (Answer[i])) && (Input[i] != (Answer[i]))) {
                    ball++;
                }
            }

            if ((firstAnswer == firstInputParse) && (secondAnswer == secondInputParse) && (thirdAnswer == thirdInputParse)) {
                System.out.println("정답입니다. 9회 안에 야구게임에서 승리하셨네요!");
                break;
            }
            if (firstInputParse > 9 || secondInputParse > 9 || thirdInputParse > 9 || firstInputParse < 1 || secondInputParse < 1 || thirdInputParse < 1) {
                System.out.println("값이 1-9 범위 밖에 있습니다. 다시 입력해주세요");
            }

            if (Answer.equals(Input)) {
                System.out.println("9회 안에 야구게임에서 승리하셨네요!");
                break;

            }

            count++;

            System.out.printf("%d스트라이크,%d볼입니다\n", strike, ball);

            if (count == MAX_COUNT) {

                System.out.println("야구게임 패배! 다시 하시겠습니까? y또는 n을 눌러주세요");
                String reCheck = scanner.nextLine();
                if (reCheck.equals("y") || reCheck.equals("Y")) {
                    System.out.println("다시 시작합니다.");
                    count = 1;
                } else if (reCheck.equals("n") || reCheck.equals("N")) {
                    System.out.println("야구게임 종료");
                    break;
                } else {
                    System.out.println("값을 다시 입력해주세요. y 또는 n을 입력해주세요");
                    count = MAX_COUNT;
                }
            }

        }
    }
}

