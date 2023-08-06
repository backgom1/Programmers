package Programmers.level1;

import java.util.*;

public class SkillCheck1 {

    public static void main(String[] args) {
        int[] arr = new int[]{4,3,2,1};
        SkillCheck1 skillCheck1 = new SkillCheck1();
        int[] solution = skillCheck1.solution(arr);
        for (int cnt : solution) {
            System.out.println("cnt = " + cnt);
        }
    }

    public int[] solution(int[] arr) {
        List<Integer> newArr = new ArrayList<>();
        for (int j : arr) {
            newArr.add(j);
        }
        Comparator<Integer> descendingComparator = Collections.reverseOrder();
        newArr.sort(descendingComparator);
        newArr.remove(newArr.size()-1);
        int[] answer;
        if(newArr.size()<=1){
            answer = new int[]{-1};
        }else {
            answer = new int[newArr.size()];
            for (int i = 0; i < answer.length; i++) {
                answer[i] = newArr.get(i);
            }
        }

        return answer;
    }
}
