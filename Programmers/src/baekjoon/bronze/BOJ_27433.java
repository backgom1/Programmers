package baekjoon.bronze;

import java.io.*;

public class BOJ_27433 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        bw.write(factorial(n) + "");


        bw.flush();
        bw.close();
    }

    private static long factorial(int n) {
        if(n == 0) return 1;
        if(n == 1) return 1; //기본 단계
        return n * factorial(n - 1);//재귀 단계
    }
}
