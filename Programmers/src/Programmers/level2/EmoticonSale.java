package Programmers.level2;

import java.util.Arrays;

public class EmoticonSale {

    public static void main(String[] args) {
        int[][] users = new int[][]{{40, 10000}, {25, 10000}};
        int[] emoticons = new int[]{7000, 5400};
        EmoticonSale sol = new EmoticonSale();
        int[] solution = sol.solution(users, emoticons);
        for (int i : solution) {
            System.out.print(i + " ");
        }
    }

    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];
        int[] discount = {40, 30, 20, 10};
        int length = discount.length;
        generatePermutations(users, discount,emoticons, length);


        return answer;
    }


    public static void generatePermutations(int[][] users, int[] discount,int[] emoticons, int length) {
        int[] permutation = new int[emoticons.length];
        generatePermutationsUtil(discount, permutation, 0, length, emoticons.length,emoticons);
    }

    public static void generatePermutationsUtil(int[] emoticons, int[] permutation, int depth, int n, int r,int[] pay) {
        if (depth == r) {
            // 현재 순열 출력
            for (int i = 0 ; i <permutation.length; i++) {
                System.out.print(pay[i]*(1- (permutation[i]*0.01)) + " ");
            }
            System.out.println();
            return;
        }

        for (int j = 0; j < n; j++) {
            permutation[depth] = emoticons[j];
            generatePermutationsUtil(emoticons, permutation, depth + 1, n, r,pay);
        }
    }


}
