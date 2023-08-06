package LearnJava.section3;

import java.util.ArrayList;
import java.util.Scanner;

public class TwoPointer {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        int m = in.nextInt();
        int[] b = new int[m];
        for (int i = 0; i < m; i++) {
            b[i] = in.nextInt();
        }

        TwoPointer twoPointer = new TwoPointer();

        ArrayList<Integer> solution = twoPointer.solution(n, m, a, b);

        for (Integer integer : solution) {
            System.out.print(integer+" ");
        }

    }


    public ArrayList<Integer> solution(int n, int m, int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while (p1 < n && p2 < m) {
            //비교를 해서 둘중에 작은놈 넣기
            if (a[p1] < b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        // 만약에 배열에 값이 없으면 나머지를 추가합니다.
        while (p1<n) answer.add(a[p1++]);
        while (p2<m) answer.add(b[p2++]);
        return answer;
    }
}
