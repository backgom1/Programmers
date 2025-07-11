package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FindFraction_1193 {

    static int DOWN = 1;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());
        String answer = "";
        int direction;


        int startNumber = 0;
        while (true) {
            startNumber++;

            if (number - startNumber == 0) {

                if (startNumber % 2 == 1) {
                    direction = 0;
                } else {
                    direction = 1;
                }

                if (direction == 0) {
                    answer += 1 + "/" + startNumber;
                } else {
                    answer += startNumber + "/" + 1;
                }
                break;
            }
            if (number - startNumber < 0) {

                if ((startNumber + 1) % 2 == 0) {
                    direction = 1;
                } else {
                    direction = 0;
                }

                if (direction == DOWN) {
                    answer = ((startNumber + 1) - number) + "/" + (number);
                } else {
                    answer = (number) + "/" + ((startNumber + 1) - number);
                }
                break;
            }
            number -= startNumber;

        }

        System.out.print(answer);
    }
}
