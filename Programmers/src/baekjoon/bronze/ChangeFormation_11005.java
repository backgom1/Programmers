package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
  입력값으로 주어진 값을 10진법으로 바꾸는 문제
 */
public class ChangeFormation_11005 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        String answer = Integer.toString(Integer.parseInt(split[0], 10), Integer.parseInt(split[1]));
        System.out.print(answer.toUpperCase());
    }
}
