package baekjoon.sliver;

import java.io.*;
import java.util.*;

public class Bastard_1764 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int N = Integer.parseInt(split[0]);
        int M = Integer.parseInt(split[1]);

        Set<String> set = new HashSet<>();
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        List<String> list = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            String word = br.readLine();
            if (set.contains(word)) {
                list.add(word);
            }
        }

        Collections.sort(list);
            answer.append(list.size()).append("\n");
        for (String s : list) {
            answer.append(s).append("\n");
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }
}
