package LearnJava.Section2;

import java.util.Arrays;
import java.util.Scanner;

public class HighMT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] mountain = new int[cnt + 2][cnt + 2];
        int answer = 0;

        for (int[] ints : mountain) {
            Arrays.fill(ints, 0);
        }

        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; j <= cnt; j++) {
                mountain[i][j] = sc.nextInt();
            }
        }
        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; j <= cnt; j++) {
                if (mountain[i][j] > mountain[i + 1][j] && mountain[i][j] > mountain[i][j + 1] && mountain[i][j] > mountain[i - 1][j] && mountain[i][j] > mountain[i][j - 1]) {
                    answer++;
                }
            }
        }
        System.out.print(answer);
    }
}
