package Programmers.level2;

import java.util.Stack;

public class PartnerDelete {

    public static void main(String[] args) {
        PartnerDelete sol = new PartnerDelete();
        int solution = sol.solution("baabaa");
        System.out.println("solution = " + solution);
    }

    public int solution(String s) {
        if (s.length() % 2 == 1) return 0;
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (!stack.isEmpty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }
}
