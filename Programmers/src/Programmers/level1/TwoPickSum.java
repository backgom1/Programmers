package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TwoPickSum {
    public static void main(String[] args) {
        int[] numbers = new int[]{5,0,2,7};
        TwoPickSum sol = new TwoPickSum();
        int[] solution = sol.solution(numbers);

        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] numbers) {
        Arrays.sort(numbers);
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (i != j) {
                    int target = numbers[i] + numbers[j];
                    if(!result.contains(target)){
                        result.add(target);
                    }
                }

            }
        }
        int[] answer = new int[result.size()];
        Collections.sort(result);
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }
}
