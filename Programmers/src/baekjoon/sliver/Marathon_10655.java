package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Marathon_10655 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        List<String> allPutList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            allPutList.add(br.readLine()); // 모든 입력을 그대로 저장
        }
        int totalDistance = 0;
        for (int j = 1; j < allPutList.size(); j++) {
            String[] prev = allPutList.get(j - 1).split(" ");
            String[] curr = allPutList.get(j).split(" ");
            int x1 = Integer.parseInt(prev[0]);
            int y1 = Integer.parseInt(prev[1]);
            int x2 = Integer.parseInt(curr[0]);
            int y2 = Integer.parseInt(curr[1]);
            totalDistance += Math.abs(x1 - x2) + Math.abs(y1 - y2);
        }

        int result = Integer.MAX_VALUE;
        for (int i = 1; i < allPutList.size() - 1; i++) {

            String[] prevArr = allPutList.get(i - 1).split(" ");
            String[] currArr = allPutList.get(i).split(" ");
            String[] nextArr = allPutList.get(i + 1).split(" ");

            int xPrev = Integer.parseInt(prevArr[0]);
            int yPrev = Integer.parseInt(prevArr[1]);
            int xCurr = Integer.parseInt(currArr[0]);
            int yCurr = Integer.parseInt(currArr[1]);
            int xNext = Integer.parseInt(nextArr[0]);
            int yNext = Integer.parseInt(nextArr[1]);

            int current = Math.abs(xPrev - xCurr) + Math.abs(yPrev - yCurr)
                    + Math.abs(xCurr - xNext) + Math.abs(yCurr - yNext);
            int afterSkip = Math.abs(xPrev - xNext) + Math.abs(yPrev - yNext);

            int candidateDistance = totalDistance - current + afterSkip;
            result = Math.min(result, candidateDistance);
        }

        System.out.print(result);

    }
}
