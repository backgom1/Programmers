package Programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class ArcheryCompetition {
    public static void main(String[] args) {
        int n = 5;
        int[] info = new int[]{2, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0};
        ArcheryCompetition sol = new ArcheryCompetition();
        int[] solution = sol.solution(n, info);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int n, int[] info) {
        int[] apeachNumber = new int[info.length];
        int[] answer = new int[info.length];
        int beforeMaxDiff = 0;
        int beforeMaxLion = 0;
        for (int i = 0; i < apeachNumber.length; i++) {
            int targetValue = n;
            apeachNumber[i] = info[i] + 1; //기준을 잡을곳
            targetValue -= info[i] + 1;//배열을 돌릴꺼
            while (true) {
                if (info[i] == apeachNumber[i]) break;
            }
            List<Integer> calculate = calculate(info, apeachNumber);
            if (calculate.get(1) > beforeMaxDiff) {
                beforeMaxDiff = calculate.get(1);
                beforeMaxLion = calculate.get(0);
                answer = apeachNumber;
            } else if (calculate.get(1) == beforeMaxDiff) {
                if (beforeMaxLion < calculate.get(0)) {
                    beforeMaxLion = calculate.get(0);
                    answer = apeachNumber;
                }
            }
        }
        return answer;
    }

    private List<Integer> calculate(int[] info, int[] apeachNumber) {
        int lionMaxNum = 0;
        int apeachNum = 0;
        int archScore = 10;
        List<Integer> lionMaxAndScoreDiff = new ArrayList<>();
        for (int i = 0; i < info.length; i++) {
            //라이언 최대값
            if (info[i] < apeachNumber[i]) {
                lionMaxNum += archScore;
            } else {
                apeachNum += archScore;
            }
            archScore--;
        }
        int scoreDiff = lionMaxNum - apeachNum;
        lionMaxAndScoreDiff.add(lionMaxNum);
        lionMaxAndScoreDiff.add(scoreDiff);
        return lionMaxAndScoreDiff;
    }
}
