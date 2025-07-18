package baekjoon.step.sort1;


//평균은 전체 값에서 값들의 개수 만큼 나눠주면 나온다.
//배열안에 값을 담고 정렬을 한 후
//문제에서는 5개라고 했으니 2번인덱스의 값을 가져오면 정상적으로 중간 값을 구할수있다.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

//배열을 만들고 담는과정
//평균값 구하는과정
//중간값을 구하는과정
public class CentralTendency_2587 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[5];
        int average = 0;
        for (int i = 0; i < 5; i++) {
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
            average += num;
        }

        average /= 5;

        Arrays.sort(arr);


        System.out.println(average);
        System.out.print(arr[2]);

    }
}
