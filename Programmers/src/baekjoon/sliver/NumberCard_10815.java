package baekjoon.sliver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class NumberCard_10815 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> sangunCards = new HashSet<>();
        int N = Integer.parseInt(br.readLine());
        String[] nSplit = br.readLine().split(" ");

        for (String s : nSplit) {
            sangunCards.add(Integer.parseInt(s));
        }

        int M = Integer.parseInt(br.readLine());

        StringBuilder answer = new StringBuilder();
        String[] mSplit = br.readLine().split(" ");

        for (String s : mSplit) {
            int card = Integer.parseInt(s);
            if (sangunCards.contains(card)) {
                answer.append("1 ");
            } else {
                answer.append("0 ");
            }
        }

        bw.write(answer.toString());
        bw.flush();
        bw.close();
    }
}
