package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Poker_2621 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] color = new String[5];
        int[] number = new int[5];
        int colorCnt = 0;

        //배열에 값을 담는 것
        for (int i = 0; i < 5; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            String colors = st.nextToken();
            int nums = Integer.parseInt(st.nextToken());
            color[i] = colors;
            number[i] = nums;
        }

        Map<String, Integer> colorMap = new HashMap<>();
        Map<Integer, Integer> numberMap = new HashMap<>();

        for (String s : color) {
            colorMap.put(s, colorMap.getOrDefault(s, 0) + 1);
        }
        for (int n : number) {
            numberMap.put(n, numberMap.getOrDefault(n, 0) + 1);
        }

        for (Map.Entry<String, Integer> entry : colorMap.entrySet()) {
            if (entry.getValue() == 5) {
                colorCnt = entry.getValue();
                System.out.println("entry = " + flush());
            }
        }

        for (Map.Entry<Integer, Integer> entry2 : numberMap.entrySet()) {
            if (entry2.getValue() > 2) {
                int duplicateCount = entry2.getValue();
                System.out.println("중복된 값: " + entry2.getKey() + ", 카운트: " + duplicateCount);
            }
        }


    }


    //    public static int onePair(){
//
//    }
//    public static int twoPair(){
//
//    }
//    public static int triple(){
//
//    }
//    public static int straight(){
//
//    }
    public static int flush() {
        return 1;
    }
//    public static int fullHouse(){
//
//    }
//    public static int fourCard(){
//
//    }
//
//    public static int royalStraightFlush(){
//
//    }

}
