package Programmers.Level0;

import java.util.Arrays;

public class EvenOddNumber {
    public int[] solution(int[] num_list) {
        return new int[]{(int) Arrays.stream(num_list).filter(num -> num % 2 != 1).count(), (int) Arrays.stream(num_list).filter(num -> num % 2 == 1).count()};
    }
}
