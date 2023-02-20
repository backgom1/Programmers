package LearnJava.Section1;

import java.util.Scanner;

public class PassWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String str = in.next();
        String changeWord = "";
        String answer = "";


        //문자열 -> 숫자로 변환
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                changeWord += 1;
            } else {
                changeWord += 0;
            }
        }

        for (int i = 0; i < count; i++) {
            //문자열을 끊어서 하는 명령어
            String substring = changeWord.substring(i * 7, ((i + 1) * 7));
            //2-> 10진수로 변환하는 코드 명령어
            int tmp = Integer.valueOf(substring, 2);
            //char형으로 변환해주는 명령어
            char c = (char) tmp;
            answer += c;
        }
        System.out.println(answer);
    }
}
