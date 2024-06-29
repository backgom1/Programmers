package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;


/**
 * 주어진 n 이하의 모든 홀수를 반환합니다.
 *
 * 이 메서드는 i를 2씩 증가시켜 홀수를 구합니다.
 * 이 방법은 if 조건을 사용하는 방법보다 더 효율적입니다.
 * i = i+2 ->  루프는 홀수 인덱스만 다루기 때문에, 반복 횟수는 절반으로 줄어듬, 시간 복잡도는 O(n/2) = O(n)
 * if문 -> 루프는 모든 인덱스를 다루고, 각 인덱스마다 if 조건을 체크합니다. (시간 복잡도는 O(n))
 *
 * @return 홀수 배열
 */
public class DoubleNo {

    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        int index = 0;
        for(int i =1; i<=n; i = i+2){
            list.add(i);
            index++;
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
