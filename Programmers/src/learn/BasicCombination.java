package learn;

import java.util.Arrays;

public class BasicCombination {

        public static void combination(int[] arr, int[] result, int start, int depth, int r) {
        // r개를 다 선택했으면 출력
        if (depth == r) {
            System.out.println(Arrays.toString(result));
            return;
        }

        // start부터 끝까지 시도 (순서 보장을 위해)
        for (int i = start; i < arr.length; i++) {
            result[depth] = arr[i];  // 현재 원소 선택

            // 다음 선택은 i+1부터 (중복 방지)
            combination(arr, result, i + 1, depth + 1, r);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] result = new int[3];

        System.out.println("4개 중 3개 선택하는 조합:");
        combination(arr, result, 0, 0, 3);
    }
}

