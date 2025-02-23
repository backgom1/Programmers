package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Turtle_8911 {

    static Map<Integer, int[]> map = new HashMap<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        init();


        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            int direction = 0, currentX = 0, currentY = 0;
            int minX = 0, minY = 0, maxX = 0, maxY = 0;
            String command = br.readLine();
            for (int j = 0; j < command.length(); j++) {
                int[] nextMove = map.get(direction);
                switch (command.charAt(j)) {
                    case 'F':
                        currentX += nextMove[0];
                        currentY += nextMove[1];
                        break;
                    case 'B':
                        currentX -= nextMove[0];
                        currentY -= nextMove[1];
                        break;
                    case 'L':
                        direction++;
                        if (direction > 3) {
                            direction = 0;
                        }
                        break;
                    case 'R':
                        direction--;
                        if (direction < 0) {
                            direction = 3;
                        }
                        break;
                }

                if (currentX < minX) {
                    minX = currentX;
                }
                if (currentY < minY) {
                    minY = currentY;
                }
                if (currentX > maxX) {
                    maxX = currentX;
                }
                if (currentY > maxY) {
                    maxY = currentY;
                }
            }

            System.out.println(Math.abs(maxX - minX) * Math.abs(maxY - minY));

        }

    }

    private static void init() {
        map.put(0, new int[]{0, 1});
        map.put(1, new int[]{-1, 0});
        map.put(2, new int[]{0, -1});
        map.put(3, new int[]{1, 0});
    }
}
