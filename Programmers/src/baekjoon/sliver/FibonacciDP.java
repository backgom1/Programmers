package baekjoon.sliver;

import java.io.*;

public class FibonacciDP {
    static int[] zeroDp = new int[41];
    static int[] oneDp = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        zeroDp[0] = 1;
        zeroDp[1] = 0;
        oneDp[0] = 0;
        oneDp[1] = 1;

        for (int i = 0; i < T; i++) {
            int targetNum = Integer.parseInt(br.readLine());
            for (int j = 2; j <= targetNum; j++) {
                if (zeroDp[j] == 0) zeroDp[j] = zeroDp[j - 1] + zeroDp[j - 2];
                if (oneDp[j] == 0) oneDp[j] = oneDp[j - 1] + oneDp[j - 2];
            }
            bw.write(zeroDp[targetNum] + " " + oneDp[targetNum]);
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }

}
