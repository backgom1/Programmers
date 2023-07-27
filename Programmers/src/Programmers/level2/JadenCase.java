package Programmers.level2;

public class JadenCase {
    public static void main(String[] args) {
        String s = "3people unFollowed   me";
        JadenCase j = new JadenCase();
        System.out.println("j = " + j.solution(s));
    }

    public String solution(String s) {
        String[] s1 = s.split(" ");
        String answer = "";
        for (int i = 0; i < s1.length; i++) {
            String target = s1[i];
            if (target.equals("")) {
                answer += " ";
            } else {
                answer += target.substring(0, 1).toUpperCase();
                answer += target.substring(1,target.length()).toLowerCase();
                answer += " ";
            }
        }

        //뒤에 공백문자열이 오면 그대로 반환
        if(s.substring(s.length()-1, s.length()).equals(" ")){
            return answer;
        }

        //없으면 짤라서 반환
        return answer.substring(0, answer.length()-1);
    }
}
