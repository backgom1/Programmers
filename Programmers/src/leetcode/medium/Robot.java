package leetcode.medium;

import java.util.HashMap;
import java.util.Map;

public class Robot {


    public static void main(String[] args) {
        Robot robot = new Robot(6, 3);
        robot.step(2);
        robot.step(2);
        System.out.println(robot.getPos()[0] + " " + robot.getPos()[1]);
        System.out.println(robot.getDir());
        robot.step(2);
        robot.step(1);
        robot.step(4);
        System.out.println(robot.getPos()[0] + " " + robot.getPos()[1]);
        System.out.println(robot.getDir());
    }

    int[][] board;
    int positionHeight = 0;
    int positionWidth = 0;
    int nowMove = 1;

    Map<Integer, String> map = new HashMap<>();

    int[] moveWidth = new int[]{0, 1, 0, -1};
    int[] moveHeight = new int[]{1, 0, -1, 0};

    public Robot(int width, int height) {
        board = new int[width][height];
        map.put(0, "North");
        map.put(1, "East");
        map.put(2, "South");
        map.put(3, "West");
    }

    public void step(int num) {

        while (num > 0) {
            int canMove = getCanMove();

            if (canMove == 0) {
                rotate();
                continue;
            }

            int move = Math.min(num, canMove);

            positionWidth += moveWidth[nowMove] * move;
            positionHeight += moveHeight[nowMove] * move;

            num -= move;

            if (num > 0) {
                rotate();
            }
        }
    }

    private int getCanMove() {
        if (nowMove == 1) { // East
            return board.length - 1 - positionWidth;
        }

        if (nowMove == 0) { // North
            return board[0].length - 1 - positionHeight;
        }

        if (nowMove == 3) { // West
            return positionWidth;
        }

        return positionHeight; // South
    }

    public int[] getPos() {
        return new int[]{positionWidth, positionHeight};
    }

    public String getDir() {
        return map.get(nowMove);
    }

    public void rotate() {
        nowMove--;
        if (nowMove < 0) {
            nowMove = 3;
        }
    }

}
