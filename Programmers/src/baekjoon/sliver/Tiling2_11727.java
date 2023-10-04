package baekjoon.sliver;

import java.io.*;

public class Tiling2_11727 {
    static int[] dp = new int[1001];
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        dp[1] = 1;
        dp[2] = 3;
        dp[N] = tiling(N);
        print(N);
    }

    private static int tiling(int n) {
        if(n == 1) return dp[1];
        if(n == 2) return dp[2];
        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + (dp[i - 2] * 2)) % 10007;
        }
        return dp[n];
    }

    private static void print(int N) throws IOException {
        bw.write(dp[N] + "");
        bw.flush();
        bw.close();
    }
}
