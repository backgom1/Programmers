package baekjoon.sliver;

import java.io.*;
import java.util.Stack;

public class Stack2_28278 {
    static Stack<Integer> stack = new Stack<>();
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());


        for (int i = 0; i < n; i++) {
            stackCommand(br.readLine());
        }

        bw.flush();
        bw.close();
    }

    private static void stackCommand(String s) throws IOException {
        if (s.length() > 1) {
            String[] split = s.split(" ");
            stack.push(Integer.parseInt(split[1]));
        } else {
            int number = Integer.parseInt(s);

            switch (number) {
                case 2:
                    if (stack.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(stack.pop() + "\n");
                    }
                    break;
                case 3:
                    bw.write(stack.size() + "\n");
                    break;
                case 4:
                    if (stack.isEmpty()) {
                        bw.write("1" + "\n");
                    } else {
                        bw.write("0" + "\n");
                    }
                    break;
                case 5:
                    if (stack.isEmpty()) {
                        bw.write(-1 + "\n");
                    } else {
                        bw.write(stack.peek() + "\n");
                    }
                    break;
            }
        }

    }
}
