package LearnJava.section6;

import java.util.Scanner;

public class FibonacciDPRecursion {
    static int[] dp = new int[46];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        recursion(N);
        for (int i = 1; i <= N; i++) {
            System.out.println(dp[i]);
        }

    }

    private static int recursion(int n) {
        if (n == 1) return dp[n] = 1;
        else if (n == 2) return dp[n] = 1;
        else {
            if (dp[n] != 0) return dp[n];
            return dp[n] = recursion(n - 1) + recursion(n - 2);
        }
    }
}
