package LearnJava.Section2;

import java.util.Scanner;

public class Rank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] rankList = new int[cnt];
        int[] answer = new int[cnt];
        int rankCnt = 1;

        for (int i = 0; i < cnt; i++) {
            rankList[i] = sc.nextInt();
        }

        for (int i = 0; i < cnt; i++) {
            for (int j = 0; j < cnt; j++) {
                if (rankList[i] < rankList[j]) {
                    rankCnt++;
                }
            }
            answer[i] = rankCnt;
            rankCnt=1;
        }
        for(int num : answer){
            System.out.print(num+" ");
        }
    }
}
