package LearnJava.Section1;

import java.util.Scanner;

public class ReverseWord2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        String[] strs = new String[count];
        //받아올 숫자 카운팅하기 그후에 값을 집어넣기
        for (int i = 0; i < count; i++) {
            strs[i] = in.next();
        }

        // 직접 구현하는 방법
        for (String s : strs) {
            char[] x = s.toCharArray();
            int lt = 0;
            int rt = s.length() - 1;
            while (lt < rt) {
                char temp = x[lt];
                x[lt] = x[rt];
                x[rt] = temp;
                lt++;
                rt--;
            }
            System.out.println(strs);
        }
    }
}
