package Programmers.level1;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DartGame {
    public static void main(String[] args) {
        String dartResult = "1D#2S*10S";
        DartGame sol = new DartGame();
        int solution = sol.solution(dartResult);
        System.out.println("solution = " + solution);

    }

    public int solution(String dartResult) {
        int answer = 0;

        Map<String, Integer> dartPow = new HashMap<>();
        dartPow.put("D", 2);
        dartPow.put("S", 1);
        dartPow.put("T", 3);


        // 정규표현식을 사용하여 문자열을 분리
        Pattern pattern = Pattern.compile("(\\d+[a-zA-Z#]*\\*?)");
        Matcher matcher = pattern.matcher(dartResult);

        List<String> powStr = new ArrayList<>();
        List<Integer> powNum = new ArrayList<>();
        // 분리된 문자열을 출력
        while (matcher.find()) {
            powStr.add(matcher.group());
            String[] split = matcher.group().split("");
            double pow = Math.pow(Double.parseDouble(split[0]), dartPow.get(split[1]));
            if (split.length == 3) {
                if (split[2].equals("#")) {
                    pow = pow * -1;
                }
            }
            powNum.add((int) pow);
        }

        for (int i = 0; i < powNum.size(); i++) {
            if (powStr.get(i).contains("*")) {
                if (i > 0) {
                    int current = powNum.get(i) * 2;
                    int before = powNum.get(i - 1) * 2;
                    powNum.set(i, current);
                    powNum.set(i - 1, before);
                } else {
                    int current = powNum.get(i) * 2;
                    powNum.set(i, current);
                }
            }
        }
        for (Integer integer : powNum) {
            answer += integer;
        }
        return answer;
    }

}
