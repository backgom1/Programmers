package baekjoon.sliver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OneLineSet {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] manLocation = new int[N+1];
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            manLocation[i] = sc.nextInt();
        }
        for(int i=N; i>=1; i--) {
            answer.add(manLocation[i], i);
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }

    }
}
