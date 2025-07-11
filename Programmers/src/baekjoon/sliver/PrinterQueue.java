package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class PrinterQueue {

    public static void main(String[] args) throws IOException {
        Queue<QueueNode> printerQueue = new LinkedList<>();
        Queue<Integer> printerSorted = new LinkedList<>();

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(bf.readLine());


        List<Integer> answer = new ArrayList<>();
        for (int i = 0; i < testCase; i++) {
            int answerSeq = 0;

            String[] actionCommand = bf.readLine().split(" ");
            String queueSize = actionCommand[0];
            String currentPoint = actionCommand[1];
            String[] queueList = bf.readLine().split(" ");
            String[] queueSort = Arrays.stream(queueList).sorted().toArray(String[]::new);
            int targetSort = Integer.parseInt(currentPoint);
            int targetNumber = Integer.parseInt(queueList[Integer.parseInt(currentPoint)]);

            initPrintQueue(queueList, printerQueue);
            initSortQueue(queueSort, printerSorted);
            while (!printerQueue.isEmpty()) {
                QueueNode queueNode = printerQueue.poll();
                int sortNumber = printerSorted.peek();
                if (sortNumber != queueNode.getPriorityNumber()) {
                    printerQueue.add(queueNode);
                } else {
                    printerSorted.poll();
                    answerSeq++;
                    if (targetNumber == queueNode.getPriorityNumber() && targetSort == queueNode.getSortedNumber()) {
                        answer.add(answerSeq);
                        break;
                    }
                }
            }
        }

        for (Integer i : answer) {
            System.out.println(i);
        }
    }

    private static void initPrintQueue(String[] queueList, Queue<QueueNode> printerQueue) {
        printerQueue.clear();
        for (int i = 0; i < queueList.length; i++) {
            printerQueue.add(new QueueNode(i, Integer.parseInt(queueList[i])));
        }
    }

    private static void initSortQueue(String[] queueList, Queue<Integer> printerSorted) {
        printerSorted.clear();
        for (int i = queueList.length-1; i >= 0; i--) {
            printerSorted.add(Integer.parseInt(queueList[i]));
        }

    }

}

class QueueNode {
    int sortedNumber;
    int priorityNumber;

    public QueueNode(int sortedNumber, int priorityNumber) {
        this.sortedNumber = sortedNumber;
        this.priorityNumber = priorityNumber;
    }

    public int getSortedNumber() {
        return sortedNumber;
    }

    public int getPriorityNumber() {
        return priorityNumber;
    }
}
