package Programmers.Level0;

public class Letter {
    public int solution(String message) {
        int answer = message.length() * 2;
        return answer;
    }

    public static void main(String[] args) {
        Letter letter = new Letter();
        letter.solution("happy birthday!");

    }
}
