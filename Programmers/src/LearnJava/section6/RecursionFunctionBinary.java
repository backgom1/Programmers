package LearnJava.section6;

import java.util.Scanner;

public class RecursionFunctionBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        recursion(N);
    }

    private static void recursion(int n) {
        if (n == 0) return;
        else {
            recursion(n / 2); // 나머지
            System.out.println(n % 2); // 몫
        }

    }
}
