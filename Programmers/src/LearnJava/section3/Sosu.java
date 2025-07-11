package LearnJava.section3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sosu {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int number = Integer.parseInt(br.readLine());

        boolean[] arr = new boolean[number];
        int answer = 0;

        for (int i = 2; i < number; i++) {
            if (!arr[i]) {
                arr[i] = true;
                answer++;
                for (int j = i; j < arr.length; j += i) {
                    arr[j] = true;
                }
            }
        }

        System.out.print(answer);
    }
}
