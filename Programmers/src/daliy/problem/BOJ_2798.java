package daliy.problem;

import java.io.*;

public class BOJ_2798 {

    static int answer = 0;
    static int number = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] command = br.readLine().split(" ");
        int count = Integer.parseInt(command[0]);
        number = Integer.parseInt(command[1]);

        int[] arr = new int[count];
        int[] result = new int[3];
        String[] cards = br.readLine().split(" ");
        for (int i = 0; i < count; i++) {
            arr[i] = Integer.parseInt(cards[i]);
        }

        combination(arr, result, 0, 0, 3);

        bw.write(answer + "\n");
        bw.flush();
        bw.close();

    }

    public static void combination(int[] arr, int[] result, int start, int depth, int limit) {
        //제한
        int compare = 0;
        if (depth == limit) {
            for (int card : result) {
                compare += card;
            }
            if (compare <= number && compare > answer) {
                answer = compare;
            }
            return;
        }

        for (int i = start; i < arr.length; i++) {
            result[depth] = arr[i]; //뎁스에 값을 넣어주는 과정
            combination(arr, result, i + 1, depth + 1, limit); //자기 자신을 참조하지 않도록 i+1로 설정
        }

    }
}
