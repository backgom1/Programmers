package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DividedSum {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        for (int target = 1; target <= 1000000; target++) {
            String strTarget = String.valueOf(target);
            int sum = target;
            for (int i = 0; i < strTarget.length(); i++) {
                sum += Integer.parseInt(String.valueOf(strTarget.charAt(i)));
            }
            
            if(sum == N){
                answer = target;
                break;
            }
        }
        System.out.print(answer);
    }

}
