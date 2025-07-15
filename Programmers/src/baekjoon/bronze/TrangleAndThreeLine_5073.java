package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;

public class TrangleAndThreeLine_5073 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        while (true) {
            String nextLine = br.readLine();
            if (nextLine.equals("0 0 0")) {
                break;
            }
            String[] split = nextLine.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);
            int c = Integer.parseInt(split[2]);

            if (a + b <= c || b + c <= a || a + c <= b) {
                System.out.println("Invalid");
                continue;
            }
            if (a != b && b != c && a != c) {
                System.out.println("Scalene");
                continue;
            }
            if (a == b && b == c) {
                System.out.println("Equilateral");
                continue;
            }

            if (a == b || b == c || a == c) {
                System.out.println("Isosceles");
            }
        }
    }
}
