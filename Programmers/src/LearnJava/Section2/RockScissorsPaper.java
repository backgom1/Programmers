package LearnJava.Section2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RockScissorsPaper {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] a = new int[num];
        int[] b = new int[num];
        List<String> answer = new ArrayList<>();

        //두개를 한번에 담는 방법
        for (int i = 0; i < num; i++) {
            a[i] = in.nextInt();
        }
        for (int i = 0; i < num; i++) {
            b[i] = in.nextInt();
        }

        //가위바위보 로직
        for (int i = 0; i < num; i++) {
            if (a[i] == b[i]) answer.add("D");
            else if (a[i] == 1 && b[i] == 3) answer.add("A");
            else if (a[i] == 2 && b[i] == 1) answer.add("A");
            else if (a[i] == 3 && b[i] == 2) answer.add("A");
            else answer.add("B");
        }
        for (String s : answer) {
            System.out.println(s);
        }
    }
}
