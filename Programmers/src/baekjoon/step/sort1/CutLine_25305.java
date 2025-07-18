package baekjoon.step.sort1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CutLine_25305 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] commands = br.readLine().split(" ");
        String[] scores = br.readLine().split(" ");

        int student = Integer.parseInt(commands[0]);
        int[] studentScores = new int[student];
        for (int i = 0; i< studentScores.length; i++){
            studentScores[i] = Integer.parseInt(scores[i]);
        }
        Arrays.sort(studentScores);
        int cutLine = Integer.parseInt(commands[1]);

        System.out.print(studentScores[studentScores.length - (cutLine)]);

    }
}
