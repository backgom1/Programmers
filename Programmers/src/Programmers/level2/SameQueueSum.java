package Programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 1. 큐의 전체의 합을 구하는 방법 -> 전체를 더하고 2로 나누면된다. 큐1의 합과 큐2의 합을 따로빼야한다.
 * 2. 첫번째큐와 두번째큐를 비교하여, 비교적 큰 큐에서 작은큐에 값을 옮겨넣는 작업을 진행한다.
 * 3. 만약 넣었을때 크기가 변환되어 큰 큐 , 작은큐가 나눠지면 2번과같은 반복을 진행하면된다.
 */
public class SameQueueSum {
    static Queue<Integer> queueList1 = new LinkedList<>();
    static Queue<Integer> queueList2 = new LinkedList<>();

    static long queue1Size = 0;
    static long queue2Size = 0;

    public static void main(String[] args) {
        SameQueueSum sameQueueSum = new SameQueueSum();
        int[] queue1 = {1,2,3,4};
        int[] queue2 = {1};
        System.out.println("답 = " + sameQueueSum.solution(queue1,queue2));
    }

    public int solution(int[] queue1, int[] queue2) {
        init(queue1, queue2);
        int maxCount = (2 * (queue1.length + queue2.length)) - 1; //모든 경우의 수
        int minCount = 0;//최소 경우의 수
        long halfSize = (queue2Size + queue1Size) / 2; // 구해야하는 수

        while (minCount <= maxCount) {

            if (queue1Size == queue2Size) {
                return minCount;
            }

            if (queue1Size > queue2Size) {
                int pollCount = queueList1.poll();
                queue1Size -= pollCount;
                queue2Size += pollCount;
                queueList2.add(pollCount);
                minCount++;
                continue;
            }

            if (queue1Size < queue2Size) {
                int pollCount = queueList2.poll();
                queue1Size += pollCount;
                queue2Size -= pollCount;
                queueList1.add(pollCount);
                minCount++;
                continue;
            }

        }


        return -1;
    }

    private void init(int[] queue1, int[] queue2) {
        for (int i : queue1) {
            queueList1.add(i);
            queue1Size += i;
        }

        for (int i : queue2) {
            queueList2.add(i);
            queue2Size += i;
        }
    }
}
