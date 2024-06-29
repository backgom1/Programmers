package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class LogPresso {
    static Set<String> infectionList = new HashSet<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int answer = 0;
        String[] pressoInfo = br.readLine().split(" ");

        int N = Integer.parseInt(pressoInfo[0]);
        int M = Integer.parseInt(pressoInfo[1]);
        int K = Integer.parseInt(pressoInfo[2]);

        LogHistory[] logHistories = new LogHistory[M];


        String[] existInfection = br.readLine().split(" ");

        for (int i = 0; i < M; i++) {
            String[] logInfo = br.readLine().split(" ");
            int time = Integer.parseInt(logInfo[0]);
            int send = Integer.parseInt(logInfo[1]);
            int receive = Integer.parseInt(logInfo[2]);
            logHistories[i] = new LogHistory(time, send, receive);
        }

        Arrays.sort(logHistories, Comparator.comparingInt(o -> o.time));


        for (String s : existInfection) {
            int startPoint = Integer.parseInt(s);
            infectionList.add(s);
            for (LogHistory logHistory : logHistories) {
                containInfect(logHistory, infectionList);
            }

            int count = 0;

            for (String infection : infectionList) {
                if (infectionList.contains(infection)) {
                    count++;
                }
            }

            if (existInfection.length == count && infectionList.containsAll(List.of(existInfection))) {
                answer = startPoint;
                break;
            }

            infectionList.clear();
        }

        System.out.print(answer);
    }

    private static void containInfect(LogHistory logHistory, Set<String> existInfection) {
        if (existInfection.contains(String.valueOf(logHistory.send))) {
            infectionList.add(String.valueOf(logHistory.receive));
        }
    }
}


class LogHistory {
    int time;
    int send;
    int receive;

    public LogHistory(int time, int send, int receive) {
        this.time = time;
        this.send = send;
        this.receive = receive;
    }
}