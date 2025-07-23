package baekjoon.sliver;


import java.io.*;

public class GoldBachPartition_17103 {
    static boolean[] visited = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < t; i++) {
            int target = Integer.parseInt(br.readLine());
            int count = 0;
            int n = target / 2;
            for (int j = 2; j <= n; j++) {
                if (visited[j]) {
                    int temp = target - j;
                    if (visited[temp]) {
                        count++;
                    } else {
                        if (isPrime(temp)) {
                            visited[temp] = true;
                            count++;
                        }
                    }
                } else {
                    if (isPrime(j)) {
                        visited[j] = true;
                        int temp = target - j;
                        if (isPrime(temp)) {
                            visited[temp] = true;
                            count++;
                        }
                    }
                }

            }
            answer.append(count).append("\n");
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int target) {
        if (target < 2) return true;
        if (target == 2) return true;
        if (target % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(target);

        for (int i = 3; i <= sqrt; i += 2) {
            if (target % i == 0) return false;
        }

        return true;
    }
}
