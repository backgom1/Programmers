package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * 최대 최소 x,y를 구하는 문제로 판단이 되며 최대와 최소가 같을때는 차액이 남지않는 것이라고 판단
 * 만약에 최소가 있다면 참외밭이 아닌공간이기때문에 전체에서 최소 공간을 뺀다.
 * 1,3 / 2,4 이 경우에 최대 최소 길이를 체크하면 된다.
 */
public class MelonField_2477 {

    static int MAX_POINT = 6;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int melonArea = Integer.parseInt(br.readLine());
        int answer = 0;
        int maxX = Integer.MIN_VALUE;
        int maxY = Integer.MIN_VALUE;
        int minX = Integer.MAX_VALUE;
        int minY = Integer.MAX_VALUE;
        int[] x = new int[MAX_POINT];
        for (int i = 0; i < MAX_POINT; i++) {
            String[] split = br.readLine().split(" ");
            int way = Integer.parseInt(split[0]);

            if (way == 1 || way == 2) {
                maxX = Math.max(maxX, Integer.parseInt(split[1]));
            } else {
                maxY = Math.max(maxY, Integer.parseInt(split[1]));
            }
            x[i] = Integer.parseInt(split[1]);
        }

        for (int i = 0; i < MAX_POINT; i++) {
            if (x[i] == maxX) {
                int leftValue = i - 1;
                int rightValue = i + 1;
                if (leftValue < 0) {
                    leftValue = MAX_POINT - 1;
                }
                if (rightValue == MAX_POINT) {
                    rightValue = 0;
                }
                minX = Math.abs(x[leftValue] - x[rightValue]);
            }
        }

        for (int i = 0; i < MAX_POINT; i++) {
            if (x[i] == maxY) {
                int leftValue = i - 1;
                int rightValue = i + 1;
                if (leftValue < 0) {
                    leftValue = MAX_POINT - 1;
                }
                if (rightValue == MAX_POINT) {
                    rightValue = 0;
                }
                minY = Math.abs(x[leftValue] - x[rightValue]);
            }
        }

        answer += ((maxX * maxY) - (minX * minY)) * melonArea;
        System.out.print(answer);

    }
}
