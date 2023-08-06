package Programmers.level2;

import java.util.HashMap;
import java.util.Map;

public class Clothes {
    public static void main(String[] args) {
        String[][] clothes = new String[][]{{"crow_eyessddd", "eyewear"},{"crow_eye", "eyewear"},{"crow_eyess", "eyewear"}, {"crow_mask", "face"}, {"blue_sunglasses", "face"}, {"smoky_makeuaaap", "aa"}};
        Clothes sol = new Clothes();
        int solution = sol.solution(clothes);
        System.out.println("solution = " + solution);
    }

    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> totalClothes = new HashMap<>();

        for (String[] cloth : clothes) {
            totalClothes.put(cloth[1], totalClothes.getOrDefault(cloth[1], 0) + 1);
        }
        for (int value : totalClothes.values()) {
            answer *= value+1;
        }


        return answer-1;
    }
}
