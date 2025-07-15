package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;

public class Trangle_10101 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        int[] points = new int[3];

        for (int i = 0; i < 3; i++) {
            points[i] = Integer.parseInt(br.readLine());
        }

        int sum = points[0] + points[1] + points[2];

        int sameCount = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (i != j) {
                    if (points[i] == points[j]) {
                        sameCount++;
                    }
                }
            }
        }
        if (points[0] == 60 && points[1] == 60 && points[2] == 60) {
            System.out.print("Equilateral");
        } else if (sum != 180) {
            System.out.print("Error");
        } else if (sameCount == 2) {
            System.out.print("Isosceles");
        } else if (sameCount == 1 || sameCount == 0) {
            System.out.print("Scalene");
        }
    }
}
