package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Mines {
    static int[] dx = {-1, -1, -1, 0, 0, 1, 1, 1};
    static int[] dy = {-1, 0, 1, -1, 1, -1, 0, 1};
    static char[][] bomb;
    static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int gameOver = 1;
        bomb = new char[cnt][cnt];
        map = new char[cnt][cnt];

        for (int i = 0; i < cnt; i++) {
            String x = br.readLine();
            for (int j = 0; j < cnt; j++) {
                bomb[i][j] = x.charAt(j);
            }
        }

        for (int i = 0; i < cnt; i++) {
            String x = br.readLine();
            for (int j = 0; j < cnt; j++) {
                if (x.charAt(j) == 'x') {
                    if (bomb[i][j] == '*') {
                        gameOver = 0;
                    } else {
                        int answer = 0;
                        for (int k = 0; k < 8; k++) {
                            int nx = i + dx[k];
                            int ny = j + dy[k];
                            if (nx >= 0 && nx < cnt && ny >= 0 && ny < cnt && bomb[nx][ny] == '*') {
                                answer++;
                            }
                            map[i][j] = (char) (answer + '0');
                        }
                    }
                } else {
                    map[i][j] = '.';
                }
            }
        }
        if (gameOver == 0) {
            for (int i = 0; i < cnt; i++) {
                for (int j = 0; j < cnt; j++) {
                    if (bomb[i][j] == '*')
                        map[i][j] = '*';
                }
            }
        }
        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                System.out.print(map[i][j]);
            }
            System.out.print("\n");
        }
    }
}