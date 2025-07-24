package baekjoon.sliver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Difference_1269 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] split = br.readLine().split(" ");
        int a = Integer.parseInt(split[0]);
        int b = Integer.parseInt(split[1]);


        String[] aElement = br.readLine().split(" ");
        Set<String> set = new HashSet<>();
        for (int i = 0; i < a; i++) {
            set.add(aElement[i]);
        }
        String[] bElement = br.readLine().split(" ");
        for (int i = 0; i < b; i++) {
            if (set.contains(bElement[i])) {
                set.remove(bElement[i]);
            } else {
                set.add(bElement[i]);
            }
        }


        bw.write(set.size() + "");
        bw.flush();
        bw.close();
    }
}
