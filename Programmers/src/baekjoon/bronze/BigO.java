package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigO {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int a1 = Integer.parseInt(split[0]);
        int a0 = Integer.parseInt(split[1]);

        int c = Integer.parseInt(br.readLine());
        int n0 = Integer.parseInt(br.readLine());

        for (int i = n0; i <= 100; i++) {
            if ((a1 * i) + a0 >= c * i) {
                System.out.print(0);
                return;
            }
        }
        System.out.print(1);
    }
}
