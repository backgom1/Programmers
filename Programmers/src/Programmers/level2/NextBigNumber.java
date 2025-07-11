package Programmers.level2;

public class NextBigNumber {

    public static void main(String[] args) {
        NextBigNumber sol = new NextBigNumber();
        int solution = sol.solution(15);
        System.out.println("solution = " + solution);
    }

    public int solution(int n) {
        int answer = 0;
        int targetBinary = Integer.bitCount(n);
        while (true) {
            n++;
            int binaryString = Integer.bitCount(n);
            if (targetBinary == binaryString) {
                answer = n;
                break;
            }
        }
        return answer;
    }
}
