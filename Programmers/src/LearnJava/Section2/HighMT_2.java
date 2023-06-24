package LearnJava.Section2;

import java.util.Scanner;

public class HighMT_2 {
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] mountain = new int[cnt][cnt];
        int answer = 0;


        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                mountain[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                boolean flag = true;
                for (int k = 0; k < 4; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (nx>=0 && nx<cnt && ny>=0 && ny<cnt && mountain[nx][ny] >= mountain[i][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) answer++;
            }
        }
        System.out.print(answer);
    }
}
