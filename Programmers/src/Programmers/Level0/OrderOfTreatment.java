package Programmers.Level0;

/**
 * 내가 보다 큰 치료 우선 순위가 있다면 count를 ++ 해주면 된다. 만약 있다면 2순위고 3순위고.. 이런식으로 진행된다.
 */
public class OrderOfTreatment {

    public int[] solution(int[] emergency) {
        int[] answer = new int[emergency.length];

        for (int i = 0; i<emergency.length; i++){
            int count = 1;
            for (int j = 0; j<emergency.length; j++){
                if(emergency[i] != emergency[j] && emergency[i]<emergency[j]) count++;
            }
            answer[i] = count;
        }

        return answer;
    }

}
