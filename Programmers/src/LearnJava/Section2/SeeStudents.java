package LearnJava.Section2;

import java.util.Scanner;

public class SeeStudents {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int[] arr = new int[num];
        int answer = 0;
        int max = 0;
        //값을 받아오기
        for (int i = 0; i < num; i++) {
            arr[i] = in.nextInt();
        }

        //i가 max보다 클경우 변경
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                answer++;
                max = arr[i];
            }
        }
        System.out.println(answer);
    }
}
