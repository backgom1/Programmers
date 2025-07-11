package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

public class Card_1 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        String answer = "";

        ArrayDeque<Integer> queue = new ArrayDeque<>();
        for (int i = 1; i <= number; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            if (queue.size() == 1) {
                answer += queue.poll();
                break;
            }
            answer += queue.pollFirst() + " ";
            queue.addLast(queue.pollFirst());
        }

        System.out.print(answer);
    }
}
