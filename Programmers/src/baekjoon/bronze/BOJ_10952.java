package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ_10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String s = br.readLine();
            if ("0 0".equals(s)) break;
            String[] command = s.split(" ");
            int x = Integer.parseInt(command[0]);
            int y = Integer.parseInt(command[1]);
            System.out.println(x + y);
        }
    }
}
