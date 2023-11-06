package edu.java;

public class FootballMain {
    public static void main(String[] args) {
        Football k = new Football("KOR", "EPL", "토트넘", "손흥민");
        System.out.println(k.getFootballData());

        k.seasonGoal(19, 1);

        k.goal();
        k.var();
        k.goal();

        System.out.println(k.nation + "국적의 " +k.name+" 선수가 " + k.team + "에서 기록한 득점은...");
        System.out.println(+k.seasonGoal + "골입니다.");

        Football j = new Football("JPN", "EPL", "아스날", "토미야스");
        System.out.println(j.getFootballData());
        j.seasonGoal(10, 2);
        System.out.println(j.team + "의 득점 1위인 " + j.nation+" 국적의 " +j.name+ " 선수는 " + j.league + "에서 " + j.seasonGoal + "득점을 기록했습니다");
    }
}

