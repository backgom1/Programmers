package learn;

import java.util.LinkedList;
import java.util.Queue;

public class MyQueue {

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        System.out.println("peek() = " + q.peek());

        System.out.println("poll() = " + q.poll());

        System.out.println("peek() = " + q.peek());
    }
}
