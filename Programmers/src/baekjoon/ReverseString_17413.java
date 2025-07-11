package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class ReverseString_17413 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String command = br.readLine();
        Stack<Character> reverseStack = new Stack<>();

        StringBuilder sb = new StringBuilder();
        boolean noReverseFlag = false;

        char[] problemChar = command.toCharArray();
        for (char currentChar : problemChar) {

            if (noReverseFlag) {
                sb.append(currentChar);
                if (currentChar == '>') {
                    noReverseFlag = false;
                }
            } else {
                if (currentChar == ' ') {
                    flushStack(reverseStack, sb);
                    sb.append(currentChar);
                } else if (currentChar == '<') {
                    flushStack(reverseStack, sb);
                    sb.append(currentChar);
                    noReverseFlag = true;
                } else {
                    reverseStack.push(currentChar);
                }
            }
        }

        flushStack(reverseStack, sb);

        System.out.println(sb.toString());

    }

    private static void flushStack(Stack<Character> reverseStack, StringBuilder sb) {
        while (!reverseStack.isEmpty()) {
            sb.append(reverseStack.pop());
        }
    }
}
