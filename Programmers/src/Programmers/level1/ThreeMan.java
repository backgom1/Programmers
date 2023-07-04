package Programmers.level1;

public class ThreeMan {

    public static void main(String[] args) {
        int[] number = new int[]{-2, 3, 0, 2, -5};
        ThreeMan threeMan = new ThreeMan();
        int solution = threeMan.solution(number);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] number) {
        int answer = 0;
        for (int i = 0; i < number.length; i++) {
            for (int j = i + 1; j < number.length; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) answer++;
                }
            }
        }
        return answer;
    }
}
