package baekjoon.bronze;

import java.io.*;

/**
 * 1. 반복을 돌릴때 예제에 대해서 소수 값을 구한 후 그 소수 값에 대해 반복 진행
 * 이후 전체 값에서 구한 n값을 뺀 후 그 뺀 값에 대해서 소수인지 판단
 * 계속 반복하다 둘다 소수라면 계산 식을 만들어 종료
 * 만약 소수의 합을 구하는 과정에서 for문 밖으로 나올경우 Goldbach's conjecture is wrong. 출력
 */
public class BOJ_6588 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        while (true) {
            int target = Integer.parseInt(br.readLine());
            boolean isCheck = false;
            if (target == 0) break;

            for (int i = 3; i <= target / 2; i += 2) {
                if (isPrime(i)) continue;

                int num = target - i;

                if (!isPrime(num)) {
                    sb.append(target).append(" = ").append(i).append(" + ").append(num).append("\n");
                    isCheck = true;
                    break;
                }
            }

            if (!isCheck) {
                sb.append("Goldbach's conjecture is wrong.").append("\n");
            }

        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    private static boolean isPrime(int target) {
        if (target < 2) return true;
        if (target == 2) return false;
        if (target % 2 == 0) return true;

        int sqrt = (int) Math.sqrt(target);

        for (int i = 3; i <= sqrt; i += 2) {
            if (target % i == 0) return true;
        }

        return false;
    }
}