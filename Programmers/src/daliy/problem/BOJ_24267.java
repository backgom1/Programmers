package daliy.problem;

import java.io.*;

/**
 * 조합을 이용하여 값을 구하는 문제 7 x 6 x 5 / 3!
 */
public class BOJ_24267 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String i = br.readLine();
        int n = Integer.parseInt(i);
        long first = (long) n * (n - 2);
        long second = first * (n - 1);
        long answer = second / 6;

        bw.write(answer + "");
        bw.newLine();
        bw.write(3 + "");

        bw.flush();
        bw.close();
    }
}
