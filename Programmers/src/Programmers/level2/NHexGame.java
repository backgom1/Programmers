package Programmers.level2;

public class NHexGame {
    public static void main(String[] args) {
        int n = 16;
        int t = 16;
        int m = 2;
        int p = 1;
        NHexGame sol = new NHexGame();
        String solution = sol.solution(n, t, m, p);
        System.out.println("solution = " + solution);
    }

    public String solution(int n, int t, int m, int p) {
        String answer = "";
        String str = "";
        int i = 0;
        while (str.length() < t*m){
            str += Integer.toString(i++, n);
        }
        for (int j = 0; j < t; j++){
            answer += str.charAt(j*m + (p-1));
        }
        return answer.toUpperCase();
    }
}
