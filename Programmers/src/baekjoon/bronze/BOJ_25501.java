package baekjoon.bronze;

import java.io.*;

//시작과 끝의 인덱스를 +-하여 값을 가져오는 방법 투포인터랑 비슷하다 O(n)
public class BOJ_25501 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String s = br.readLine();
            int count = 1;
            bw.write(palindrome(s, 0, s.length() - 1, count)+"\n");
        }


        bw.flush();
        bw.close();
    }

    private static String palindrome(String s, int start, int end, int count) {
        //count가 depth가 내려갈때 count 기본 단계에서 마무리되는 값에 대해서 반환이 되기때문으로 사용했다.
        if (s.charAt(start) != s.charAt(end)) return 0 + " " + count;
        if (start >= end) return 1 + " " + count;
        return palindrome(s, start + 1, end - 1, count + 1);
    }
}
