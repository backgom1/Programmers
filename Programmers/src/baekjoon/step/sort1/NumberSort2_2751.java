package baekjoon.step.sort1;

import java.io.*;
import java.util.Arrays;

public class NumberSort2_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        int[] arr = new int[T];
        for (int i = 0; i < T; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);//O(nlogn)

        for (int i : arr) {
            bw.write(i+"");
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
