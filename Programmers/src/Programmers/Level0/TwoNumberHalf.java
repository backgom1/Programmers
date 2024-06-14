package Programmers.Level0;

public class TwoNumberHalf {


    public static void main(String[] args) {
        int num1 = 3;
        int num2 = 2;
        TwoNumberHalf twoNumberHalf = new TwoNumberHalf();

        twoNumberHalf.solution(num1, num2);
    }

    public int solution(int num1, int num2) {
        int a = num1 * 1000;

        return a / num2;

    }
}
