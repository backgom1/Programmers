package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//좌표의 최대 최소를 구하고 값을 정한다. 만약에 좌표가 하나이거나 최대최소 좌표가 동일할경우 0으로 반환한다.
public class Dirt_9063 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int maxX = Integer.MIN_VALUE, maxY = Integer.MIN_VALUE, minX = Integer.MAX_VALUE, minY = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");
            maxX = Math.max(maxX, Integer.parseInt(split[0]));
            maxY = Math.max(maxY, Integer.parseInt(split[1]));
            minX = Math.min(minX, Integer.parseInt(split[0]));
            minY = Math.min(minY, Integer.parseInt(split[1]));
        }

        if (maxX == minX && maxY == minY) {
            System.out.print(0);
        } else {
            System.out.print((maxX - minX) * (maxY - minY));
        }
    }
}
