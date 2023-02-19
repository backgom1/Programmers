package LearnJava.Section1;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        String answer = "NO";
        String s = in.nextLine();
        s=s.toUpperCase().replaceAll("[^A-Z]","");
        //정규식을 활용하여 A-Z이외에는 전부 ""로 처리해라
        String tmp = new StringBuilder(s).reverse().toString();
        if(s.equals(tmp)){
            answer = "YES";
        }
        System.out.println("answer = " + answer);
    }
}
