package Programmers.level2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EnglishEndSpeak {


    public static void main(String[] args) {
        EnglishEndSpeak sol = new EnglishEndSpeak();
        int[] solution = sol.solution(3, new String[]{"tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"});
        System.out.println("solution = " + Arrays.toString(solution));
    }

    public int[] solution(int n, String[] words) {

        int myTurn = 1;
        int time = 1;

        List<String> previousWord = new ArrayList<>();

        for (String s : words) {

            if (myTurn > n) {
                myTurn = 1;
                time++;
            }

            if (!previousWord.isEmpty()) {
                String previous = previousWord.get(previousWord.size() - 1);
                if (s.charAt(0) != previous.charAt(previous.length() - 1)) {
                    return new int[]{myTurn, time};
                }
            }

            if (s.length() <= 1) {
                return new int[]{myTurn, time};
            }

            if (previousWord.contains(s)) {
                return new int[]{myTurn, time};
            }

            myTurn++;
            previousWord.add(s);
        }


        return  new int[]{0, 0};
    }
}
