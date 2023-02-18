package Programmers.Level0;

import java.util.ArrayList;
import java.util.List;

public class CutAndSave {
    public String[] solution(String my_str, int n) {
        List<String> answer = new ArrayList<>();
        //int 값이 온전한 값들을 잘라내는작업을 합니다.
        for (int i = 0; i < (my_str.length() / n); i++) {
            String substring = my_str.substring((i * n), (n * (i + 1)));
            answer.add(substring);
        }
        //만약 몫이 나누어떨어지지 않으면 마지막 값도 추가해야합니다.
        if (my_str.length() % n != 0) {
            String substring1 = my_str.substring((my_str.length() / n) * n);
            answer.add(substring1);
        }
        System.out.println("answer = " + answer);
        // List 를 배열로 바꿔주는역할인데 길이를 0으로 넘겨주면 list의 길이만큼 배열로 저장 시켜줍니다.
        return answer.toArray(new String[0]);

    }

    public static void main(String[] args) {
        CutAndSave cutAndSave = new CutAndSave();
        cutAndSave.solution("abc1Addfggg4556b", 6);
    }

}
