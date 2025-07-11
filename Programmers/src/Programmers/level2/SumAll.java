package Programmers.level2;

import java.util.HashSet;
import java.util.Set;

public class SumAll {

    public static void main(String[] args) {
        int[] elements = {7, 9, 1, 1, 4};
        SumAll sol = new SumAll();
        int solution = sol.solution(elements);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] elements) {

        Set<Integer> set = new HashSet<>();
        int n = elements.length;

        for (int len = 1; len <= n; len++) {
            for (int start = 0; start < n; start++) {
                int sum = 0;
                for (int i = 0; i < len; i++) {
                    int index = (start + i) % n;
                    sum += elements[index];
                }

                set.add(sum);
            }
        }


        return set.size();
    }
}
