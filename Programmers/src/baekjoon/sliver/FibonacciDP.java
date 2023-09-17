package baekjoon.sliver;

import com.sun.tools.jconsole.JConsoleContext;

import java.util.Scanner;

public class FibonacciDP {

    public static int[] zeroCnt = new int[41];
    public static int[] oneCnt = new int[41];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        //0이 있는 케이스가 있을니까 -1로 초기화함
        for (int i = 0; i < 41; i++) {
            zeroCnt[i] = -1;
            oneCnt[i] = -1;
        }
        zeroCnt[0] = 1;
        zeroCnt[1] = 0;
        oneCnt[0] = 0;
        oneCnt[1] = 1;

        for (int i = 0; i < T; i++) {

            int targetNumber = sc.nextInt();
            int zeroCnt = Getcnt(targetNumber, false);
            int oneCnt = Getcnt(targetNumber, true);
            System.out.println(zeroCnt + " " + oneCnt);
        }
    }

    public static int Getcnt(int num, boolean type) {

        //아직 값이 준비가 되지 않았다
        if (zeroCnt[num] == -1 && oneCnt[num] == -1) {
            zeroCnt[num] = Getcnt(num - 1, false) + Getcnt(num - 2, false);
            oneCnt[num] = Getcnt(num - 1, true) + Getcnt(num - 2, true);
            if (type) {
                return oneCnt[num];
            } else {
                return zeroCnt[num];
            }
        } else {
            if (type) {
                return oneCnt[num];
            } else {
                return zeroCnt[num];
            }
        }
    }
}
