package Programmers.level1;

public class Year2016 {

    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        Year2016 sol = new Year2016();
        String solution = sol.solution(a, b);
        System.out.println("solution = " + solution);
    }

    public String solution(int a, int b) {
        String[] day = new String[]{"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
        String answer = "";
        int selDayNum = 0;
        switch (a) {
            case 2: case 8:
                selDayNum = 1;
                break;
            case 3: case 11:
                selDayNum = 2;
                break;
            case 6:
                selDayNum = 3;
                break;
            case 9: case 12:
                selDayNum = 4;
                break;
            case 1: case 4: case 7:
                selDayNum = 5;
                break;
            case 10:
                selDayNum = 6;
                break;
            case 5:
                selDayNum = 0;
                break;
        }
        int index = selDayNum;
        String startDay = "";
        for (int i = 0; i < b; i++) {
            if (index > 6) {
                index = 0;
            }
            startDay = day[index];

            index++;
        }
        answer = startDay;
        return answer;
    }

}
