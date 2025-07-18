package baekjoon.bronze;

import java.io.IOException;
import java.util.Scanner;

public class Ant {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String answer;
        int money = sc.nextInt();

        int[] day = new int[14];

        for (int i = 0; i < 14; i++) {
            day[i] = sc.nextInt();
        }

        int junHun = 0;
        int sungMin = 0;


        int bnp = BNP(day, money);
        int timing = TIMING(day, money);
        junHun = bnp;
        sungMin = timing;


        if (junHun > sungMin) {
            answer = "BNP";
        } else if (junHun < sungMin) {
            answer = "TIMING";
        } else {
            answer = "SAMESAME";
        }

        System.out.println(answer);
    }

    static int TIMING(int[] day, int money) {
        int extraMoney = money;
        int stock = 0;
        for (int i = 3; i < 14; i++) {
            int Current = day[i];
            if (day[i - 1] < day[i - 2] && day[i - 2] < day[i - 3] && extraMoney > Current) {
                int now = extraMoney / day[i];
                stock += now;
                extraMoney -= now * day[i];
            } else if (day[i - 1] > day[i - 2] && day[i - 2] > day[i - 3]) {
                int sum = day[i] * stock;
                extraMoney += sum;

                stock = 0;
            }
        }
        return extraMoney + stock * day[13];
    }

    static int BNP(int[] day, int money) {
        int count = 0;
        int extraMoney = money;

        for (int i = 0; i < 14; i++) {
            int now = extraMoney / day[i];
            count += now;
            extraMoney -= now * day[i];
        }

        return extraMoney + count * day[13];
    }
}
