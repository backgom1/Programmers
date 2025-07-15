package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AllCombination {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int[] result = new int[N];
        boolean[] used = new boolean[N];
        StringBuilder answer = new StringBuilder();
        permutation(answer, arr, result, used, 0, N);
        System.out.print(answer);
    }

    public static void permutation(StringBuilder sb, int[] arr, int[] result, boolean[] used, int depth, int limit) {
        if (depth == limit) {
            for (int i = 0; i < limit; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {
                used[i] = true;
                result[depth] = arr[i];
                permutation(sb, arr, result, used, depth + 1, limit);
                used[i] = false;
            }
        }
    }
}
