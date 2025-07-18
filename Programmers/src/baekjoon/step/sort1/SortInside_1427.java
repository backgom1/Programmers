package baekjoon.step.sort1;

import java.io.*;

public class SortInside_1427 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] counting = new int[10];

        int number = Integer.parseInt(br.readLine());

        while (number > 0) {
            counting[number % 10]++;
            number /= 10;
        }

        for (int i = 9; i >= 0; i--) {
            while (counting[i] > 0) {
                counting[i]--;
                bw.write(i+"");
            }
        }
        bw.flush();
        bw.close();

    }
}
