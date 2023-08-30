package baekjoon.gold;

import java.util.Scanner;

public class RainWater {
    /*
     * 왼쪽과 오른쪽을 비교하여 하나씩 줄여나가면서 푸는 방법
     * 만약에 현재 위치의 왼쪽과 오른쪽중에 왼쪽이 작다면 왼쪽에서 이제 현재 왼쪽 최대 크기와 비교하고 다음 탐색
     * 반대도 마찬가지로 max보다 작으면 빗물이 고인것으로 판단하여 값을 더해줌
     * max보다 크면 max를 바꿔 주면된다.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] map = new int[M];

        for (int i = 0; i < M; i++) {
            int number = sc.nextInt();
            map[i] = Math.min(number,N);
        }

        int answer = 0;
        int currentLeft = 0;
        int currentRight = M - 1;
        int leftMax = 0;
        int rightMax = 0;

        while (currentLeft < currentRight) {
            if (map[currentLeft] < map[currentRight]) {
                if (map[currentLeft] > leftMax) {
                    leftMax = map[currentLeft];
                } else {
                    answer += leftMax - map[currentLeft];
                }
                currentLeft++;
            } else {
                if (map[currentRight] > rightMax) {
                    rightMax = map[currentRight];
                } else {
                    answer += rightMax - map[currentRight];
                }
                currentRight--;
            }
        }

        System.out.println(answer);
    }
}