package doing.java;

import java.util.Scanner;

public class Baseball {

    Baseball() {
    }

    int firstAnswer = (int) (Math.random() * 9 + 1);
    int secondAnswer = (int) (Math.random() * 9 + 1);
    int thirdAnswer = (int) (Math.random() * 9 + 1);
    int firstInput;
    int secondInput;
    int thirdInput;
    int firstInputParse;
    int secondInputParse;
    int thirdInputParse;

    int[] Answer = {firstAnswer, secondAnswer, thirdAnswer};
    int[] Input = {firstInput,secondInput,thirdInput};
    int count = 1;
    int strike = 0;
    int ball = 0;
    int answerLength=Answer.length;

    void check() {
        for (int i = 0; i < answerLength; i++) {
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
    }

    void getBaseballData() {
        this.firstAnswer = firstAnswer;
        this.secondAnswer = secondAnswer;
        this.thirdAnswer = thirdAnswer;
        int[] Answer = {firstAnswer, secondAnswer, thirdAnswer};
        this.firstInput = firstInput;
        this.secondInput = secondInput;
        this.thirdInput = thirdInput;
        this.firstInputParse= firstInputParse;
                this.secondInputParse=secondInputParse;
        this.thirdInputParse=thirdInputParse;
        this.count = count;
        this.strike = strike;
        this.ball = ball;}

    void scan(String firstInput, String secondInput, String thirdInput) {Scanner scanner = new Scanner(System.in);
        this.firstInput=firstInput;
        this.firstInput=firstInput;
        this.firstInput=firstInput;
        firstInputParse = Integer.parseInt(firstInput);
        secondInputParse = Integer.parseInt(secondInput);
        thirdInputParse = Integer.parseInt(thirdInput);}

        void printResult() {
            if ((firstAnswer == firstInputParse) && (secondAnswer == secondInputParse) && (thirdAnswer == thirdInputParse)) {
                System.out.println("정답입니다. 9회 안에 야구게임에서 승리하셨네요!");

            }
            if (firstInputParse > 9 || secondInputParse > 9 || thirdInputParse > 9 || firstInputParse < 1 || secondInputParse < 1 || thirdInputParse < 1) {
                System.out.println("값이 1-9 범위 밖에 있습니다. 다시 입력해주세요");
            }

            if (Answer.equals(Input)) {
                System.out.println("9회 안에 야구게임에서 승리하셨네요!");


            }

            count++;

            System.out.printf("%d스트라이크,%d볼입니다\n", strike, ball);

//            if (count == MAX_COUNT) {
//
//                System.out.println("야구게임 패배! 다시 하시겠습니까? y또는 n을 눌러주세요");
//                String reCheck = scanner.nextLine();
//                if (reCheck.equals("y") || reCheck.equals("Y")) {
//                    System.out.println("다시 시작합니다.");
//                    count = 1;
//                } else if (reCheck.equals("n") || reCheck.equals("N")) {
//                    System.out.println("야구게임 종료");
//
//                } else {
//                    System.out.println("값을 다시 입력해주세요. y 또는 n을 입력해주세요");
//                    count = MAX_COUNT;
//                }
//            }
        }
    }

