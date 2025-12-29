package learn.sort;

import java.util.Arrays;

public class MergeSort {


    public static void main(String[] args) {
        int[] arr = new int[]{5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(sort(arr)));
    }

    public static int[] sort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return null; // 배열이 비어있거나 원소가 하나면 이미 정렬됨
        }
        int[] temp = new int[arr.length]; // 합병을 위한 임시 배열
        mergeSort(arr, temp, 0, arr.length - 1);
        return arr;
    }

    private static void mergeSort(int[] arr, int[] temp, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, temp, left, mid);      // 왼쪽 절반 정렬
            mergeSort(arr, temp, mid + 1, right); // 오른쪽 절반 정렬
            merge(arr, temp, left, mid, right);   // 정렬된 두 절반을 합병
        }
    }

    private static void merge(int[] arr, int[] temp, int left, int mid, int right) {
        // 임시 배열에 복사
        for (int i = left; i <= right; i++) {
            temp[i] = arr[i];
        }

        int part1 = left;      // 왼쪽 절반의 시작 인덱스
        int part2 = mid + 1;   // 오른쪽 절반의 시작 인덱스
        int index = left;      // 원본 배열에 채울 인덱스

        // 두 부분을 비교하여 병합
        while (part1 <= mid && part2 <= right) {
            if (temp[part1] <= temp[part2]) {
                arr[index] = temp[part1];
                part1++;
            } else {
                arr[index] = temp[part2];
                part2++;
            }
            index++;
        }

        // 남아있는 왼쪽 부분 원소 복사 (오른쪽은 이미 복사되어 있거나, 남은 경우 뒤에 붙으면 됨)
        while (part1 <= mid) {
            arr[index] = temp[part1];
            part1++;
            index++;
        }
        // 오른쪽 부분은 따로 처리할 필요 없음 (temp 배열에서 원본 배열로 복사만 하면 됨)
    }
}
