package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class Yearning {
    public static void main(String[] args) {
        String[] name = new String[]{"may", "kein", "kain", "radi"};
        int[] yearning = new int[]{5, 10, 1, 3};
        String[][] photo = new String[][]{{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};
        Yearning solution = new Yearning();
        int[] solution1 = solution.solution(name, yearning, photo);
        for (int n : solution1){
            System.out.println("n = " + n);
        }
    }

    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> nameYearning = new HashMap<>();
        for (int i = 0; i < name.length; i++) {
            nameYearning.put(name[i], yearning[i]);
        }

        int[] answer = new int[photo.length];
        for (int i = 0; i < photo.length; i++) {
            int num = 0;
            for (int j = 0; j < photo[i].length; j++) {
                if (nameYearning.containsKey(photo[i][j])) {
                    int score = nameYearning.get(photo[i][j]);
                    System.out.println("score = " + score);
                    num += score;
                }
            }
            answer[i] = num;
        }

        return answer;
    }
}
