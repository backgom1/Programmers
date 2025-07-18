package baekjoon.step.sort1;

import java.io.*;
import java.util.Arrays;

public class NumberSort3_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        int[] counting = new int[10001];

        for (int i = 0; i < T; i++) {
            counting[Integer.parseInt(br.readLine())]++;
        }

        for (int i = 1; i < 10001; i++) {
            while (counting[i] > 0) {
                counting[i]--;
                bw.write(i+"");
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();

    }
}
