package baekjoon.sliver;

import java.io.*;

public class Sum123_9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] dp = new int[15];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 4;
        for (int i = 0; i < T; i++) {
            int targetNum = Integer.parseInt(br.readLine());
            for (int j = 4; j <= targetNum; j++) {
                if(dp[j] == 0){
                    dp[j] = dp[j-1] + dp[j-2] + dp[j-3];
                }

            }
            bw.write(dp[targetNum]+"\n");
        }
        bw.flush();
        bw.close();
    }
}
