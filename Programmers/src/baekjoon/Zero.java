package baekjoon;

import java.util.Scanner;
import java.util.Stack;

public class Zero {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int answer = 0;

        for (int i = 0; i < cnt; i++) {
            int inputStack = sc.nextInt();
            if (!stack.isEmpty() &&inputStack == 0) {
                stack.pop();
            } else {
                stack.push(inputStack);
            }
        }

        while (!stack.isEmpty()) {
            answer += stack.pop();
        }
        System.out.println(answer);
    }

}
