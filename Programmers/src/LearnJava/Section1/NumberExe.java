package LearnJava.Section1;

import java.util.Scanner;

public class NumberExe {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int answer = 0;
        String s = in.nextLine();
        for (char x : s.toCharArray()){
            if(x>=48 && x<=57){
                answer = answer * 10 + (x - 48);
            }
            System.out.println("answer = " + answer);
        }
//        //정규화를 이용해 숫자가 아닐경우 지워버리는것
//        s = s.replaceAll("\\D", "");
//        int i = Integer.parseInt(s);
//        System.out.println(i);
    }
}
