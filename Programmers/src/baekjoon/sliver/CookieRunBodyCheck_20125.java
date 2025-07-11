package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CookieRunBodyCheck_20125 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[][] map = new String[count + 1][count + 1];

        for (int i = 0; i < count; i++) {
            String[] split = br.readLine().split("");
            for (int j = 0; j < count; j++) {
                map[i + 1][j + 1] = split[j];
            }
        }


        int heartRow = 0, heartCol = 0;
        boolean isHead = false;
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < count; j++) {
                if ("*".equals(map[i][j])) {
                    heartRow = i + 1;
                    heartCol = j;
                    isHead = true;
                    break;
                }
            }

            if (isHead) {
                break;
            }
        }

        System.out.print(heartRow + " " + heartCol);


        int leftArm = 0;
        int tempHeartCol = heartCol;
        while (true) {
            if (tempHeartCol - 1 <= 0) break;
            if("_".equals(map[heartRow][tempHeartCol - 1]))break;
            tempHeartCol--;
            leftArm++;
        }

        int rightArm = 0;
        int tempHeartCol2 = heartCol;
        while (true) {
            if (tempHeartCol2 + 1 > count) break;
            if("_".equals(map[heartRow][tempHeartCol2 + 1]))break;
            tempHeartCol2++;
            rightArm++;
        }

        int back = 0;
        int backRow, backCol;
        int tempHeartRow = heartRow;
        while (true) {
            if ("_".equals(map[tempHeartRow + 1][heartCol])) {
                backRow = tempHeartRow;
                backCol = heartCol;
                break;
            }
            tempHeartRow++;
            back++;
        }

        int leftLeg = 1;
        int tempBackRow = backRow + 1;
        int tempBackCol = backCol - 1;
        while (true) {
            if (tempBackRow + 1 > count) break;
            if ("_".equals(map[tempBackRow + 1][tempBackCol])) break;
            tempBackRow++;
            leftLeg++;
        }

        int rightLeg = 1;
        int tempBackRow2 = backRow + 1;
        int tempBackCol2 = backCol + 1;
        while (true) {
            if (tempBackRow2 + 1 > count) break;
            if ("_".equals(map[tempBackRow2 + 1][tempBackCol2])) break;
            tempBackRow2++;
            rightLeg++;
        }

        System.out.println();
        System.out.print(leftArm + " " + rightArm + " " + back + " " + leftLeg + " " + rightLeg);

    }
}
