package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;

public class FactorAndMultiple_5086 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new java.io.InputStreamReader(System.in));

        while (true) {
            String nextCase = br.readLine();
            if (nextCase.equals("0 0")) {
                break;
            }
            String[] split = nextCase.split(" ");
            int a = Integer.parseInt(split[0]);
            int b = Integer.parseInt(split[1]);

            if(b % a == 0){
                System.out.println("factor");
            }else if(a % b == 0){
                System.out.println("multiple");
            }else{
                System.out.println("neither");
            }
        }
    }
}
