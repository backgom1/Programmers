package baekjoon.sliver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class StringSet {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        int answer = 0;
        for (int i = 0; i < M; i++) {
            if (set.contains(br.readLine())) answer++;
        }

        bw.write(answer +"");
        bw.flush();
        bw.close();
    }
}
