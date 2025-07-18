package baekjoon.bronze;

import java.io.IOException;
import java.util.Scanner;

public class Bingo {
    static int[][] bingoMap;
    static int line;

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        bingoMap = new int[5][5];
        line = 0;

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                bingoMap[i][j] = sc.nextInt();
            }
        }

        for (int a = 1; a <= 25; a++) {
            int bingoNum = sc.nextInt();
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (bingoMap[i][j] == bingoNum) bingoMap[i][j] = 0;
                }
            }
            rightStraight();
            downStraight();
            rightCross();
            leftCross();

            if (line >= 3) {
                System.out.println(a);
                break;
            }
            line = 0;
        }

    }

    public static void rightStraight() {

        for (int i = 0; i < 5; i++) {
            int bingoLine = 0;
            for (int j = 0; j < 5; j++) {
                if (bingoMap[i][j] == 0) bingoLine++;
            }
            if (bingoLine == 5) line++;
        }
    }

    public static void downStraight() {
        for (int i = 0; i < 5; i++) {
            int bingoLine = 0;
            for (int j = 0; j < 5; j++) {
                if (bingoMap[j][i] == 0) bingoLine++;
            }
            if (bingoLine == 5) line++;
        }
    }

    public static void rightCross() {
        int bingoLine = 0;
        for (int i = 0; i < 5; i++) {
            if (bingoMap[i][i] == 0) bingoLine++;
        }
        if (bingoLine == 5) line++;
    }

    public static void leftCross() {
        int bingoLine = 0;
        for (int i = 0; i < 5; i++) {
            if (bingoMap[i][4 - i] == 0) bingoLine++;
        }
        if (bingoLine == 5) line++;
    }
}
