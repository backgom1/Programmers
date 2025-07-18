package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number666 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 1;
        int number = 666;

        while(answer != N) {
            number++;

            // int형인 num을 String으로 변환한 뒤, "666"이란 문자열이 있는지 검사
            if(String.valueOf(number).contains("666")) {
                answer++;
            }
        }

        System.out.print(number);
    }
}
