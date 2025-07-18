package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


 /*
     int[][] 배열을 활용하여 map을 구성할 예정 → init()
     입력받은 가로 세로중 정사각형이 나올수있는 가장 큰 수를 구한다. → compareMaxLength()
     2중 for문으로 탐색을 진행하여 타겟 넘버별로 가로 세로 길이를 체크할 예정
     →searchWidthAndLength()
     최대 값을 비교하는 메서드
     →compareMaxSquare()
 */
public class NumberSquare_1051 {

    public static final int MAX_SEQUENCE = 10;
    public static int MAX_COUNT = 1;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] command = br.readLine().split(" ");
        int r = Integer.parseInt(command[0]);
        int c = Integer.parseInt(command[1]);

        int[][] map = init(r, c, br);
        int maxSquare = compareMaxLength(r, c);

        for (int i = 0; i < MAX_SEQUENCE; i++) {
            searchWidthAndLength(map, i, maxSquare);
        }
        System.out.println(MAX_COUNT);
    }

    private static int[][] init(int r, int c, BufferedReader br) throws IOException {
        int[][] map = new int[r][c];
        for (int i = 0; i < r; i++) {
            String[] line = br.readLine().split("");
            for (int j = 0; j < line.length; j++) {
                map[i][j] = Integer.parseInt(line[j]);
            }
        }
        return map;
    }

    //시프트 구현으로 작업 해야할듯
    private static void searchWidthAndLength(int[][] map, int target, int maxSquare) {
        for (int r = 0; r < map.length; r++) {
            for (int c = 0; c < map[r].length; c++) {
                int maxCount = 0;
                if (map[r][c] == target) {
                    for (int k = maxSquare; k > 0; k--) {
                        if (r + k < map.length && c + k < map[r].length) {
                            int tar1 = map[r][c];
                            int tar2 = map[r][c + k];
                            int tar3 = map[r + k][c];
                            int tar4 = map[r + k][c + k];

                            if (tar1 == tar2 && tar2 == tar3 && tar3 == tar4) {
                                int number = k + 1;
                                maxCount = number * number;
                                break;
                            }
                        }
                    }
                    compareMaxSquare(maxCount);
                }
            }
        }
    }

    private static int compareMaxLength(int r, int c) {
        return Math.min(r, c);
    }

    private static void compareMaxSquare(int maxCount) {
        if (maxCount > MAX_COUNT) {
            MAX_COUNT = maxCount;
        }
    }
}
