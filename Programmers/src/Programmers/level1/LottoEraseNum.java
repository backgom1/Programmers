package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class LottoEraseNum {
    public static void main(String[] args) {
        int[] lottos = new int[]{0, 0, 0, 0, 0, 0};
        int[] win_nums = new int[]{31, 10, 45, 1, 6, 19};
        LottoEraseNum sol = new LottoEraseNum();
        int[] solution = sol.solution(lottos, win_nums);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }

    public int[] solution(int[] lottos, int[] win_nums) {
        int[] rank =new int[]{1,2,3,4,5,6};
        Map<Integer, Integer> lottoRank = new HashMap<>();
        Map<Integer, Integer> lottoNum = new HashMap<>();
        Map<Integer, Integer> minooPick = new HashMap<>();

        for (int i = 0; i < lottos.length; i++) {
            lottoNum.put(i, win_nums[i]);
            minooPick.put(i, lottos[i]);
        }
        int index = 5;
        for (int i = 2; i <= rank.length; i++) {
            lottoRank.put(i,index);
            index--;
        }
        for (int i = 2; i < lottoRank.size(); i++) {
        }
        int[] answer = new int[2];
        int maxMatch = maxRank(lottoNum, minooPick);
        int minMatch = minRank(lottoNum, minooPick);
        Integer max = lottoRank.getOrDefault(maxMatch, 6);
        Integer min = lottoRank.getOrDefault(minMatch, 6);
        answer[0] = max;
        answer[1] = min;
        return answer;
    }

    private int maxRank(Map<Integer, Integer> lottoNum, Map<Integer, Integer> minooPick) {
        int maxCnt = 0;
        for (int i = 0; i < minooPick.size(); i++) {
            if (lottoNum.containsValue(minooPick.get(i))) {
                maxCnt++;
            }
            if (minooPick.get(i) == 0) {
                maxCnt++;
            }
        }
        return maxCnt;
    }

    private int minRank(Map<Integer, Integer> lottoNum, Map<Integer, Integer> minooPick) {
        int minCnt = 0;
        for (int i = 0; i < minooPick.size(); i++) {
            if (lottoNum.containsValue(minooPick.get(i))) {
                minCnt++;
            }
        }
        return minCnt;

    }
}