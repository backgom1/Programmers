package Programmers.level1;

class Solution{
    public static void main(String[] args) {
        String[] babbling= new String[]{"ayaaya"};
        Solution solution = new Solution();
        int solution1 = solution.solution(babbling);
        System.out.println("solution1 = " + solution1);
    }

    public int solution(String[] babbling) {
        int answer = 0;
        String[] babySpeak = new String[]{"aya", "ye", "woo", "ma"};
        for(String speak : babbling){
            for(String speak1 : babySpeak){
               speak = speak.replace(speak1,"!");
            }
            speak = speak.replace("!","");
            if(speak.length()==0){
                answer++;
            }
        }


        return answer;
    }
}