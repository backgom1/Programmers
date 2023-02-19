package LearnJava.Section1;

import java.util.Scanner;

public class WordDistance {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] s1 = s.split(" ");
        char c = s1[1].charAt(0);
        int[] answer = new int[s1[0].length()];
        int score = 1000;
        for (int i = 0; i < s1[0].length(); i++) {
            if (s1[0].charAt(i) == c) {
                score = 0;
                answer[i] = score;
            } else {
                score++;
                answer[i] = score;
            }
        }
        score =1000;
        for (int i = s1[0].length()-1; i >= 0; i--) {
            if (s1[0].charAt(i) == c) {
                score = 0;
            } else {
                score++;
                //둘중에 작은수로 넣기
                answer[i] = Math.min(answer[i],score);
            }
        }
        for (int i : answer){
            System.out.print(i +" ");
        }
    }
}
