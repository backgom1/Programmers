package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Prime_1929 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int M = Integer.parseInt(split[0]);
        int N = Integer.parseInt(split[1]);

        boolean[] prime = new boolean[N + 1];
        //어떻게 담을것인가?
        for (int i = 2; i <= N; i++) {
            prime[i] = true;
        }

        //어떻게 뺄것인가?
        //O(lognlogn)
        for (int i = 2; i * i <= N; i++) {
            for (int j = i * i; j <= N; j += i) {
                prime[j] = false;
            }
        }

        for (int i = M; i <= N; i++) {
            if (prime[i]) {
                System.out.println(i);
            }
        }
    }
}
