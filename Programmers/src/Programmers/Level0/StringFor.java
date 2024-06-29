package Programmers.Level0;

public class StringFor {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i =0; i<my_string.length(); i++){
            sb.append(String.valueOf(my_string.charAt(i)).repeat(Math.max(0, n)));
        }
        return sb.toString();
    }
}
