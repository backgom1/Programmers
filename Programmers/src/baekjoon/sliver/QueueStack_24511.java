package baekjoon.sliver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class QueueStack_24511 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        String[] dataStructure = br.readLine().split(" ");
        String[] split2 = br.readLine().split(" ");

        Deque<String> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if ("0".equals(dataStructure[i])) {
                deque.addLast(split2[i]);
            }
        }

        int t = Integer.parseInt(br.readLine());
        String[] split3 = br.readLine().split(" ");
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < t; i++) {
            deque.addFirst(split3[i]);
            if (i == t - 1) {
                answer.append(deque.pollLast());
            } else {
                answer.append(deque.pollLast()).append(" ");
            }

        }


        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }
}
