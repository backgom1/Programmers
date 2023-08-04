package Programmers.level2;


import java.util.Arrays;


public class SumMin {
    public static void main(String[] args) {
        int[] A = new int[]{1, 4, 2};
        int[] B = new int[]{5, 4, 4};

        SumMin sol = new SumMin();
        System.out.println("sol = " +  sol.solution(A, B));

    }


    public int solution(int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        int answer = 0;

        for (int i = 0; i < A.length; i++) {
          answer += A[i] * B[A.length-i-1];
        }


        return answer;
    }
}
