package Programmers.level1;

public class SmailPartialString {
    public static void main(String[] args) {
        String t = "500220839878";
        String p = "7";
        SmailPartialString smailPartialString = new SmailPartialString();
        int solution = smailPartialString.solution(t, p);
        System.out.println("solution = " + solution);

    }

    public int solution(String t, String p) {
        int answer = 0;
        long targetInt = Long.parseLong(p);
        for (int i = 0;; i++) {
            if(i+p.length()> t.length()){
                break;
            }
            long subInt = Long.parseLong(t.substring(i, i + p.length()));

            if(subInt<=targetInt){
                answer++;
            }
        }
        return answer;
    }
}
