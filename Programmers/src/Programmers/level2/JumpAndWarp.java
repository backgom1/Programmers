package Programmers.level2;

public class JumpAndWarp {

    public static void main(String[] args) {
        JumpAndWarp sol = new JumpAndWarp();
        int solution = sol.solution(6);
        System.out.println("solution = " + solution);
    }

    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            if (n % 2 == 1) {
                n--;
                answer++;
            } else {
                n /= 2;
            }
        }

        return answer;
    }
}
