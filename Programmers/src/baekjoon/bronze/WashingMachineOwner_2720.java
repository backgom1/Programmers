package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
    손님이 받는 동전의 개수를 최소로 하려고 한다 -> 최적의 해를 찾는 것 그리디 알고리즘
    제일 큰 순서대로 부터 나눠 나머지를 쭉쭉 가져간다.
 */
public class WashingMachineOwner_2720 {
    static double QUARTER = 0.25;
    static double DIME = 0.10;
    static double NICKEL = 0.05;
    static double PENNY = 0.01;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int pay = Integer.parseInt(br.readLine());
            int quarterCount = (int) (pay / (QUARTER * 100));
            pay = (int) (pay % (QUARTER * 100));

            int dimeCount = (int) (pay / (DIME * 100));
            pay = (int) (pay % (DIME * 100));

            int nickelCount = (int) (pay / (NICKEL * 100));
            pay = (int) (pay % (NICKEL * 100));

            int pennyCount = (int) (pay / (PENNY * 100));
            pay = (int) (pay % (PENNY * 100));

            System.out.println(quarterCount + " " + dimeCount + " " + nickelCount + " " + pennyCount);
        }


    }
}
