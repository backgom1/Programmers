package baekjoon.sliver;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    크기가 NxN인 2차원 배열을 두개 준비한다. (Char,Boolean)
    좌우상하에 대해 탐색을 진행하는데, 이미 탐색한 곳은 탐색하지 않도록 설정한다.
    이후 행과 열에 대해 값을 구하고 최대 값과 비교한다.
    이후 코드는 되돌린다.
    예외조건
    1. 벽을 넘어갔을 경우
 */
public class CandyGame_3085 {

    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, -1, 0, 1};

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        char[][] map = new char[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                map[i][j] = line.charAt(j);
            }
        }


        int max = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {

                for (int k = 0; k < 4; k++) {
                    int x = i + dx[k];
                    int y = j + dy[k];

                    int horizon = 1;
                    int vertical = 1;
                    if (x >= 0 && x < N && y >= 0 && y < N) {
                        char nextWord = map[x][y];
                        map[x][y] = map[i][j];
                        map[i][j] = nextWord;
                        char pointWord = map[i][j];
                        for (int l = j - 1; l >= 0; l--) {
                            if (map[i][l] != pointWord) {
                                break;
                            }
                            horizon++;
                        }

                        for (int l = j + 1; l < N; l++) {
                            if (map[i][l] != pointWord) {
                                break;
                            }
                            horizon++;
                        }

                        for (int l = i - 1; l >= 0; l--) {
                            if (map[l][j] != pointWord) {
                                break;
                            }
                            vertical++;
                        }

                        for (int l = i + 1; l < N; l++) {
                            if (map[l][j] != pointWord) {
                                break;
                            }
                            vertical++;
                        }


                        //되돌리기
                        map[i][j] = map[x][y];
                        map[x][y] = nextWord;
                    }

                    max = Math.max(max, horizon);
                    max = Math.max(max, vertical);
                }
            }
        }
        System.out.print(max);
    }
}
