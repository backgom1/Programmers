package Programmers.level1;

public class CaesarPassword {
    public static void main(String[] args) {
        String s = "a B z";
        int n = 4;
        CaesarPassword caesarPassword = new CaesarPassword();
        String solution = caesarPassword.solution(s, n);
        System.out.println("solution = " + solution);
    }

    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt > 64 && charAt < 123) {

                for (int j = 0; j < n; j++) {

                    charAt++;
                    if (charAt == 91) {
                        charAt = 65;
                    }
                    if (charAt == 123) {
                        charAt = 97;
                    }
                }
                sb.append(String.valueOf(charAt));
            }else {
                sb.append(charAt);
            }
        }
        String answer = String.valueOf(sb);
        return answer;
    }
}
