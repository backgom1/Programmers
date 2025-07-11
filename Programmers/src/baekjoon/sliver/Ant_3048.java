package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Ant_3048 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] ants = br.readLine().split(" ");

        String answer = "";

        String firstAntLine = br.readLine();
        for (int i = Integer.parseInt(ants[0]) - 1; i >= 0; i--) {
            answer += firstAntLine.charAt(i);
        }

        String secondAntLine = br.readLine();
        for (int i = 0; i < Integer.parseInt(ants[1]); i++) {
            answer += secondAntLine.charAt(i);
        }


        int time = Integer.parseInt(br.readLine());


        int startWay = Integer.parseInt(ants[0]) - 1;
        int endWay = Integer.parseInt(ants[0]);

        char[] charArray = answer.toCharArray();

        boolean[] isFirstGroup = new boolean[charArray.length];
        for (int i = 0; i < Integer.parseInt(ants[0]); i++) {
            isFirstGroup[i] = true;
        }
        for (int i = 0; i < time; i++) {
            for (int j = 0; j < charArray.length - 1; j++) {
                if (isFirstGroup[j] && !isFirstGroup[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;

                    boolean tempGroup = isFirstGroup[j];
                    isFirstGroup[j] = isFirstGroup[j + 1];
                    isFirstGroup[j + 1] = tempGroup;
                    j++;
                }
            }
        }

        String result = "";
        for (char c : charArray) {
            result += c;
        }
        System.out.print(result);
    }
}
