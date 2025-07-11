package LearnJava.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubSequence2 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        SubSequence2 subSequence2 = new SubSequence2();
        int i = subSequence2.countSubarrays(15);
        System.out.println("i = " + i);
    }

    public int countSubarrays(int n) {
        int count = 0;
        int maxCount = n / 2 + 1;
        int[] arr = new int[maxCount];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        int lt = 0;
        int sum = 0;
        for (int rt = 0; rt < arr.length; rt++) {  // 오른쪽 포인터
            sum += arr[rt];  // 오른쪽 확장

            // 합이 목표보다 크면 왼쪽 축소
            while (sum > n) {
                sum -= arr[lt];
                lt++;
            }

            if (sum == n) {
                count++;
            }
        }

        return count;
    }
}
