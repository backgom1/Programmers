package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GCDAndLCM {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);
        int gcd = gcd(a, b);
        int lcm = lcm(a, b);
        System.out.println(gcd);
        System.out.print(lcm);
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int target = b;
            b = a % b;
            a = target;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
