package Programmers.level1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] park = new String[]{"SOO", "OOO", "OOO"};
        String[] routes = new String[]{"E 2", "S 2", "W 1"};
        Solution solution = new Solution();
        solution.solution(park, routes);

    }

    public int[] solution(String[] park, String[] routes) {
        String[][] park_map = new String[park.length][park.length];
        Map<String, Integer> routes_list = new HashMap<>();
        int x = 0;
        int y = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park.length; j++) {
                park_map[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park.length; j++) {
                String[] routes_split = routes[j].split(" ");
                if (park_map[i][j].equals("S")) {
                    x = j;
                    y = i;

                }
            }
        }
        int[] answer = {};
        return answer;
    }


}

