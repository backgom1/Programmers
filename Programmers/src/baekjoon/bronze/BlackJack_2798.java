package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;

public class BlackJack_2798 {

    static int answer = 0;
    static int number = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String[] rules = br.readLine().split(" ");
        String[] cards = br.readLine().split(" ");

        //카드 정리 및 규칙 셋팅
        int count = Integer.parseInt(rules[0]);
        number = Integer.parseInt(rules[1]);

        int[] countCards = new int[count];
        int[] result = new int[3];
        for (int i = 0; i < countCards.length; i++) {
            countCards[i] = Integer.parseInt(cards[i]);
        }

        //반복 시작 O(n^2)
        combination(countCards, result, 0, 0, 3);

        System.out.print(answer);
    }


    private static void combination(int[] countCards, int[] result, int start, int depth, int limit) {
        //댑스 체크 및 더한 값 계산
        if (limit == depth) {
            int compare = 0;

            for (int i = 0; i < result.length; i++) {
                compare += result[i];
            }

            if (compare <= number && compare > answer) {
                answer = compare;
            }
            return;
        }

        //뎁스 진입
        for (int i = start; i < countCards.length; i++) {
            result[depth] = countCards[i];
            combination(countCards, result, i + 1, depth + 1, limit);
        }


    }
}
