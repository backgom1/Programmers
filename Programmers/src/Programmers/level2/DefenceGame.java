package Programmers.level2;

import java.util.PriorityQueue;

public class DefenceGame {

    public static void main(String[] args) {
        DefenceGame sol = new DefenceGame();

        System.out.println("sol = " + sol.solution(7, 3, new int[]{4, 2, 4, 5, 3, 3, 1}));
        System.out.println("sol = " + sol.solution(2, 4, new int[]{3, 3, 3, 3}));
        System.out.println("sol = " + sol.solution(5, 1, new int[]{3, 1, 1, 1, 2, 2, 10}));
    }

    public int solution(int n, int k, int[] enemy) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));

        int answer = 0;

        for (int enemyMonster : enemy) {
            n -= enemyMonster;
            pq.offer(enemyMonster);
            if (n < 0) {
                if (k > 0) {
                    answer++;
                    k--;
                    Integer poll = pq.poll();
                    n += poll;
                } else {
                    return answer;
                }

            } else {
                answer++;
            }
        }

        return answer;
    }


}
