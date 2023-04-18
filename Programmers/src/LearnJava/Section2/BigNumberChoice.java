package LearnJava.Section2;

import java.util.Scanner;

public class BigNumberChoice {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] list = new int[count];
        String answer = "";
        for (int i = 0; i < count; i++) {
            list[i] = Integer.parseInt(in.next());
        }
        answer += list[0]+" ";
        for (int i = 1; i < list.length; i++) {
            if (list[i] > list[i - 1]){
               answer += list[i]+" ";
            }
        }
        System.out.println(answer);
    }
}
