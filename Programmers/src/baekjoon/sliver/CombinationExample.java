package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CombinationExample {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }
        int r = 7;
        int[] combArr = new int[r];

        combination(arr, 0, 0, r, combArr);
    }

    public static void combination(int[] arr, int index, int depth, int r, int[] combArr) {
        if (depth == r) {
            print(combArr);
            return;
        }

        if (index == arr.length) {
            return;
        }

        combArr[depth] = arr[index];
        combination(arr, index + 1, depth + 1, r, combArr);
        combination(arr, index + 1, depth, r, combArr);
    }

    public static void print(int[] arr) {
        int[] result = new int[7];
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }

        if (sum == 100) {
            for (int i = 0; i < 7; i++) {
                result[i] = arr[i];
            }
            Arrays.sort(result);
            for (int i : result) {
                System.out.println(i);
            }
            System.exit(0);
        }
    }
}
