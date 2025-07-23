package baekjoon.sliver;

import java.io.*;
import java.util.Stack;

public class BalenceWorld_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            String target = br.readLine();
            if (target.charAt(0) == '.' && target.length() == 1) break;
            char[] chars = target.replaceAll(" ", "").toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean flag = false;
            for (int i = 0; i < chars.length; i++) {
                if (chars[i] == '.') break;
                if (!Character.isAlphabetic(chars[i])) {
                    if (stack.isEmpty() && (chars[i] == ']' || chars[i] == ')')) {
                        flag = true;
                        break;
                    }
                    if (chars[i] == ']' || chars[i] == ')') {
                        if (stack.peek() == '[' && chars[i] == ']') {
                            stack.pop();
                        } else if (stack.peek() == '(' && chars[i] == ')') {
                            stack.pop();
                        } else {
                            flag = true;
                            break;
                        }
                    } else {
                        stack.push(chars[i]);
                    }

                }
            }

            if (stack.isEmpty() && !flag) {
                bw.write("yes" + "\n");
            } else {
                bw.write("no" + "\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
