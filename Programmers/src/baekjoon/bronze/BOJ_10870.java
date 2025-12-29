package baekjoon.bronze;

import java.io.*;

public class BOJ_10870 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        bw.write(fibonacci(N) + "");

        bw.flush();
        bw.close();
    }

    private static int fibonacci(int n) {
        //기본 단계
        if (n == 0) return 0;
        if (n == 1 || n == 2) return 1;
        return fibonacci(n - 1) + fibonacci(n - 2);//재귀단계
    }
}
