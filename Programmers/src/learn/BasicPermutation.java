package learn;

public class BasicPermutation {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3,4};
        int[] result = new int[4];
        boolean[] used = new boolean[4];
        permutation(arr, result, used, 0, 3);
    }

    public static void permutation(int[] arr, int[] result, boolean[] used, int depth, int r) {
        // r개를 다 선택했으면 출력
        if (depth == r) {
            for (int i = 0; i < r; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        // 모든 원소에 대해 시도
        for (int i = 0; i < arr.length; i++) {
            if (!used[i]) {  // 아직 사용하지 않은 원소라면
                // 선택
                used[i] = true;
                result[depth] = arr[i];

                // 재귀 호출
                permutation(arr, result, used, depth + 1, r);

                // 선택 해제 (이 부분이 백트래킹!)
                used[i] = false;
            }
        }
    }
}
