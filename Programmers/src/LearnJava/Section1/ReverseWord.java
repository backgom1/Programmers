package LearnJava.Section1;

import java.util.Scanner;

public class ReverseWord {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] strs = new String[count];
        //받아올 숫자 카운팅하기 그후에 값을 집어넣기
        for (int i = 0; i < count; i++) {
            strs[i] = in.next();
        }

        // 받아온 배열을 빌더로 선언후 값을 reverse하고 스트링객체로 반환.
        for (String s : strs) {
            String tmp = new StringBuilder(s).reverse().toString(); //스트링 객체로 변환해줘야합니다.
            System.out.println(tmp);
        }
    }
}
