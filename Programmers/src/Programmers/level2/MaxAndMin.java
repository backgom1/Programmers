package Programmers.level2;

public class MaxAndMin {

    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        MaxAndMin sol = new MaxAndMin();
        System.out.println(sol.solution(s));
    }

    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        String[] splitStr = s.split(" ");
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
        for (String value : splitStr) {
            int targetNum = Integer.parseInt(value);
            max = Math.max(max, targetNum);
            min = Math.min(min, targetNum);
        }
        return sb.append(min).append(" ").append(max).toString();
    }
}
