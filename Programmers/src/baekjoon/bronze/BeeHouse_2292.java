package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 최소 값을 찾아 그 값을 넘어가는지 확인한다.
 */
public class BeeHouse_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int count = 1;
        int answer = 2;
        while (answer <= N) {
            answer = answer + (count * 6);
            count++;
        }
        System.out.print(count);

    }
}
