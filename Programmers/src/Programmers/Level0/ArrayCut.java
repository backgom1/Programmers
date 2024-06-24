package Programmers.Level0;

public class ArrayCut {

    public int[] solution(int[] numbers, int num1, int num2) {
        int[] answer = new int[num2];
        int index = 0;
        for (int i = num1; i <= num2; i++) {
            answer[index] = numbers[i];
            index++;
        }
        return answer;
    }
}
