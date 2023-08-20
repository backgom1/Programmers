package baekjoon.sliver;

import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int R = sc.nextInt();
        int[][] arrayMap = new int[N][M];

        for (int i = 0; i < arrayMap.length; i++) {
            for (int j = 0; j < arrayMap[i].length; j++) {
                arrayMap[i][j] = sc.nextInt();
            }
        }

        //회전
        rotation(N, M, R, arrayMap);

        //함수 나타내기
        for (int[] ints : arrayMap) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }

    }

    private static void rotation(int N, int M, int R, int[][] arrayMap) {
        for (int i = 0; i < R; i++) {

            for (int j = 0; j < Math.min(N, M) / 2; j++) {

                int shiftNumber = arrayMap[j][j];

                for (int k = j; k < M - j - 1; k++) {
                    arrayMap[j][k] = arrayMap[j][k + 1];
                }

                for (int k = j; k < N - j - 1; k++) {
                    arrayMap[k][M - j - 1] = arrayMap[k + 1][M - j - 1];
                }

                for (int k = M - j - 1; k > j; k--) {
                    arrayMap[N - j - 1][k] = arrayMap[N - j - 1][k -1];
                }

                for (int k = N - j - 1; k > j; k--) {
                    arrayMap[k][j] = arrayMap[k - 1][j];
                }

                arrayMap[j + 1][j] = shiftNumber;
            }
        }
    }
}
