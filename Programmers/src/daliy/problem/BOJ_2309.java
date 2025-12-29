package daliy.problem;

import java.io.*;
import java.util.Arrays;


/**
 * 1. 7명을 무작위로 뽑아 100을 만드는 조건을 뽑는다.
 * - 조합 -> 7개의 무작위 조합으로 100이 나오는것에 대해 출력한다.
 */
public class BOJ_2309 {
    static StringBuilder sb = new StringBuilder();
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] sumDwarfs = new int[7];
        int[] dwarfs = new int[9];

        for (int i = 0; i < dwarfs.length; i++) {
            dwarfs[i] = Integer.parseInt(br.readLine());
        }

        combination(dwarfs, sumDwarfs, 0, 0, 7);
    }

    private static void combination(int[] dwarfs, int[] sumDwarfs, int index, int depth, int limit) throws IOException {
        if (depth == limit) {
            int sum = 0;
            for (int dwarf : sumDwarfs) {
                sum += dwarf;
            }
            if (sum == 100) {
                Arrays.sort(sumDwarfs);
                for (int sumDwarf : sumDwarfs) {
                    sb.append(sumDwarf).append("\n");
                }
                bw.write(sb.toString());
                bw.flush();
                bw.close();
                System.exit(0);
            }
            return;
        }

        if (index == dwarfs.length) {
            return;
        }

        sumDwarfs[depth] = dwarfs[index];
        combination(dwarfs, sumDwarfs, index + 1, depth + 1, limit);
        combination(dwarfs, sumDwarfs, index + 1, depth, limit); //현재 뎁스의 다음 인덱스 진행
    }
}
