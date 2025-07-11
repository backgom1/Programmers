package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class AreaZip {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        String[] split = br.readLine().split(" ");

        Set<Integer> zip = new TreeSet<>();

        for (String s : split) {
            zip.add(Integer.parseInt(s));
        }

        Integer[] sortedArray = zip.toArray(new Integer[0]);


        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < split.length; i++) {
            int target = Integer.parseInt(split[i]);
            int index = Arrays.binarySearch(sortedArray, target); // O(log n)
            if (split.length - 1 == i) {
                answer.append(index);
            } else {
                answer.append(index).append(" ");
            }

        }

        System.out.print(answer.toString());
    }
}
