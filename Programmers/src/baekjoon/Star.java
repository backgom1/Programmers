package baekjoon;

import java.util.Scanner;

public class Star {

    static char star[][];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        n = 4 * n - 3; //가로 세로의 출력
        star = new char[n][n];

        //전체칸을 채운다
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                star[i][j] = ' ';
            }
        }

        star(0, n);

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }
    }

    public static void star(int s, int len) {
        if (len<=s) return;

        for (int i = s; i < len; i++) {
            star[s][i] = '*'; //맨 위 가로줄
            star[len - 1][i] = '*'; //맨 아래 가로줄
            star[i][s] = '*'; //왼쪽 세로줄
            star[i][len - 1] = '*'; //오른쪽 세로줄
        }

        //2칸씩 띄워야 공백이 생길수 있다
        star(s + 2, len - 2);
    }
}
