package Programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pocket {
    public int[] solution(String[] keymap, String[] targets) {
        List<Integer> pocket = new ArrayList<>();
        int[] answer = new int[targets.length];
        int cnt =0;
        for (int i = 0; i < targets.length ; i++) {
            for (int j = 0; j < targets[i].length();  j++) {
                char target = targets[i].charAt(j);
                for (int k = 0; k < keymap[i].length(); k++) {
                    if(keymap[i].charAt(k) == target){
                        System.out.println("j = " + (k+1));
                        pocket.add(k+1);
                        break;
                    }
                }
            }
            System.out.println("i = " + pocket.get(i));
            Collections.sort(pocket);
            cnt += pocket.get(0);

            System.out.println("cnt = " + cnt);
            answer[i] = cnt;
        }


        return answer;
    }
}
