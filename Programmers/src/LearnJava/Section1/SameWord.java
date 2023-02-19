package LearnJava.Section1;

import java.util.Scanner;

public class SameWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String Check = "";
        StringBuilder stringBuilder = new StringBuilder(s);
        //기존 문자열
        String firstWord = s.toLowerCase();
        String lastWord = stringBuilder.reverse().toString().toLowerCase();
        //리버스 문자열
        //대소문자 상관 없다 했으니 소문자로 변환후 값을 처리했습니다.
        if(firstWord.equals(lastWord)){
            Check = "YES";
        }else {
            Check = "NO";
        }
        System.out.println(Check);
    }
}
