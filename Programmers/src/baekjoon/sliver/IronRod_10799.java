package baekjoon.sliver;


import java.io.*;
import java.util.Stack;

/**
 * '(' 일때 스택에 넣고 ')' 일때 스택에서 빼고
 * 만약 '('가 나왔는데 그 뒤에 ')'가 나오면 스택에 있는 '('를 빼고 스택에 있는 '('의 개수를 더한다. (더하는건 스택.size + 1  +1을 더하는 이유는 하나를 자르면 2개가 나오고 2개를 자르면 3개 n+1개로 증가하기 때문
 */
public class IronRod_10799 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Stack<String> rodStack = new Stack<>();
        String[] RodLine = bf.readLine().split("");
        String beforeRod = "";
        int answer = 0;
        for (String splitRod : RodLine) {
            if (splitRod.equals("(")) {
                rodStack.push(splitRod);
                beforeRod = "(";
            } else {
                if (beforeRod.equals("(") && splitRod.equals(")")) {
                    rodStack.pop();
                    if (!rodStack.isEmpty()) {
                        answer += rodStack.size();
                    }
                } else {
                    rodStack.pop();
                    answer += 1;
                }
                beforeRod = ")";
            }
        }

        bw.write(answer + "");
        bw.flush();
        bw.close();
    }
}
