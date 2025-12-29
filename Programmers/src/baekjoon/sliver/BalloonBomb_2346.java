package baekjoon.sliver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalloonBomb_2346 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Deque<Integer> deque = new ArrayDeque<>();
        Deque<Integer> index = new ArrayDeque<>();

        String[] number = br.readLine().split(" ");

        for (int i = 1; i <= n; i++) {
            index.addFirst(i);
        }

        for (String s : number) {
            deque.addFirst(Integer.parseInt(s));
        }

        StringBuilder sb = new StringBuilder();
        boolean move = true;
        while (!deque.isEmpty()) {
            int pop;
            int pollIndex;
            if (move) {
                pop = deque.pollLast();
                pollIndex = index.pollLast();
            } else {
                pop = deque.pollFirst();
                pollIndex = index.pollFirst();
            }
            sb.append(pollIndex).append(" ");
            if (deque.isEmpty() || index.isEmpty()) break;
            if (pop > 0) {
                for (int i = 0; i < pop - 1; i++) {
                    deque.addFirst(deque.pollLast());
                    index.addFirst(index.pollLast());
                }
                move = true;
            } else {
                int abs = Math.abs(pop) - 1;
                for (int i = 0; i < abs; i++) {
                    deque.addLast(deque.pollFirst());
                    index.addLast(index.pollFirst());
                }
                move = false;
            }

        }
        bw.write(sb.toString().trim());
        bw.flush();
        bw.close();
    }
}
