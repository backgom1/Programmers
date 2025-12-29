package baekjoon.sliver;

import java.io.*;
import java.util.ArrayDeque;
import java.util.Deque;

public class Deck2_28279 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int k = Integer.parseInt(br.readLine());

        Deque deque = new ArrayDeque<>();

        for (int i = 0; i < k; i++) {
            String n = br.readLine();
            if (n.length() > 1) {
                String[] split = n.split(" ");
                int num = Integer.parseInt(split[1]);
                switch (Integer.parseInt(split[0])) {
                    case 1:
                        deque.addFirst(num);
                        break;
                    case 2:
                        deque.addLast(num);
                        break;
                }
            } else {
                switch (Integer.parseInt(n)) {
                    case 3:
                        if (deque.isEmpty()) {
                            bw.write(-1 + "\n");
                        } else {
                            bw.write(deque.pollFirst() + "\n");
                        }
                        break;
                    case 4:
                        if (deque.isEmpty()) {
                            bw.write(-1 + "\n");
                        } else {
                            bw.write(deque.pollLast() + "\n");
                        }
                        break;
                    case 5:
                        bw.write(deque.size() + "\n");
                        break;
                    case 6:
                        if (deque.isEmpty()) {
                            bw.write(1 + "\n");
                        } else {
                            bw.write(0 + "\n");
                        }
                        break;
                    case 7:
                        if (deque.isEmpty()) {
                            bw.write(-1 + "\n");
                        } else {
                            bw.write(deque.peekFirst() + "\n");
                        }
                        break;
                    case 8:
                        if (deque.isEmpty()) {
                            bw.write(-1 + "\n");
                        } else {
                            bw.write(deque.peekLast() + "\n");
                        }
                        break;

                }
            }
        }
        bw.flush();
        bw.close();
    }
}
