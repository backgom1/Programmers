package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class IncompleteRunner {
    public static void main(String[] args) {
        String[] participant = new String[]{"mislav", "stanko", "mislav", "ana"};
        String[] completion = new String[]{"stanko", "ana", "mislav"};
        IncompleteRunner sol = new IncompleteRunner();
        String solution = sol.solution(participant, completion);
        System.out.println("solution = " + solution);
    }

    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> listBox = new HashMap<>();
        for (String s : participant) {
            if (listBox.containsKey(s)) {
                int count = listBox.get(s);
                listBox.put(s, count + 1);
            } else {
                listBox.put(s, 1);
            }
        }

        for (String completeRunner : completion) {
            if (listBox.containsKey(completeRunner)) {
                int count = listBox.get(completeRunner);
                if (count > 1) {
                    listBox.put(completeRunner, count - 1);
                } else {
                    listBox.remove(completeRunner);
                }

            }
        }
        String answer = listBox.keySet().iterator().next();
        return answer;
    }

}
