package LearnJava.section3;

import java.io.BufferedReader;
import java.io.IOException;

public class SubSequence {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);
        int[] arr = new int[N];

        String[] splitNumber = br.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(splitNumber[i]);
        }

        int lt = 0;
        int rt = 0;

        int answer = 0;
        int number = 0;
        while (rt < arr.length) {

            for (int i = lt; i < rt; i++) {
                number += arr[i];

                if (number == M) {
                    answer++;
                }
                if (number > M) {
                    number -= arr[i];
                    lt++;
                }
            }


            rt++;

        }


    }

}
