package Programmers.level2;

public class GuessFightTable {

    public static void main(String[] args) {
        GuessFightTable sol = new GuessFightTable();
        int solution = sol.solution(8, 4, 7);
        System.out.println("solution = " + solution);
    }

    public int solution(int n, int a, int b) {
        int answer = 0;

        int round = 1;
        while (true) {
            int groupSize = (int) Math.pow(2, round - 1);
            int groupA = (a - 1) / groupSize;
            int groupB = (b - 1) / groupSize;
            if(groupA == groupB){
                break;
            }
            answer++;
            round++;
        }

        return answer;
    }
}
