package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;

public class CenterMoveAlgoritm_2903 {
    //최상단에 있는 점의 개수를 구한후 정사각형의 크기를 구하는 식으로 구하면 된다.
    //패턴은 현재 점의 갯수 + 현재 점의 갯수-1를하면 윗변의 점의 개수가 나온다.
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int point = 2;
        for (int i = 0; i < N; i++) {
            point = point + point - 1;
        }

        System.out.print(point * point);
    }
}
