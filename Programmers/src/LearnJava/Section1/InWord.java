package LearnJava.Section1;

import java.util.Scanner;

public class InWord {
    //Time: 168ms Memory: 27MB
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String answer = "";
        String[] splitWord = input.split(" ");
        for (String s : splitWord) {
            if (answer.length() == 0) {
                answer = s;
            }
            if(answer.length() < s.length()){
                answer = s;
            }
        }
        System.out.println(answer);
    }
}
