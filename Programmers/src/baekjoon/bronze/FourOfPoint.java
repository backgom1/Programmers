package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FourOfPoint {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] split1 = br.readLine().split(" ");
        String[] split2 = br.readLine().split(" ");
        String[] split3 = br.readLine().split(" ");

        String x = "";
        String y = "";

        if (split1[0].equals(split2[0])) {
            x = split3[0];
        }

        if (split2[0].equals(split3[0])) {
            x = split1[0];
        }

        if (split3[0].equals(split1[0])) {
            x = split2[0];
        }

        if (split1[1].equals(split2[1])) {
            y = split3[1];
        }

        if (split2[1].equals(split3[1])) {
            y = split1[1];
        }

        if (split3[1].equals(split1[1])) {
            y = split2[1];
        }

        System.out.print(x + " " + y);

    }
}
