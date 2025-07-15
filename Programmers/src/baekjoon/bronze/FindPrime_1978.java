package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;

public class FindPrime_1978 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        int[] arr = new int[count];
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(split[i]);
        }

        int answer = 0;
        for (int j : arr) {
            if (isPrime(j)) answer++;
        }

        System.out.print(answer);
    }

    private static boolean isPrime(int target) {
        if (target == 1) return false;
        if (target == 2) return true;
        if (target % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(target);

        for (int i = 3; i <= sqrt; i += 2) {
            if (target % i == 0) return false;
        }

        return true;
    }

}
