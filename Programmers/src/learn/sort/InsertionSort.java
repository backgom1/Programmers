package learn.sort;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 4, 2, 1};
        sort(arr);
    }

    public static void sort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {//배열의 두 번째 원소부터 시작 , 이 과정을 배열의 마지막 원소까지 반복합니다.
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                //현재 원소를 이전에 정렬된 원소들과 비교하면서, 현재 원소보다 큰 원소들을 한 칸씩 뒤로 밀어냅니다.
                //더 이상 현재 원소보다 큰 원소가 없거나 배열의 시작점에 도달하면, 그 위치에 현재 원소를 삽입합니다.
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
            System.out.println(Arrays.toString(arr));
        }
    }
}
