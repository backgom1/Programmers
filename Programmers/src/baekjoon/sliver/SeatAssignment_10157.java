package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SeatAssignment_10157 {

    private static int FIND_WAITING_NUMBER = 1;
    private static boolean[][] isVisited;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] command = br.readLine().split(" ");
        int row = Integer.parseInt(command[0]);
        int col = Integer.parseInt(command[1]);
        isVisited = new boolean[row + 1][col + 1];

        int targetWaitingNumber = Integer.parseInt(br.readLine());

        if (isValidWaitingNumber(row, col, targetWaitingNumber)) {
            System.out.println("0");
        } else if (targetWaitingNumber == 1) {
            System.out.println("1 1");
        } else {
            findSeatAssignment(row, col, targetWaitingNumber);
        }
    }

    private static boolean isValidWaitingNumber(int row, int col, int targetWaitingNumber) {
        return (row * col) < targetWaitingNumber;
    }

    private static void findSeatAssignment(int row, int col, int targetWaitingNumber) {
        int minRow = 1, minCol = 1;
        boolean found = false;

        // 초기 좌표 방문 처리
        isVisited[minRow][minCol] = true;

        while (FIND_WAITING_NUMBER <= targetWaitingNumber) {

            // 오른쪽 이동: 열 증가
            while (true) {
                if ((minCol + 1 < 1 || minCol + 1 > col) || isVisited[minRow][minCol + 1]) {
                    break;
                }
                FIND_WAITING_NUMBER++;
                if (targetWaitingNumber == FIND_WAITING_NUMBER) {
                    minCol++;
                    found = true;
                    break;
                }
                isVisited[minRow][minCol] = true;
                minCol++;
            }
            if (found) break;

            // 아래쪽 이동: 행 증가
            while (true) {
                if ((minRow + 1 < 1 || minRow + 1 > row) || isVisited[minRow + 1][minCol]) {
                    break;
                }
                FIND_WAITING_NUMBER++;
                if (targetWaitingNumber == FIND_WAITING_NUMBER) {
                    minRow++;
                    found = true;
                    break;
                }
                isVisited[minRow][minCol] = true;
                minRow++;
            }
            if (found) break;

            // 왼쪽 이동: 열 감소
            while (true) {
                if ((minCol - 1 < 1 || minCol - 1 > col) || isVisited[minRow][minCol - 1]) {
                    break;
                }
                FIND_WAITING_NUMBER++;
                if (targetWaitingNumber == FIND_WAITING_NUMBER) {
                    minCol--;
                    found = true;
                    break;
                }
                isVisited[minRow][minCol] = true;
                minCol--;
            }
            if (found) break;

            // 위쪽 이동: 행 감소
            while (true) {
                if ((minRow - 1 < 1 || minRow - 1 > row) || isVisited[minRow - 1][minCol]) {
                    break;
                }
                FIND_WAITING_NUMBER++;
                if (targetWaitingNumber == FIND_WAITING_NUMBER) {
                    minRow--;
                    found = true;
                    break;
                }
                isVisited[minRow][minCol] = true;
                minRow--;
            }
            if (found) break;
        }

        if (found) {
            System.out.println(minRow + " " + minCol);
        } else {
            System.out.println("0");
        }
    }
}
