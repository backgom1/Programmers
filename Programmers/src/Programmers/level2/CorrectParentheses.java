package Programmers.level2;

import java.util.Stack;

public class CorrectParentheses {

    public static void main(String[] args) {
        String s = ")()(";

        CorrectParentheses s2 = new CorrectParentheses();
        boolean solution = s2.solution(s);
        System.out.println("solution = " + solution);
    }

    boolean solution(String s) {
        boolean answer = true;
        int cnt = 0;
        for (int i = 0; i < s.length(); i++) {
            char currentParentheses = s.charAt(i);
            if(cnt > 0){
                return false;
            }
            if (currentParentheses == '(') {
                cnt--;
            } else {
                cnt++;
            }

        }
        if (cnt != 0) {
            answer = false;
        }
        return answer;
    }
}
