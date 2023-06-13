package baekjoon;

import java.util.Scanner;

public class Room_Number_1475 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int answer = 1;
        int count = 0;
        int before = 0;
        int now = 1;
        for (int i = 0; i < input.length(); i++) {
            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(i) == 6 && input.charAt(i) == 9) {
                    if (input.charAt(i) == input.charAt(j)) count++;
                    if (count == 3) {
                        now++;
                        count = 0;
                    }
                } else {
                    if (input.charAt(i) == input.charAt(j)) count++;
                    if (count > 1) {
                        now++;
                        count = 0;
                    }
                    count =0;
                }
                if (now > before) {
                    before = now;
                    now = 1;
                }
            }
        }
        System.out.println("before = " + before);
    }
}
