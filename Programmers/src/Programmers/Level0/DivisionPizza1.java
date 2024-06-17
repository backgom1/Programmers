package Programmers.Level0;


/**
 * 몫을 나눠 피자 판수를 구한다.
 * 7을 나눠서 나머지가 나오면 피자판수를 +1해줘야함
 */
public class DivisionPizza1 {

    public int solution(int n) {
        int answer = 0;

        int enoughPizza = n/7;
        int insufficientPizza = n%7;

        if(insufficientPizza>0){
            answer++;
        }

        return answer+enoughPizza;
    }
}
