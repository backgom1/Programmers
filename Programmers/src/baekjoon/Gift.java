package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Gift {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int command = Integer.parseInt(br.readLine());
        Queue<Integer> roundQueue = new LinkedList<>();

        for (int i = 1; i <= command; i++) {
            roundQueue.add(i);
        }

        int stage = 1;
        while (roundQueue.size() != 1) {
            long steps = (long) stage * stage * stage;
            steps %= roundQueue.size();
            if (steps == 0) {
                steps = roundQueue.size();
            }

            for (int i = 0; i < steps - 1; i++) {
                roundQueue.offer(roundQueue.poll());
            }

            roundQueue.poll();
            stage++;
        }


        System.out.print(roundQueue.peek());
    }
}
