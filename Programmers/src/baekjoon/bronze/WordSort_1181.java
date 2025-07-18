package baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class WordSort_1181 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        String[] words = new String[T];
        for (int i = 0; i < T; i++) {
            words[i] = br.readLine();
        }

        Arrays.sort(words, (o1, o2) -> {
            if (o1.length() == o2.length()) {
                return o1.compareTo(o2);
            } else {
                return o1.length() - o2.length();
            }
        });

        Set<String> answer = new LinkedHashSet<>(Arrays.asList(words));

        for (String s : answer) {
            bw.write(s + "\n");
        }

        bw.flush();
        bw.close();
    }
}
