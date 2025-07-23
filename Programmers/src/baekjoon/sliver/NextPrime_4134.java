package baekjoon.sliver;

import java.io.*;

public class NextPrime_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long t = Long.parseLong(br.readLine());

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            long n = Long.parseLong(br.readLine());
            if(n == 0 || n == 1){
                sb.append(2).append("\n");
                continue;
            }
            while (!isPrime(n)) {
                n++;
            }
            sb.append(n).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
    private static boolean isPrime(long target) {
        if (target < 2) return true;
        if (target == 2) return true;
        if (target % 2 == 0) return false;

        long sqrt = (long) Math.sqrt(target);

        for (long i = 3; i <= sqrt; i += 2) {
            if (target % i == 0) return false;
        }

        return true;
    }
}
