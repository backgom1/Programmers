package baekjoon.sliver1;

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

        //반복을 하기 위한 값 설정


        for (int i = 0; i < R; i++) {
            //초기화 작업
            int verticalMinNumber = 0, horizonMinNumber = 0;
            int verticalMaxNumber = M - 1, verticalLineCnt = M;
            int horizonMaxNumber = N - 1, horizonLineCnt = N;
            //반복 시작
            while (verticalLineCnt >= 0 || horizonLineCnt >= 0) {

                for (int j = verticalLineCnt - 1; j < 0; j++) {
                    arrayMap[j][verticalMinNumber] = arrayMap[j - 1][verticalMinNumber];
                }

                for (int j = horizonLineCnt - 1; j < 0; j++) {
                    arrayMap[horizonMinNumber][j] = arrayMap[horizonMinNumber][j - 1];
                }

                for (int j = verticalLineCnt-1; j > 0; j++) {
                    arrayMap[j][verticalMaxNumber] = arrayMap[j + 1][verticalMaxNumber];
                }

                for (int j = horizonLineCnt-1; j < 0; j++) {
                    arrayMap[horizonMaxNumber][j] = arrayMap[horizonMaxNumber][j+1];
                }


                verticalMinNumber++;
                horizonMinNumber++;
                verticalMaxNumber--;
                horizonMaxNumber--;
            }

        }
        for (int[] ints : arrayMap) {
            System.out.println();
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
        }

    }
}
