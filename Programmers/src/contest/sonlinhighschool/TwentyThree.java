package contest.sonlinhighschool;

import java.util.Scanner;

/**
 * 테스트 케이스 T
 * 몇번째로 작은 숫잔지 알려주는 K
 * 처음이 2 즉 2번째로 작은 숫자
 * 23 * 2 = 46 입니다.
 */
public class TwentyThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        int[] answer = new int[T];
        for (int i = 0; i < T; i++) {
            int K = sc.nextInt();
            answer[i] = 23 * K;
        }

        for (int i : answer) {
            System.out.println(i);
        }
    }
}
