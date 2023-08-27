package baekjoon.gold;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RainWater {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] map = new int[M];

        for (int i = 0; i < M; i++) {
            int number = sc.nextInt();
            map[i] = Math.min(number,N);
        }

        int distance = 0;
        int max = map[0];
        int answer = 0;
        List<Integer> lowNumber = new ArrayList<>();
        for (int i = 1; i < map.length; i++) {


            if (i == M - 1) {
                if (map[i] <= max) {
                    int lastTotalWater = map[i] * distance;
                    for (Integer integer : lowNumber) {
                        lastTotalWater = lastTotalWater - integer;
                    }
                    answer += lastTotalWater;
                }else {
                    int totalRainWater = max * distance;
                    for (Integer integer : lowNumber) {
                        totalRainWater = totalRainWater - integer;
                    }
                    answer += totalRainWater;
                }
            } else {
                if (max <= map[i]) {
                    int totalRainWater = max * distance;
                    for (Integer integer : lowNumber) {
                        totalRainWater = totalRainWater - integer;
                    }
                    answer += totalRainWater;
                    max = map[i];
                    distance = 0;
                    lowNumber.clear();
                } else {
                    distance++;
                    lowNumber.add(map[i]);
                }
            }
        }
        System.out.println(answer);
    }
}
