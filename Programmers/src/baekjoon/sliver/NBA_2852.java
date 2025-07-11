package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NBA_2852 {

    public static int GAME_TIME = 48 * 60;

    public static int FIRST_TEAM = 0;
    public static int SECOND_TEAM = 0;

    public static int firstTeamLeadTime = 0;
    public static int secondTeamLeadTime = 0;

    static int lastGoalTime = 0;
    static int lastLeadingTeam = 0;


    //이긴 시간만큼 쌓고 나중에 계산하는 방식
    //마지막에 남은 시간은 리드중인 팀에게 전달
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        for (int i = 0; i < count; i++) {
            String[] goalInfo = br.readLine().split(" ");
            int team = Integer.parseInt(goalInfo[0]);
            String[] splitGoalTime = goalInfo[1].split(":");
            int goalInTime = Integer.parseInt(splitGoalTime[0]) * 60 + Integer.parseInt(splitGoalTime[1]);

            if (FIRST_TEAM != SECOND_TEAM) {
                if (FIRST_TEAM > SECOND_TEAM) {
                    firstTeamLeadTime += (goalInTime - lastGoalTime);
                } else {
                    secondTeamLeadTime += (goalInTime - lastGoalTime);
                }
            }

            if (team == 1) {
                FIRST_TEAM++;
            } else {
                SECOND_TEAM++;
            }

            lastGoalTime = goalInTime;

        }

        if (FIRST_TEAM != SECOND_TEAM) {
            if (FIRST_TEAM > SECOND_TEAM) {
                firstTeamLeadTime += GAME_TIME - lastGoalTime;
            } else {
                secondTeamLeadTime += GAME_TIME - lastGoalTime;
            }
        }

        System.out.println(formatTime(firstTeamLeadTime));
        System.out.print(formatTime(secondTeamLeadTime));
    }

    private static String formatTime(int time) {
        int hour = time / 60;
        int minute = time % 60;
        return String.format("%02d:%02d", hour, minute);
    }
}
