package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Algortim {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String i = br.readLine();
        int n = Integer.parseInt(i);
        long first = (long) n * (n - 2);
        long second = first * (n - 1);
        long answer = second / 6;
        System.out.println(answer);
        System.out.println(3);
    }
}
