package LearnJava.Section1;

import java.util.Scanner;

public class WordZip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        s = s + " ";
        int count = 1;
        String answer = "";
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length - 1; i++) {
            if (chars[i] == chars[i + 1]) {
                count++;
            } else {
                answer += chars[i];
                if (count > 1) {
                    answer += count;
                }
                count = 1;
            }
        }
        System.out.println(answer);
    }
}
