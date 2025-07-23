package baekjoon.sliver;

import java.io.*;

/*
    n의 배수만큼 n이 증가한다.
    그러면 Math.sqrt를 활용해서 근사치 값을 찾는 방법을 고려해보자
 */
public class WindowClose_13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

//        int n = Integer.parseInt(br.readLine());
//
//        boolean[] window = new boolean[n + 1];
//
//        for (int i = 1; i <= n; i++) {
//            int limit = 0;
//            while (limit + i <= n) {
//                limit += i;
//                window[limit] = !window[limit];
//            }
//        }
//
//        int answer = 0;
//        for (boolean b : window) {
//            if (b) answer++;
//        }

        bw.write((int)Math.sqrt(Integer.parseInt(br.readLine())) + "");
        bw.flush();
        bw.close();
    }
}
