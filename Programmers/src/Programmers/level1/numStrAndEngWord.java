package Programmers.level1;


public class numStrAndEngWord {

    public static void main(String[] args) {
        String s = "2three45sixseven";
        numStrAndEngWord numStrAndEngWord = new numStrAndEngWord();
        int solution = numStrAndEngWord.solution(s);
        System.out.println("solution = " + solution);
    }

    public int solution(String s) {
        String[] engWord =new String[]{"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < engWord.length; i++) {
            if(s.contains(engWord[i])){
                s = s.replace(engWord[i],String.valueOf(i));
            }
        }

        return Integer.parseInt(s);
    }
}
