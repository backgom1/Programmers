package Programmers.level1.exam;

import java.util.HashMap;
import java.util.Map;

public class NotCompletion {

    public static void main(String[] args) {
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        NotCompletion notCompletion = new NotCompletion();
        String solution = notCompletion.solution(participant, completion);
        System.out.println("solution = " + solution);
    }


    public String solution(String[] participant, String[] completion) {
        String answer = "";

        Map<String, Integer> checkCompletion = new HashMap<>();

        for (String user : participant) {
            checkCompletion.put(user, checkCompletion.getOrDefault(user, 0) + 1);
        }

        for (String user : completion) {
            Integer count = checkCompletion.get(user);
            count -= 1;

            if (count == 0) {
                checkCompletion.remove(user);
            } else {
                checkCompletion.put(user, count);
            }
        }

        for (String s : checkCompletion.keySet()) {
            if (checkCompletion.get(s) > 0) {
                answer = s;
                break;
            }
        }


        return answer;
    }
}
