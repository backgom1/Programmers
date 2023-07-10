package Programmers.level1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinSquare {
    public static void main(String[] args) {
        int[][] sizes = new int[][]{{10, 7},{12, 3}, {8, 15}, {14, 7}, {5, 15}};
        MinSquare minSquare = new MinSquare();
        int solution = minSquare.solution(sizes);
        System.out.println("solution = " + solution);
    }

    public int solution(int[][] sizes) {
        List<Integer> vertical = new ArrayList<>();
        List<Integer> horizon = new ArrayList<>();

        for (int[] square : sizes) {
                if(square[0]>square[1]){
                    horizon.add(square[0]);
                    vertical.add(square[1]);
                } else {
                    horizon.add(square[1]);
                    vertical.add(square[0]);
                }
            }

        Collections.sort(vertical);
        Collections.sort(horizon);


        return vertical.get(vertical.size()-1) * horizon.get(horizon.size()-1);
    }
}
