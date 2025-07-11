package Programmers.level2;

import java.util.*;

public class OrangeChoice {

    public static void main(String[] args) {
        OrangeChoice sol = new OrangeChoice();
        int solution = sol.solution(6, new int[]{1, 3, 2, 5, 4, 5, 2, 3});
        System.out.println("solution = " + solution);
    }

    public int solution(int k, int[] tangerine) {
        int answer = 0;

        Map<Integer,Integer> map = new HashMap<>();

        for (int j : tangerine) {

            int count = map.getOrDefault(j, 0);

            map.put(j, count + 1);
        }

        List<Integer> valueList = new ArrayList<>(map.values());
        valueList.sort(Collections.reverseOrder());

        for (Integer integer : valueList) {

            k -= integer;
            answer++;
            if (k <= 0) {
                break;
            }
        }

        return answer;
    }
}
