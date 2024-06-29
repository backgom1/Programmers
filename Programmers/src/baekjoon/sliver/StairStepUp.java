package baekjoon.sliver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StairStepUp {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());
        int answer = 0;
        List<Integer> memory = new ArrayList<>();
        int[] totalStairStep = new int[T];
        for (int i = 0; i < T; i++) {
            totalStairStep[i] = Integer.parseInt(bf.readLine());
        }
        memory.add(totalStairStep[0]);
        memory.add(Math.max(totalStairStep[0]+totalStairStep[1],totalStairStep[1]));
        for (int i = 2; i < totalStairStep.length; i++) {
//            memory.add(Math.max(totalStairStep[0],));
        }
        answer = memory.get(memory.size()-1);
        bw.write(answer);
        bw.flush();
        bw.close();

    }
}
