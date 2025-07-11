package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Sum_9506 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int number = Integer.parseInt(br.readLine());
            List<Integer> list = new ArrayList<>();
            if (number == -1) break;

            int sum = 1;
            String basicNumber = "1";
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0 && !list.contains(i)) {
                    int divideNumber = number / i;
                    sum += divideNumber;
                    sum += i;

                    list.add(divideNumber);
                    list.add(i);
                }
            }

            if (sum > number || sum < number) {
                System.out.println(number + " is NOT perfect.");
            } else {
                Collections.sort(list);
                for (Integer integer : list) {
                    basicNumber += " + " + integer;
                }


                System.out.println(number + " = " + basicNumber);
            }
        }

    }
}
