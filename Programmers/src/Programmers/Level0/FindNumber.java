package Programmers.Level0;

public class FindNumber {
    public int solution(int num, int k) {
        int answer = 0;
        String str = String.valueOf(num);
        String str2 = String.valueOf(k);
        //값을 포함하는지
        if (str.contains(str2) == false){
            answer = -1;
        }else {
            //인덱스를 찾는다.
            int i = str.indexOf(str2);
            answer = i + 1;
        }
        System.out.println("answer = " + answer);
        return answer;
    }

    public static void main(String[] args) {
        FindNumber findNumber = new FindNumber();
        findNumber.solution(29183, 1);
    }
}
