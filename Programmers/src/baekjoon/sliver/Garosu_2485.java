package baekjoon.sliver;

import java.io.*;

public class Garosu_2485 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int[] distances = new int[n - 1];
        for (int i = 1; i < n; i++) {
            distances[i - 1] = arr[i] - arr[i - 1];
        }

        int gcd = distances[0];

        for (int i = 1; i < distances.length; i++) {
            gcd = gcd(gcd, distances[i]);
        }

        int answer = 0;
        for (int distance : distances) {
            answer += (distance / gcd) - 1;
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }
}
