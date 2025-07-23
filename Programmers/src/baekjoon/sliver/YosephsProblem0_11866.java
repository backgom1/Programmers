package baekjoon.sliver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class YosephsProblem0_11866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int K = Integer.parseInt(split[1]);

        if (N == 1) {
            bw.write("<" + 1 + ">");
            bw.flush();
            bw.close();
            return;
        }

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            q.add(i);
        }

        StringBuilder answer = new StringBuilder();

        int count = 0;
        while (!q.isEmpty()) {
            for (int i = 0; i < K - 1; i++) {
                q.offer(q.poll());
            }
            Integer removedNumber = q.poll();
            if (count == 0) {
                answer.append("<").append(removedNumber);
            } else {
                answer.append(", ").append(removedNumber);
            }
            count++;
        }
        answer.append(">");
        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }
}
