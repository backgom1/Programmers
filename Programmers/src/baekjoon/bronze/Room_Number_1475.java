package baekjoon.bronze;

import java.util.Scanner;

public class Room_Number_1475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int count;
        int before = 0;
        int now = 0;
        for (int i = 0; i < input.length(); i++) {
            count = 0;
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == '6' || input.charAt(i) == '9') {
                    if (input.charAt(i) == input.charAt(j)) {
                        count++;
                    }
                } else {
                    if (input.charAt(i) == input.charAt(j)) count++;
                    if (count == 1) {
                        now++;
                        count = 0;
                    }
                }
            }
            if (input.charAt(i) == '6' || input.charAt(i) == '9') {
                now = (count / 2) + (count % 2);
            }
            if (now >= before) {
                before = now;
                now = 0;
            }

        }
        System.out.println(before);
    }
}
