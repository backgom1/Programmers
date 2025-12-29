package daliy.problem;

import java.io.*;

public class BOJ_2578 {
    static int bingo = 0;
    static boolean isFinish = false;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[][] bingoMap = new int[5][5];

        for (int i = 0; i < 5; i++) {
            String[] split = br.readLine().split(" ");
            for (int j = 0; j < 5; j++) {
                bingoMap[i][j] = Integer.parseInt(split[j]);
            }
        }

        int answer = 0;
        for (int i = 0; i < 5; i++) {
            String[] split = br.readLine().split(" ");
            for (String target : split) {
                int number = Integer.parseInt(target);

                for (int j = 0; j < 5; j++) {
                    boolean found = false;
                    for (int k = 0; k < 5; k++) {
                        if (bingoMap[j][k] == number) {
                            bingoMap[j][k] = 0;
                            found = true;
                            break;
                        }
                    }
                    if (found) {
                        break;
                    }
                }

                answer++;

                if (answer > 4) {
                    bingo = 0;
                    checkRow(bingoMap);
                    checkCol(bingoMap);
                    checkLeftCross(bingoMap);
                    checkRightCross(bingoMap);

                    if (bingo >= 3) {
                        bw.write(answer + "\n");
                        isFinish = true;
                        break;
                    }
                }
            }


            if (isFinish) break;
        }

        bw.flush();
        bw.close();
    }

    private static void checkRightCross(int[][] bingoMap) {
        if (isFinish) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < bingoMap.length; i++) {
            temp += bingoMap[i][i];
        }
        if (temp == 0) {
            bingo++;
        }
        if (bingo >= 3) {
            isFinish = true;
        }
    }

    private static void checkLeftCross(int[][] bingoMap) {
        if (isFinish) {
            return;
        }
        int temp = 0;
        for (int i = 0; i < bingoMap.length; i++) {
            int i1 = bingoMap.length - 1 + i;
            temp += bingoMap[i][bingoMap.length - 1 - i];
        }
        if (temp == 0) {
            bingo++;
        }
        if (bingo >= 3) {
            isFinish = true;
        }
    }

    private static void checkCol(int[][] bingoMap) {
        if (isFinish) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            int temp = 0;
            for (int j = 0; j < 5; j++) {
                temp += bingoMap[j][i];
            }
            if (temp == 0) {
                bingo++;
            }
        }
        if (bingo >= 3) {
            isFinish = true;
        }
    }

    private static void checkRow(int[][] bingoMap) {
        if (isFinish) {
            return;
        }
        for (int i = 0; i < 5; i++) {
            int temp = 0;
            int[] row = bingoMap[i];
            for (int num : row) {
                temp += num;
            }
            if (temp == 0) {
                bingo++;
            }
        }
        if (bingo >= 3) {
            isFinish = true;
        }
    }
}
