package baekjoon.bronze;

import java.io.*;
import java.util.Arrays;

public class AreaSet2_11650 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        Area2[] area = new Area2[T];
        for (int i = 0; i < T; i++) {
            String[] split = br.readLine().split(" ");
            area[i] = new Area2(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }

        Arrays.sort(area, (o1, o2) -> {
            if (o1.getY() == o2.getY()) {
                return o1.getX() - o2.getX();
            } else {
                return o1.getY() - o2.getY();

            }
        });

        for (Area2 answer : area) {
            bw.write(answer.getX() + " " + answer.getY() + "\n");
        }
        bw.flush();
        bw.close();
    }
}

class Area2 {
    private int x;
    private int y;

    public Area2(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
