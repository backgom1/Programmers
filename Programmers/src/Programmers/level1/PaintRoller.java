package Programmers.level1;

import java.util.Arrays;

public class PaintRoller {

    public int solution(int n, int m, int[] section) {
        int[] paint_area = new int[n];
        int answer = 0;
        int idx = 0;
        Arrays.fill(paint_area, 1);

        for (int i = section.length - 1; i >= 0; i--) {
            paint_area[section[i] - 1] = 0;
        }

        for (int i = 0; i < n; i++) {
            if (paint_area[i] == 0) {
                idx = i;
                answer++;
                for (int j = idx; j < idx + m; j++) {
                    if(j<n && paint_area[j]==0) {
                        paint_area[j] = 1;
                    }
                }
            }
        }
        return answer;
    }
}
