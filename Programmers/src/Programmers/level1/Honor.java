package Programmers.level1;

import java.util.PriorityQueue;

public class Honor {
    public static void main(String[] args) {
        int k = 4;
        int[] score = new int[]{0, 300, 40, 300, 20, 70, 150, 50, 500, 1000};
        Honor sol = new Honor();
        int[] solution = sol.solution(k, score);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        for (int i = 0; i < k; i++) {
            priorityQueue.offer(score[i]);
            answer[i] = priorityQueue.peek();
        }

        for (int i = k; i < score.length; i++) {
            if (priorityQueue.peek() <= score[i]) {
                priorityQueue.poll();
                priorityQueue.offer(score[i]);
            }
            answer[i] = priorityQueue.peek();
        }

        return answer;
    }
}
