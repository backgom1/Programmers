package Programmers.level2;

import java.util.*;

public class SkillTree {
    public static void main(String[] args) {
        String skill = "CBD";
        String[] skill_trees = new String[]{ "BACDE", "CBADF", "AECB", "BDA"};
        SkillTree sol = new SkillTree();
        int solution = sol.solution(skill, skill_trees);
        System.out.println("solution = " + solution);
    }

    public int solution(String skill, String[] skill_trees) {
        List<String> skillOrder = new ArrayList<>();
        int index = 0;
        int answer = 0;
        for (int i = 0; i < skill.length(); i++) {
            skillOrder.add(String.valueOf(skill.charAt(i)));
        }

        for (String userSkillSet : skill_trees) {
            index =0;
            boolean skillVisit = true;
            for (int i = 0; i < userSkillSet.length(); i++) {
                String ASkill = String.valueOf(userSkillSet.charAt(i));
                if (!skillOrder.contains(ASkill)) {
                    continue;
                } else {
                    if (!skillOrder.get(index).equals(ASkill)) {
                        skillVisit = false;
                        break;
                    } else {
                        index++;
                    }
                }
            }
           if(skillVisit){
               answer++;
           }
        }
        return answer;
    }
}
