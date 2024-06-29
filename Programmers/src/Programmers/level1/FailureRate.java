package Programmers.level1;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 실패율
 *
 * @link <a href="https://school.programmers.co.kr/learn/courses/30/lessons/42889">실패율 링크</a>
 */
public class FailureRate {

    public static void main(String[] args) {
        int N = 5;
        int[] stages = new int[]{2, 1, 2, 6, 2, 4, 3, 3};
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = {};

        Arrays.sort(stages);

        List<StageFailureUser> stageFailureUsers = new ArrayList<>();

        int stageLength = stages.length;

        for (int i = 0; i < stages.length; i++) {
            int tempStageNumber = 0;
            int counter = 0;
            double failtureRate;

            tempStageNumber = stages[i];

            if (tempStageNumber == stageLength) {


                counter++;
            } else {
                failtureRate = (double) counter / stageLength;

                stageLength = stageLength - counter;
            }


//            new StageFailureUser(i + 1, failtureRate);
        }


        return answer;
    }
}


class StageFailureUser {
    int stageNumber;
    double failure;

    public StageFailureUser(int stageNumber, double failure) {
        this.stageNumber = stageNumber;
        this.failure = failure;
    }

    public int getStageNumber() {
        return stageNumber;
    }

    public double getFailure() {
        return failure;
    }
}