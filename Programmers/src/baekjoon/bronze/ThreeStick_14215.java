package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThreeStick_14215 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int maxIndex = 0;

        for (int i = 1; i < split.length; i++) {
            if (Integer.parseInt(split[i]) > Integer.parseInt(split[maxIndex])) {
                maxIndex = i;
            }
        }

        int sum = 0;
        for (int i = 0; i < split.length; i++) {
            if (i == maxIndex) {
                continue;
            }
            sum += Integer.parseInt(split[i]);
        }

        if (sum <= Integer.parseInt(split[maxIndex])) {
            System.out.print(sum + sum - 1);
        } else {
            System.out.print(sum + Integer.parseInt(split[maxIndex]));
        }


    }
}
