package daliy.problem;

import java.io.*;

public class BOJ_4134 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());


        for (int i = 0; i < loop; i++) {
            Long number = Long.parseLong(br.readLine());

            if(number == 1 || number == 0){
                bw.write(2+"\n");
                continue;
            }
            while (true) {
                if (isPrime(number)) {
                    bw.write(number + "\n");
                    break;
                }
                number++;
            }
        }

        bw.flush();
        bw.close();
    }

    private static boolean isPrime(long target) {
        if (target < 2) return true;
        if (target == 2) return true;
        if (target % 2 == 0) return false;

        long sqrt = (long) Math.sqrt(target);

        for (int i = 3; i <= sqrt; i += 2) {
            if (target % i == 0) return false;
        }

        return true;
    }
}
