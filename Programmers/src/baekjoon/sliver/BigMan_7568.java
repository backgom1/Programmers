package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BigMan_7568 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String answer = "";

        int count = Integer.parseInt(br.readLine());
        List<BigMan> bigManList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            String[] command = br.readLine().split(" ");
            int tall = Integer.parseInt(command[0]);
            int weight = Integer.parseInt(command[1]);
            bigManList.add(new BigMan(tall, weight));
        }

        for (int i = 0; i < bigManList.size(); i++) {
            BigMan targetMan = bigManList.get(i);
            int rank = 1;
            for (int j = 0; j < bigManList.size(); j++) {
                if (i != j) {
                    int size = 0;
                    BigMan compareMan = bigManList.get(j);
                    if (targetMan.getTall() >= compareMan.getTall()) {
                        size++;
                    }
                    if (targetMan.getWeight() >= compareMan.getWeight()) {
                        size++;
                    }
                    if (size == 0) {
                        rank++;
                    }
                }
            }
            if (i == bigManList.size() - 1) {
                answer += rank;
            } else {
                answer += rank + " ";
            }
        }
        System.out.print(answer);
    }
}

class BigMan {
    private int tall;
    private int weight;

    public BigMan(int tall, int weight) {
        this.tall = tall;
        this.weight = weight;
    }

    public int getTall() {
        return tall;
    }

    public int getWeight() {
        return weight;
    }
}
