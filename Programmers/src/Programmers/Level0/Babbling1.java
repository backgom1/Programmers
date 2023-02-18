package Programmers.Level0;


//풀이 방법
// 1. replace로 값이 맞으면 "" 즉 배열에서 지워지는것인데 해당 크기가 0이면 카운트를 올리는 방식으로 진행을 해보면 된다.
public class Babbling1 {
    public int solution(String[] babbling) {
        String[] BabySpeak = {"aya", "ye", "woo", "ma"};
        int answer = 0;
        //받아올값 for 향상문
        for (String s : babbling) {
            //값을 replace로 변환시킨다 예를 들어 aya 면 ? ayae면 ?e로 변환
            for (String Baby : BabySpeak) {
                s = s.replace(Baby, "?");
            }
            //해당 받아온 값을 또 ""로 변환시킨다 왜냐면 반복문에서 돌리면 중간에 껴있는 값은 오류가 나기 때문이다.
           s = s.replace("?","");

            //해당 값이 존재하지 않을때 값을 상승 시켜준다.
            if (s.length() == 0) {
                answer++;
            }
            System.out.println(" answer = " + answer);
        }
        return answer;
    }
}
