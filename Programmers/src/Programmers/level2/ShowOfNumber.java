package Programmers.level2;

public class ShowOfNumber {
    public static void main(String[] args) {
        int n = 15;
        ShowOfNumber sol = new ShowOfNumber();
        int solution = sol.solution(n);
        System.out.println("solution = " + solution);
    }

    public int solution(int n) {
        int answer = 0;
        int startNumber = 1;
        int sumNumber = 0;
        while (startNumber <= n) {
            for (int i = startNumber; i <= n; i++) {
                sumNumber += i;
                if (sumNumber == n) {
                    answer++;
                }
                if (sumNumber > n) {
                    break;
                }
            }


            startNumber++;
            sumNumber = 0;
        }
        return answer;
    }
}
