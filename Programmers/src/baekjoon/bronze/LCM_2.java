package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCM_2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        long a = Long.parseLong(split[0]);
        long b = Long.parseLong(split[1]);
        long gcd = gcd(a, b);
        long lcm = lcm(a, b);
        System.out.print(gcd);
    }

    static long gcd(long a, long b) {
        while (b != 0) {
            long target = b;
            b = a % b;
            a = target;
        }
        return a;
    }

    static long lcm(long a, long b) {
        return a * b / gcd(a, b);
    }
}
