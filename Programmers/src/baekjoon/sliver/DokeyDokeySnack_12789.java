package baekjoon.sliver;

import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class DokeyDokeySnack_12789 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        Queue<Integer> q = new LinkedList<>();
        String[] split = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            q.add(Integer.parseInt(split[i]));

        }
        Stack<Integer> waiting = new Stack<>();
        int index = 1;
        while (!q.isEmpty()) {
            if (!waiting.isEmpty() && waiting.peek() == index) {
                waiting.pop();
                index++;
            } else {
                Integer poll = q.poll();
                if (index == poll) {
                    index++;
                } else {
                    waiting.push(poll);
                }
            }
        }

        while (!waiting.isEmpty()) {
            Integer pop = waiting.peek();
            if (pop == index) {
                waiting.pop();
                index++;
            } else {
                break;
            }
        }

        if (q.isEmpty() && waiting.isEmpty()) {
            bw.write("Nice");
        } else {
            bw.write("Sad");
        }

        bw.flush();
        bw.close();
    }
}
