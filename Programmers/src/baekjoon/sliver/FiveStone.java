package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FiveStone {


    /*
        위
        아래
        왼쪽
        오른쪽
        왼쪽 위 대각선
        오른쪽 위 대각선
        왼쪽 아래 대각선
        오른쪽 아래 대각선
     */
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};

    static int[][] checkBoards = new int[19][19];

    static int STONE_COLOR = 0;
    static int COUNT = 5;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int gameCount = Integer.parseInt(br.readLine());

        for (int turn = 1; turn < gameCount; turn++) {
            String[] splitArea = br.readLine().split(" ");
            int row = Integer.parseInt(splitArea[0]);
            int col = Integer.parseInt(splitArea[1]);

            checkBoards[row][col] = STONE_COLOR;

            if (turn >= 9) {
                checkStoneWay(row, col);
            }

            changeTurn();
        }


    }

    private static boolean checkStoneWay(int row, int col) {
        boolean upDownStraight = upDownStraight(row, col);
        boolean leftRightStraight = leftRightStraight(row, col);
        boolean leftRightCross = leftRightCross(row, col);
        boolean anotherLeftRightCross = anotherLeftRightCross(row, col);

        return false;
    }

    private static boolean anotherLeftRightCross(int row, int col) {
        int stoneLineCount = 0;
        for (int i = 6; i <= 7; i++) {
            stoneLineCount += concaveSearch(i, row, col);
        }
        //6,7
        return stoneLineCount <= 5;
    }

    private static boolean leftRightCross(int row, int col) {

        int stoneLineCount = 0;
        for (int i = 4; i <= 5; i++) {
            stoneLineCount += concaveSearch(i, row, col);
        }
        //4,5
        return stoneLineCount <= 5;

    }

    private static boolean leftRightStraight(int row, int col) {
        int stoneLineCount = 0;
        for (int i = 2; i <= 3; i++) {
            stoneLineCount += concaveSearch(i, row, col);
        }
        //2,3,
        return stoneLineCount <= 5;
    }

    private static boolean upDownStraight(int row, int col) {
        int stoneLineCount = 0;
        //0,1
        for (int i = 0; i <= 1; i++) {
            stoneLineCount += concaveSearch(i, row, col);
        }

        return stoneLineCount <= 5;

    }

    private static int concaveSearch(int location, int row, int col) {
        for (int i = 0; i < 5; i++) {
            row = row + dx[location];
            col = col + dx[location];

            if (row >= 0 && row < 19 && col >= 0 && col < 19) {
//                checkBoards[row][col];
            }
        }
        return 0;
    }


    private static void changeTurn() {
        STONE_COLOR = (STONE_COLOR == 0) ? 1 : 0;
    }
}

class CheckBoard {

    Stone stone;

    public CheckBoard(Stone stone) {
        this.stone = stone;
    }
}

class Stone {

    int color;

    public Stone(int color) {
        this.changeStone(color);
    }

    void changeStone(int color) {
        this.color = (color == 1) ? 0 : 1;
    }
}
