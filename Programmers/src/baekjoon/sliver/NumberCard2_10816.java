package baekjoon.sliver;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/*
    메모리 : 189228kb
    시간 : 1140ms
 */
public class NumberCard2_10816 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t1 = Integer.parseInt(br.readLine());
        String[] split1 = br.readLine().split(" ");

        Map<Integer, Integer> map = new HashMap<>();
        for (String s : split1) {
            map.put(Integer.parseInt(s), map.getOrDefault(Integer.parseInt(s), 0) + 1);
        }


        int t2 = Integer.parseInt(br.readLine());
        String[] split2 = br.readLine().split(" ");

        StringBuilder sb = new StringBuilder();
        for (String s : split2) {
            int num = Integer.parseInt(s);

            sb.append(map.getOrDefault(num, 0)).append(" ");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
