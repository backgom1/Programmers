package LearnJava.Section1;

import java.util.Scanner;

public class DuplicateChar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String answer="";
        for (int i = 0; i < str.length(); i++) {
            if (i == str.indexOf(str.charAt(i))) { //처음으로 발견된 위치와 현재 위치와 같으면 중복되지 않은 문자열
                answer += str.charAt(i);
            }
        }
        System.out.println(answer);
    }
}
