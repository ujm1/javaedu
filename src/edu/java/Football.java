package edu.java;

public class Football {
    static int seasonGoal = 0;
    int todayGoal = 0;
    String league;
    String nation;
    String team;
    String name;

    Football() {
    }

    Football(String nation, String league, String team, String name) {
        this.nation = nation;
        this.league = league;
        this.team = team;
        this.name = name;
    }



    void goal() {
        System.out.println("골을 넣었습니다");

        seasonGoal++;
    }

    void var() {
        System.out.println("골이 비디오 판독에 의해 취소되었습니다");

        seasonGoal--;
    }

    void seasonGoal(int a, int b) {
      //  seasonGoal = a;
     //   todayGoal = b;
        seasonGoal = a + b;
    }
    void seasonGoal(int a) {
        seasonGoal+=a;
    }

    String getFootballData() {
        String resultStr=
        "국적은 " + this.nation+
        " 리그는 " + this.league+
        " 팀은 " + this.team+
        " 이름은 " + this.name;
        return resultStr;
    }
}
