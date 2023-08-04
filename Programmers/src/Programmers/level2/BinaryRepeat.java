package Programmers.level2;

public class BinaryRepeat {
    public static void main(String[] args) {
        String s = "110010101001";
        BinaryRepeat sol = new BinaryRepeat();
        int[] solution = sol.solution(s);
        for (int i : solution) {
            System.out.println("i = " + i);
        }
    }


    public int[] solution(String s) {
        int zeroCnt = 0;
        int binaryCnt = 0;
        while (true) {
            if (s.equals("1")) {
                break;
            } else {
                for (int i = 0; i < s.length(); i++) {
                    if (s.charAt(i) == '0') {
                        zeroCnt++;
                    }
                }

                s = s.replaceAll("0", "");
                int length = s.length();
                s = Integer.toString(length, 2);
                binaryCnt++;
            }
        }
        int[] answer = {binaryCnt, zeroCnt};
        return answer;
    }
}
