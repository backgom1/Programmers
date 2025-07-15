package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;

public class SnailUp_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int A = Integer.parseInt(split[0]);
        int B = Integer.parseInt(split[1]);
        int V = Integer.parseInt(split[2]);

        int day = (V - A) / (A - B) + 1;

        if ((V - A) % (A - B) != 0) {
            day++;
        }

        System.out.print(day);
    }
}
