package Programmers.Level0;

public class GakDoGi {
    public int solution(int angle) {

        if(angle == 180) return 4;
        if(angle>90 && angle<180) return 3;
        if(angle == 90) return 2;
        return 1;
    }
}
