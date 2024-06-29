package Programmers.Level0;

/**
 * 자기의 숫자를 더해서 나누어떨어질때까지 상승시켜서 값이 나오면 그 값을 몫으로 반환하면 답이나온다.
 * 예 10+10+10 =30 30은 6으로 나누어 떨어지기때문에 30이 나오고 몫을 반환하면 30/6 = 5가 나온다.
 */
public class DivisionPizza2 {

    public static void main(String[] args) {
        int n = 10;
        DivisionPizza2 divisionPizza2 = new DivisionPizza2();
        divisionPizza2.solution(n);
    }

    public int solution(int n) {
        int tempNumber = n;
        while (tempNumber % 6 != 0) {
            tempNumber = tempNumber + n;
        }
        return tempNumber / 6;
    }
}
