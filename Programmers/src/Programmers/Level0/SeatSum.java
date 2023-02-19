package Programmers.Level0;

public class SeatSum {
    public int solution(int n) {
        String str = String.valueOf(n);
        char[] chars = str.toCharArray();
        int answer = 0;

        for (char c :chars){
            int i = Integer.parseInt(String.valueOf(c));
            answer += i;
        }
        System.out.println(answer);
        return answer;
    }

    public static void main(String[] args) {
        SeatSum seatSum = new SeatSum();
        seatSum.solution(1234);
    }
}
