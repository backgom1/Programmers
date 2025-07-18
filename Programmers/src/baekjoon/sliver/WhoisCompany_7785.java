package baekjoon.sliver;

import java.io.*;
import java.util.*;

public class WhoisCompany_7785 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        TreeSet<String> set = new TreeSet<>();

        for (int i = 0; i < n; i++) {
            String[] split = br.readLine().split(" ");
            String name = split[0];
            String status = split[1];

            if (set.contains(name)) {
                if("leave".equals(status)){
                    set.remove(name);
                }
            } else {
                set.add(name);
            }
        }

        Set<String> iterator = set.descendingSet();
        StringBuilder sb = new StringBuilder();
        for (String s : iterator) {
            sb.append(s).append("\n");
        }


        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
