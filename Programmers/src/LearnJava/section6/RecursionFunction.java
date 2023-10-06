package LearnJava.section6;

import java.util.Scanner;

public class RecursionFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        recursion(N);
    }

    private static void recursion(int n) {
        if(n == 0) return;
        recursion(n - 1);
        System.out.println(n);
    }
}
