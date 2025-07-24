package baekjoon.bronze;

import java.io.*;

public class FractionsSum_1735 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        String[] split2 = br.readLine().split(" ");

        int m1 = Integer.parseInt(split[0]);
        int f1 = Integer.parseInt(split[1]);
        int m2 = Integer.parseInt(split2[0]);
        int f2 = Integer.parseInt(split2[1]);

        //분모가 동일할 경우
        if (f1 == f2) {
            int sumM = m1 + m2;
            int gcd = gcd(sumM, f1);
            bw.write((sumM / gcd) + " " + (f1 / gcd));
        } else {
            int sumM = (m1 * f2) + (m2 * f1);
            int multiplyF = f1 * f2;
            int gcd = gcd(sumM, multiplyF);
            bw.write((sumM / gcd) + " " + (multiplyF / gcd));
        }

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
}
