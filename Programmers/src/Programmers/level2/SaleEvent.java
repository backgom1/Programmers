package Programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SaleEvent {


    public static void main(String[] args) {
        SaleEvent sol = new SaleEvent();
        String[] discount = {"chicken", "apple", "apple", "banana", "rice", "apple", "pork", "banana", "pork", "rice", "pot", "banana", "apple", "banana"};
        int[] number = {3, 2, 2, 2, 1};
        String[] want = {"banana", "apple", "rice", "pork", "pot"};
        int solution = sol.solution(want, number, discount);
        System.out.println("solution = " + solution);
    }

    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        Map<String, Integer> withList = new HashMap<>();

        for (int i = 0; i < want.length; i++) {
            withList.put(want[i], i);
        }

        for (int start = 0; start <= discount.length - 10; start++) {
            int[] withCount = new int[want.length];

            for (int i = start; i < start + 10; i++) {
                if (withList.containsKey(discount[i])) {
                    Integer index = withList.get(discount[i]);
                    withCount[index]++;
                }
            }

            boolean equals = Arrays.equals(number, withCount);
            if (equals) {
                answer++;
            }
        }

        return answer;
    }
}
