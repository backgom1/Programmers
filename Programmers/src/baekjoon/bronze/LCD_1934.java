package baekjoon.bronze;

import java.io.*;

public class LCD_1934 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < count; i++) {
            String[] split = br.readLine().split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            answer.append(lcm(a, b)).append("\n");
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int target = b;
            b = a % b;
            a = target;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
