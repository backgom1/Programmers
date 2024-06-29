package Programmers.Level0;

public class DivisionPlus {

    public static void main(String[] args) {
        DivisionPlus divisionPlus = new DivisionPlus();

        int[] answer = divisionPlus.solution(1, 3, 1, 6);

        for (int i : answer) {
            System.out.println(i);
        }
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];

        int numer = (numer1 * denom2) + (numer2 * denom1);
        int denom = denom1 * denom2;

        int maxDivision = maxDivision(numer, denom);

        answer[0] = numer / maxDivision;
        answer[1] = denom / maxDivision;

        return answer;


    }


    public int maxDivision(int numer,int denom){
        while(denom != 0){
            int tmp = denom;
            denom = numer % denom;
            numer = tmp;
        }
        return numer;
    }

}
