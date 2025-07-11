package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCD_1850 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        //변환하는 작업
        long gcd = gcd(a, b);

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < gcd; i++) {
            answer.append(1);
        }

        System.out.print(answer.toString());
    }


    static long gcd(long a, long b) {
        while (b != 0) {
            long target = b;
            b = a % b;
            a = target;
        }
        return a;
    }

}
