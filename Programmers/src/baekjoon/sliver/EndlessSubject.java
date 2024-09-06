package baekjoon.sliver;

import java.io.*;
import java.util.Stack;

public class EndlessSubject {

    private static final int TASK = 1;
    private static final int NOT_TASK = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int answer = 0;

        Stack<TaskInfo> taskInfos = new Stack<>();

        for (int i = 0; i < N; i++) {

            String[] splitSubjectInfo = br.readLine().split(" ");
            int taskStatus = Integer.parseInt(splitSubjectInfo[0]);

            if (taskStatus == TASK) {
                int score = Integer.parseInt(splitSubjectInfo[1]);
                int minute = Integer.parseInt(splitSubjectInfo[2]);
                minute--;

                if (minute <= 0) {
                    answer += score;
                } else {
                    taskInfos.add(new TaskInfo(score, minute));
                }

            } else {

                if (!taskInfos.isEmpty()) {
                    TaskInfo taskInfo = taskInfos.pop();
                    taskInfo.spendTime();
                    if (taskInfo.getMinute() <= 0) {
                        answer += taskInfo.getScore();
                    } else {
                        taskInfos.add(taskInfo);
                    }
                }
            }

        }

        bw.write(answer + "");
        bw.flush();
        bw.close();

    }
}

class TaskInfo {

    int score;
    int minute;

    public TaskInfo(int score, int minute) {
        this.score = score;
        this.minute = minute;
    }

    void spendTime() {
        this.minute--;
    }

    public int getMinute() {
        return minute;
    }

    public int getScore() {
        return score;
    }

}
