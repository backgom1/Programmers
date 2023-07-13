package Programmers.level1;

import java.util.HashSet;
import java.util.Set;

public class PhoneketMon {
    public static void main(String[] args) {
        int[] nums = new int[]{3, 3, 3, 2, 2, 2};
        PhoneketMon sol = new PhoneketMon();
        int solution = sol.solution(nums);
        System.out.println("solution = " + solution);
    }

    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> pick = new HashSet<>();
        for (int monster : nums) {
            pick.add(monster);
        }

        for (int i = 0; i < (nums.length / 2); i++) {
            if(pick.size()<(nums.length/2)){
                answer = pick.size();
            } else {
                answer++;
            }
        }

        return answer;
    }
}
