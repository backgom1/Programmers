package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoomNumber_1475 {

    public static void main(String[] args) throws IOException {
        int[] check = new int[9];

        int answer = 1;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String numberLine = br.readLine();

        for (int i = 0; i < numberLine.length(); i++) {
            int number = numberLine.charAt(i) - '0';

            if (number == 6 || number == 9) {
                number = 6;
            }

            if (number == 6) {
                if ((check[number]) / 2 >= answer) {
                    answer++;
                }
            } else {

                if (check[number] >= answer) {
                    answer++;
                }
            }
            check[number]++;
        }

        System.out.print(answer);
    }
}
