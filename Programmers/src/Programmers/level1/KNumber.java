package Programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class KNumber {
    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = new int[][]{{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        KNumber sol = new KNumber();
        int[] solution = sol.solution(array, commands);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] array, int[][] commands) {
        List<Integer> sortList = new ArrayList<>();
        int[] answer = new int[commands.length];
        for (int i = 0; i<commands.length; i++) {
            int startNum = commands[i][0] - 1;
            int endNum = commands[i][1] - 1;
            int sortNum = commands[i][2] - 1;
            for (int j = startNum; j <= endNum; j++) {
                sortList.add(array[j]);
            }
            Collections.sort(sortList);
            Integer sortTarget = sortList.get(sortNum);
            answer[i] = sortTarget;
            sortList.clear();
        }

        return answer;
    }
}
