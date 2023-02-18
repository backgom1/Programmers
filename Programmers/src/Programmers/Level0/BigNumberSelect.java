package Programmers.Level0;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class BigNumberSelect {

    public int[] solution(int[] array) {
        List<Integer> answer = new ArrayList<>();
        //최대값
        int max = 0;
        //인덱스 번호
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            //인덱스번호가 최대값보다 크면 max값을 변경 인덱스 번호 변경
            if (max < array[i]) {
                max = array[i];
                index = i;
            }
        }
        answer.add(max);
        answer.add(index);
        System.out.println(answer);
        return answer.stream().mapToInt(i -> i).toArray();
        //int[] answer = {max, index}; 로 값을 집어넣었어도됐다.
        //List<Interger> -> int 배열로 변환하는메서드
    }

    public static void main(String[] args) {
        BigNumberSelect bigNumberSelect = new BigNumberSelect();
        bigNumberSelect.solution(new int[]{9, 10, 11, 8, 12});
    }
}
