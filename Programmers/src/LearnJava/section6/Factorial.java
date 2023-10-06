package LearnJava.section6;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(recursion(N));

    }

    private static int recursion(int n) {
        if (n == 0) return 1;
        else {
            return n*recursion(n - 1);
        }
    }
}
