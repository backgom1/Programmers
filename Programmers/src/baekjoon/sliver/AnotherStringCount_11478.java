package baekjoon.sliver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class AnotherStringCount_11478 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        Set<String> set = new HashSet<>();
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j <= s.length() - i; j++) {
                String substring = s.substring(j, i + j);
                set.add(substring);
            }
        }
        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}
