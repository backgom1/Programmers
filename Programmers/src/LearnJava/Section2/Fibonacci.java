package LearnJava.Section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cnt = in.nextInt();
        int[] fibo = new int[cnt];
        fibo[0] = 1;
        fibo[1] = 1;

        for (int i = 2; i < cnt; i++) {
            fibo[i] = fibo[i - 2] + fibo[i - 1];
        }
        for (int s : fibo) {
            System.out.print(s + " ");
        }

    }
}
