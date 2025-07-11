package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ChessRefactor_1018 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");

        int r = Integer.parseInt(split[0]);
        int c = Integer.parseInt(split[1]);

        char[][] chessBoard = new char[r][c];

        for (int i = 0; i < r; i++) {
            String line = br.readLine();
            for (int j = 0; j < c; j++) {
                chessBoard[i][j] = line.charAt(j);
            }
        }

        int answer = Integer.MAX_VALUE;
        for (int i = 0; i + 8 <= r; i++) {
            for (int j = 0; j + 8 <= c; j++) {
                int min = findPaint(i, j, i + 8, j + 8, chessBoard);
                if (min < answer) {
                    answer = min;
                }
            }
        }

        System.out.print(answer);

    }

    private static int findPaint(int startR, int startC, int r, int c, char[][] chessBoard) {
        // 패턴1: 첫 칸이 현재 보드의 첫 칸과 같은 패턴
        int count1 = 0;
        for (int i = startR; i < r; i++) {
            for (int j = startC; j < c; j++) {
                // (상대좌표 합)이 짝수면 첫 칸과 같은 색, 홀수면 다른 색
                char expected = ((i - startR + j - startC) % 2 == 0) ?
                        chessBoard[startR][startC] :
                        (chessBoard[startR][startC] == 'W' ? 'B' : 'W');
                if (chessBoard[i][j] != expected) count1++;
            }
        }

        // 패턴2: 첫 칸을 바꾼 패턴
        int count2 = 0;
        char oppositeFirst = (chessBoard[startR][startC] == 'W') ? 'B' : 'W';
        for (int i = startR; i < r; i++) {
            for (int j = startC; j < c; j++) {
                char expected = ((i - startR + j - startC) % 2 == 0) ?
                        oppositeFirst :
                        (oppositeFirst == 'W' ? 'B' : 'W');
                if (chessBoard[i][j] != expected) count2++;
            }
        }

        return Math.min(count1, count2);
    }
}
