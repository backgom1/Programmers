package contest.sonlinhighschool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 */
public class Block {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] answer = new String[T];
        for (int i = 0; i < T; i++) {
            String[] splitNumber = br.readLine().split(" ");
            int A = Integer.parseInt(splitNumber[0]);
            int B = Integer.parseInt(splitNumber[1]);
            int C = Integer.parseInt(splitNumber[2]);

            //단일로 나왔을 때
            if (A > 0 && B == 0 && C == 0) {
                if (A % 2 == 1) {
                    answer[i] = "No";
                    continue;
                }
            } else if (A == 0 && B > 0 && C == 0) {
                if (B % 2 == 1) {
                    answer[i] = "No";
                    continue;
                }
            } else if (A == 0 && B == 0 && C > 0) {
                answer[i] = "No";
                continue;
            } else {

                //C가 있고 B가 0이면  A에 대한 처리
                if (C > 0 && A == 0) {
                    answer[i] = "No";
                    continue;
                } else if (C != A) {
                    answer[i] = "No";
                    continue;
                }

                //B가 있고, A가 4이상이어야함 짝수로
                if (B > 0 && (A % 2 == 1)) {
                    answer[i] = "No";
                    continue;
                }



                //C와 B가 있을 경우 A에 대한 처리
                if (C > 0 && B > 0) {
                    if ((C % 2 == 0) && (A % 2 == 1)) {
                        answer[i] = "No";
                        continue;
                    } else if ((C % 2 == 1) && (A % 2 == 0)) {
                        answer[i] = "No";
                        continue;
                    }
                }
                answer[i] = "Yes";
            }
        }


        for (String s : answer) {
            System.out.println(s);
        }
    }
}
