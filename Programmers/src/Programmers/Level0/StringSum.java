package Programmers.Level0;

public class StringSum {
    public int solution(String my_string) {
        String[] str = my_string.split(" ");
        //첫번째 배열의 값을 저장
        int answer = Integer.parseInt(str[0]);
        for (int i = 1; i < str.length; i += 2) {
            //첫번째 값이 + 면 두번째 값을 더하고 아니라면 빼주세요
            if (str[i].equals("+")) {
                answer += Integer.parseInt(str[i + 1]);
            } else
                answer -= Integer.parseInt(str[i + 1]);
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {

        StringSum stringSum = new StringSum();
        stringSum.solution("3 + 4");

    }
}
