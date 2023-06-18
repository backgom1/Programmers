package LearnJava.Section2;

import java.util.Scanner;

public class CountExam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] check = new int[cnt];
        int answer = 0;
        int up = 1;

        for (int i = 0; i < cnt; i++) {
            check[i] = sc.nextInt();
        }

        for (int i = 0; i < cnt; i++) {
            if (check[i] == 1) {
                answer += up;
                if (check[i] == check[i + 1]) {
                    up++;
                }
            } else {
                up = 1;
            }
        }
        System.out.println(answer);
    }
}
