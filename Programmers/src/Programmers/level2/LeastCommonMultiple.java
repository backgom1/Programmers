package Programmers.level2;

public class LeastCommonMultiple {

    public static void main(String[] args) {
        LeastCommonMultiple sol = new LeastCommonMultiple();
        int[] arr = {2, 6, 8, 14};
        int solution = sol.solution(arr);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] arr) {
        int answer = 0;

        int sum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            answer = (sum * arr[i]) / gcd(sum, arr[i]);
            sum = answer;
        }
        return answer;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}
