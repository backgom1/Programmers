package baekjoon.sliver;

import java.io.*;

public class Bertrang_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder answer = new StringBuilder();
        boolean[] visited = new boolean[246913];
        while (true) {
            int count = 0;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break;
            }

            for (int i = n + 1; i <= n * 2; i++) {
                if (visited[i]) {
                    count++;
                } else {
                    if (isPrime(i)) {
                        visited[i] = true;
                        count++;
                    }
                }
            }
            answer.append(count).append("\n");
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long target) {
        if (target < 2) return true;
        if (target == 2) return true;
        if (target % 2 == 0) return false;

        long sqrt = (long) Math.sqrt(target);

        for (long i = 3; i <= sqrt; i += 2) {
            if (target % i == 0) return false;
        }

        return true;
    }
}
