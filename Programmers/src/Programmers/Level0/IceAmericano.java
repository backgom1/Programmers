package Programmers.Level0;


/**
 * 아메리카노 한잔에 5500원
 * [잔수, 거스름돈]
 */
public class IceAmericano {

    public int[] solution(int money) {
        int[] answer = new int[2];
        int coffeeCount = money / 5500;
        int extraMoney = money % 5500;
        answer[0] = coffeeCount;
        answer[1] = extraMoney;
        return answer;
    }

    //배열안에 간단하게 계산식을 넣어서 사용해도되는듯 깔끔하게 한줄로 떨어짐
    public int[] solution2(int money) {
        return new int[] { money / 5500, money % 5500 };
    }

}
