package LearnJava.section3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MaxPrice {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dayCnt = in.nextInt();
        int input2 = in.nextInt();
        int[] day = new int[dayCnt];
        for (int i = 0; i < day.length; i++) {
            day[i] = in.nextInt();
        }
        MaxPrice sol = new MaxPrice();
        System.out.println(sol.solution(dayCnt, input2, day));


    }

    public int solution(int dayCnt, int k, int[] day) {
        int answer = 0, currentDay = 0;
        //시작 지점 슬라이드
        for (int i = 0; i < k; i++) {
            currentDay += day[i];
            answer = currentDay;
        }
        for (int i = k; i <dayCnt ; i++) {
            //(123)3은 더하고 0은 빼준다 (234)4는 더하고 1은 빼준다.
            currentDay += (day[i]-day[i-k]);
            answer=Math.max(answer,currentDay);
        }
        return answer;
    }

}
