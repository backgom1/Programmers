package Programmers.level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinNumRemove {
    public static void main(String[] args) {
        int[] arr ={4,3,1,2};
        MinNumRemove sol = new MinNumRemove();
        int[] solution = sol.solution(arr);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        int index = 0;
        List<Integer> numList = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            numList.add(arr[i]);
            if(arr[i]<min){
                min = arr[i];
                index = i;
            }
        }
        numList.remove(index);

        int[] answer;
        if(numList.size() ==0){
            answer = new int[]{-1};
        } else {
            answer = new int[numList.size()];
            for (int i = 0; i < numList.size(); i++) {
                answer[i] = numList.get(i);
            }
        }


        return answer;
    }
}
