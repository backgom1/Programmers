package LearnJava.Section2;


import java.util.Scanner;

public class GridPlate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] gridMap = new int[cnt][cnt];
        int answer = Integer.MIN_VALUE;
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                gridMap[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < cnt; i++) {
            int sum1 = 0;
            int sum2 = 0;
            for (int j = 0; j < cnt; j++) {
                sum1 += gridMap[i][j];
                sum2 += gridMap[j][i];
            }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }

        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < cnt; i++) {
            sum1 += gridMap[i][i];
            sum2 += gridMap[i][cnt - 1 - i];
        }
        answer = Math.max(answer, sum1);
        answer = Math.max(answer, sum2);


        System.out.print(answer);
    }
}
