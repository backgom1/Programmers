package baekjoon;

import java.util.*;

public class Budget_2512 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        List<Integer> budgetNumber = new ArrayList<>();

        for (int i = 0; i < cnt; i++) {
            budgetNumber.add(sc.nextInt());
        }

        int totalBudget = sc.nextInt();

        int answer = remainingBudget(budgetNumber, totalBudget);
        System.out.println(answer);

    }

    public static int remainingBudget(List<Integer> budgetNumber, int totalBudget) {
        int max = Collections.max(budgetNumber);
        int sum = 0;
        int answer = 0;
        for (int num : budgetNumber) {
            sum += num;
        }
        if (sum > totalBudget) {
            for (int i = max; i > 0; i--) {
                int total = 0;
                for (int num : budgetNumber) {
                    if (num > i) {
                        total += i;
                    } else {
                        total += num;
                    }
                }
                if(total<=totalBudget){
                    answer = i;
                    return answer;
                }
            }
        } else {
            answer = max;
            return answer;
        }
        return 0;
    }
}
