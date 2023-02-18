package LearnJava.Section1;

import java.util.Scanner;

/**
 * 특정 문자열 뒤집기
 */
public class ReverseWord3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        char[] s = str.toCharArray();
        int lt = 0;
        int rt = str.length() - 1;
        while (lt < rt) {
            if (!Character.isAlphabetic(s[lt]))  // 문자열이 알파벳이 아니라면 즉 특수문자열입니다.
                lt++;
            else if (!Character.isAlphabetic(s[rt]))
                rt--;
            else {
                char tmp = s[lt];
                s[lt] = s[rt];
                s[rt] = tmp;
                lt++;
                rt--;
            }
        }
        System.out.println(String.valueOf(s));
    }
}
