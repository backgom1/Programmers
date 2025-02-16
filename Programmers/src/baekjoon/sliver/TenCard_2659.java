package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class TenCard_2659 {


    public static final int TIME_LENGTH = 4;
    public static final int MIN_COUNT = 1111;
    public static final int MAX_COUNT = 9999;
    public static Map<String, Boolean> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String inputTenCard = bf.readLine().trim().replaceAll(" ", "");

        int minTimeNumber =Integer.parseInt(inputTenCard);

        int answer = 0;

        initMapping();

        for (int i = 0; i < TIME_LENGTH; i++) {
            if (minTimeNumber > Integer.parseInt(inputTenCard)) {
                minTimeNumber = Integer.parseInt(inputTenCard);
            }
            inputTenCard = timeSeq(inputTenCard);
        }


        for (int i = MIN_COUNT; i <= minTimeNumber; i++) {
            String tempCount = String.valueOf(i);

            if (tempCount.contains("0")) {
                continue;
            }

            if(map.get(tempCount)){
                continue;
            }
            answer++;

            mapTrue(tempCount);
        }


        System.out.print(answer);
    }

    private static void initMapping() {
        for (int i = MIN_COUNT; i <= MAX_COUNT; i++) {
            if (String.valueOf(i).contains("0")) {
                continue;
            }

            map.put(String.valueOf(i), false);
        }
    }

    private static String timeSeq(String inputTenCard) {
        return inputTenCard.substring(1) + inputTenCard.charAt(0);
    }

    private static void mapTrue(String inputTenCard) {
        String tempString = inputTenCard;
        for (int i = 0; i < 4; i++) {
            tempString = tempString.substring(1) + tempString.charAt(0);
            Boolean check = map.get(tempString);
            if (!check) {
                map.put(tempString, true);
            }
        }

    }
}
