package LearnJava.section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GetCommonElements {

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

        GetCommonElements twoPointer = new GetCommonElements();

        ArrayList<Integer> solution = twoPointer.solution(a, b);

        for (Integer integer : solution) {
            System.out.print(integer + " ");
        }

    }

    public ArrayList<Integer> solution(int[] a, int[] b) {
        ArrayList<Integer> answer = new ArrayList<>();
        int p1 = 0, p2 = 0;
        Arrays.sort(a);
        Arrays.sort(b);
        while (p1 < a.length && p2 < b.length) {
            if(a[p1]==b[p2]){
                answer.add(a[p1]);
                p1++;
                p2++;
            } else if (a[p1]<b[p2]) {
                p1++;
            }else  p2++;
        }

        return answer;
    }

}
