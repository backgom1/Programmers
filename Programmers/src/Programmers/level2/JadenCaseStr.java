package Programmers.level2;

public class JadenCaseStr {

    public static void main(String[] args) {
        String s = "3people   unFollowed me     ";
        JadenCaseStr sol = new JadenCaseStr();
        System.out.println(sol.solution(s));
    }

    public String solution(String s) {
        String answer = "";
        String[] words = s.split(" ");

        for (String word : words) {
            if (word.length() > 0) {
                char firstChar = Character.toUpperCase(word.charAt(0));
                String restOfWord = word.substring(1).toLowerCase();
                answer += firstChar + restOfWord + " ";
            } else {
                answer += " ";
            }
        }

        return answer; // trim() 메소드를 사용하여 양쪽 공백 제거
    }
}
