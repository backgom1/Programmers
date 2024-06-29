package Programmers.Level0;

public class EvenNumberSum {

    public int solution(int n) {
        int answer = 0;
        for (int i = 2; i < n; i = i + 2) {
            answer = answer + i;
        }
        return answer;
    }
}
