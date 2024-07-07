package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class CandidateRecommendation {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int frameCount = Integer.parseInt(br.readLine());
        List<Candidate> candidates = new ArrayList<>();

        int studentCount = Integer.parseInt(br.readLine());

        String[] recommendList = br.readLine().split(" ");


        for (int i = 0; i < studentCount; i++) {
            int student = Integer.parseInt(recommendList[i]);

            boolean existStudent = false;
            for (Candidate candidate : candidates) {
                if (candidate.studentNumber == student) {
                    candidate.recommendNumber++;
                    existStudent = true;
                    break;
                }
            }

            if (!existStudent) {
                if (candidates.size() >= frameCount) {
                    // 추천 횟수가 가장 적은 학생 찾기
                    candidates.sort((c1, c2) -> {
                        if (c1.recommendNumber != c2.recommendNumber) {
                            return Integer.compare(c1.recommendNumber, c2.recommendNumber);
                        } else {
                            return Integer.compare(c1.insertNumber, c2.insertNumber);
                        }
                    });
                    candidates.remove(0);
                }
                candidates.add(new Candidate(student, i));
            }
        }

        Candidate[] array = candidates.toArray(new Candidate[0]);
        Arrays.sort(array, Comparator.comparingInt(o -> o.studentNumber));

        StringBuilder result = new StringBuilder();
        for (Candidate candidate : array) {
            result.append(candidate.studentNumber).append(" ");
        }
        if (result.length() > 0) {
            result.setLength(result.length() - 1);
        }
        System.out.print(result.toString());
    }
}

class Candidate {
    int recommendNumber;
    int studentNumber;
    int insertNumber;

    public Candidate(int studentNumber, int insertNumber) {
        this.recommendNumber = 1;
        this.studentNumber = studentNumber;
        this.insertNumber = insertNumber;
    }
}
