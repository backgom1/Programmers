package Programmers.level2;

import java.util.Arrays;

public class PerfectCrime {

    public static void main(String[] args) {
        PerfectCrime pc = new PerfectCrime();
        System.out.println(pc.solution(new int[][]{{1, 2}, {2, 3}, {2, 1}}, 4, 4));
        System.out.println(pc.solution(new int[][]{{1, 2}, {2, 3}, {2, 1}}, 1, 7));
        System.out.println(pc.solution(new int[][]{{3, 3}, {3, 3}}, 7, 1));
        System.out.println(pc.solution(new int[][]{{3, 3}, {3, 3}}, 6, 1));
    }

    public int solution(int[][] info, int n, int m) {

        Arrays.sort(info, (a, b) -> {
            if (a[0] != b[0]) {
                return Integer.compare(b[0], a[0]);
            }
            return Integer.compare(a[1], b[1]);
        });

        int answer = 0;
        boolean[] visited = new boolean[info.length];
        int scoreB = 0;
        int sumA = 0;
        while (true) {
            do {
                for (int i = 0; i < info.length; i++) {

                    int b = info[i][1];
                    int sum = info[i][0];

                    visited[i] = true;

                    scoreB += b;
                    sumA += sum;

                    if (sumA >= m) {
                        sumA -= sum;
                        scoreB -= b;
                        visited[i] = false;
                    }


                    if (scoreB == n - 1) {
                        break;
                    }
                }
            } while (scoreB > m);
            //A 최소 조합
            int scoreA = 0;
            for (int i = 0; i < info.length; i++) {
                if (!visited[i]) {
                    int a = info[i][0];
                    scoreA += a;
                }
            }

            if (scoreA < n) {
                answer = scoreA;
                break;
            } else {
                return -1;
            }

        }

        return answer;
    }
}
