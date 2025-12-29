package daliy.problem;

import java.io.*;

/*
 모든 생성자를 구해 boolean배열에 담고 false인 값에 대해서만 추출해 값을 뽑는다.
 */
public class BOJ_4673 {

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean[] isVisited = new boolean[10001];
        for (int i = 1; i <= 10000; i++) {
            String temp = String.valueOf(i);
            int num = i;
            for (int j = 0; j < temp.length(); j++) {
                int number = temp.charAt(j) - '0';
                num += number;
            }
            if (num <= 10000) {
                isVisited[num] = true;
            }

        }

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < isVisited.length; i++) {
            if (!isVisited[i]) {
                sb.append(i).append("\n");
            }
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }
}
