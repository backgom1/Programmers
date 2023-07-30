package Programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class StockPrice {

    public static void main(String[] args) {
        int[] prices = new int[]{1, 2, 3, 2, 3};
        StockPrice sol = new StockPrice();
        int[] solution = sol.solution(prices);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] prices) {
        int cnt;
        boolean b;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < prices.length; i++) {
            b = true;
            cnt = 0;
            int targetPrice = prices[i];
            for (int j = i + 1; j < prices.length; j++) {
                cnt++;
                if (targetPrice > prices[j]) {
                    list.add(cnt);
                    b = false;
                    break;
                }
            }
            if(b) list.add(cnt);
        }
        int[] answer = new int[list.size()];

        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
