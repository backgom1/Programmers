package Programmers.level2;

import java.util.Arrays;

public class Carpet {
    public static void main(String[] args) {
        Carpet sol = new Carpet();
        System.out.print(Arrays.toString(sol.solution(24, 24)));
    }

    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        for (int width = 1; width <= yellow; width++) {
            if (yellow % width == 0) {
                int height = yellow / width;
                int vertical = height * 2;
                int horizon = (width + 2) * 2;
                if (vertical + horizon == brown) {
                    answer[0] = height + 2;
                    answer[1] = width + 2;
                    return answer;
                }
            }
        }
        return new int[]{};
    }
}
