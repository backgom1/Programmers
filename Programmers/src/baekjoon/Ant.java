package baekjoon;

public class Ant {

    public static void main(String[] args) {
        int junHun = 0;
        int sungMin = 0;
        String answer;

        if(junHun>sungMin){
            answer = "BNP";
        } else if(junHun <sungMin){
            answer = "TIMING";
        } else {
            answer = "SAMESAME";
        }

        System.out.println(answer);
    }
}
