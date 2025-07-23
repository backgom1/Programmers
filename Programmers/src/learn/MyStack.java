package learn;

import java.util.Arrays;
import java.util.Stack;

public class MyStack {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        Integer element = stack.peek();
        System.out.println("peek() element = " + element);

        Integer pop = stack.pop();
        System.out.println("pop() element = " + pop);

        System.out.print(Arrays.toString(stack.toArray()));

    }
}
