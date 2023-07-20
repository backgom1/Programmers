package Programmers.level1;

public class StringSplitter {
    public static void main(String[] args) {
        String s = "abaa";
        StringSplitter sol = new StringSplitter();
        int solution = sol.solution(s);
        System.out.println("solution = " + solution);
    }

    public int solution(String s) {
        int firstCnt = 0;
        int secondCnt = 0;
        int answer = 0;
        int index = 0;
       while (s.length() != 0){

           if (s.length() == 1 || index == s.length() - 1) {
               answer++;
               break;
           }
            if(s.charAt(0) != s.charAt(index)){
                secondCnt++;
            }else {
                firstCnt++;
            }
            if(firstCnt==secondCnt){
                answer++;
                firstCnt = 0;
                secondCnt = 0;
                 s = s.substring(index+1,s.length());
                index = 0;
            }else {
                index++;
            }
        }
        return answer;
    }
}
