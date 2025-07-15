package baekjoon.sliver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
   문제를 보면 중복 없이 M개를 고른 수열 -> 순열로 판단하여 재귀함수를 사용하여 구현을 진행한다.
 */
public class NandM1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);


        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1;
        }

        int[] result = new int[M];
        boolean[] used = new boolean[N];
        StringBuilder answer = new StringBuilder();
        permutation(answer, arr, result, used, 0, M);
        System.out.print(answer.toString());
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
