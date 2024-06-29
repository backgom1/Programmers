package Programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1. 큐의 전체의 합을 구하는 방법 -> 전체를 더하고 2로 나누면된다. 큐1의 합과 큐2의 합을 따로빼야한다.
 * 2. 첫번째큐와 두번째큐를 비교하여, 비교적 큰 큐에서 작은큐에 값을 옮겨넣는 작업을 진행한다.
 * 3. 만약 넣었을때 크기가 변환되어 큰 큐 , 작은큐가 나눠지면 2번과같은 반복을 진행하면된다.
 */
public class SameQueueSum {
    static int queue1Sum = 0;
    static int queue2Sum = 0;

    static Queue<Integer> queue1List = new LinkedList<Integer>();
    static Queue<Integer> queue2List = new LinkedList<Integer>();

    public int solution(int[] queue1, int[] queue2) {
        int answer = -2;
        init(queue1, queue2);


        return answer;
    }

    private void init(int[] queue1, int[] queue2) {
        for (int i : queue1) {
            queue1Sum += i;
            queue1List.add(i);
        }

        for (int i : queue2) {
            queue2Sum += i;
            queue1List.add(i);
        }
    }
}
