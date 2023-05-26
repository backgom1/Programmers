package baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CowWhyRunWay1 {
    public static void main(String[] args) throws IOException {
        String[] cows = new String[11];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        for (int i =0; i<cnt; i++){
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int cowNum = Integer.parseInt(stringTokenizer.nextToken());
            int location = Integer.parseInt(stringTokenizer.nextToken());
        }

    }
}
