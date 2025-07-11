package Programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    public static void main(String[] args) {
        Fibonacci sol = new Fibonacci();
        System.out.println(sol.solution(3));
    }

    public int solution(int n) {
        List<Integer> fibonacciList = new ArrayList<>();
        fibonacciList.add(1);
        fibonacciList.add(1);

        for (int i = 2; i < n; i++) {
            int fib = ((fibonacciList.get(i - 2) + fibonacciList.get(i - 1))) % 1234567;
            fibonacciList.add(fib);
        }

        return fibonacciList.get(n-1);
    }
}
