package Programmers.level1;

import java.util.Arrays;

public class FruitSeller {
    public static void main(String[] args) {
        int k = 4;
        int m = 3;
        int score[] = new int[]{4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2};
        FruitSeller sol = new FruitSeller();
        int solution = sol.solution(k, m, score);
        System.out.println("solution = " + solution);
    }

    public int solution(int k, int m, int[] score) {
        int answer = 0;
        int totalBox = (score.length) / m;
        Arrays.sort(score);
        int maxPriceApple = score.length - 1;
        int[][] appleBox = new int[totalBox][m];
        for (int i = 0; i < totalBox; i++) {
            for (int j = 0; j < m; j++) {
                appleBox[i][j] = score[maxPriceApple];
                maxPriceApple--;
            }
        }

        for (int[] box : appleBox) {
            Arrays.sort(box);
            int minApplePrice = box[0];
            int applePrice = minApplePrice * m;
            answer += applePrice;
        }

        return answer;
    }
}
