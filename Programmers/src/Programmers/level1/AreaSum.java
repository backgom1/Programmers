package Programmers.level1;

public class AreaSum {

    public static void main(String[] args) {
        int n = 123;

        AreaSum areaSum = new AreaSum();
        int solution = areaSum.solution(n);
        System.out.println("solution = " + solution);
    }
    public int solution(int n) {
        int answer = 0;
        String[] split_nums = String.valueOf(n).split("");
        for (String splitNum : split_nums) {
            answer += Integer.parseInt(splitNum);
        }
        return answer;
    }
}
