package LearnJava.Section2;

import java.util.Scanner;

public class TemporaryChief {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[][] classRoom = new int[cnt + 1][6];
        int max = Integer.MIN_VALUE;

        int answer = 0;

        for (int i = 1; i <= cnt; i++) {
            for (int j = 1; j <= cnt; j++) {
                classRoom[i][j] = sc.nextInt();
            }
        }

        for (int i = 1; i <= cnt; i++) {
            int sameClass = 0;
            for (int j = 1; j <= cnt; j++) {
                for (int k = 1; k <= 5; k++) {
                    if (classRoom[i][k] == classRoom[j][k]) {
                        sameClass++;
                        break;
                    }
                }
            }
            if(sameClass>max){
                max = sameClass;
                answer =i;
            }
        }
        System.out.println(answer);
    }

}
