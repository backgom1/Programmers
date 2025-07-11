package Programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class JumpMemo {

    public static void main(String[] args) {
        JumpMemo sol = new JumpMemo();
        int solution = sol.solution(3);
        System.out.println("solution = " + solution);
    }

    private final Map<Integer, Integer> memo = new HashMap<>();

    public int solution(int n) {
        return jump(n);
    }

    private int jump(int n) {
        if (n <= 1) return 1;
        if (n == 2) return 2;
        long[] dp = new long[2001];
        dp[1] = 1;
        dp[2] = 2;

        for (int i = 3; i <= n; i++) {
            dp[i] = (dp[i - 1] + dp[i - 2]) % 1234567;
        }

        return (int) dp[n];
    }
}
