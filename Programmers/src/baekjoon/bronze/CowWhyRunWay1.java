package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class CowWhyRunWay1 {
    public static void main(String[] args) throws IOException {
        int[] cows = new int[11];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Arrays.fill(cows, -1);
        int cnt = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int i = 0; i < cnt; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int cowNum = Integer.parseInt(stringTokenizer.nextToken());
            int way = Integer.parseInt(stringTokenizer.nextToken());
            if (cows[cowNum] == -1) {
                cows[cowNum] = way;
            } else {
                if (cows[cowNum] != way) {
                    answer++;
                    cows[cowNum] = way;
                }
            }
        }
        System.out.println(answer);
    }

}
