package Programmers.level1;

import java.util.Arrays;
import java.util.Comparator;

public class StrRandomSort {
    public static void main(String[] args) {
        String[] strings = new String[]{"abzcd", "cdzab", "abzfg", "abzaa", "abzbb", "bbzaa"};
        int n = 2;
        StrRandomSort strRandomSort = new StrRandomSort();
        String[] solution = strRandomSort.solution(strings, n);
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }

    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings,new Comparator<String>(){
            @Override
            public int compare(String str1, String str2){
                //앞에보다 뒤에가 오름차순이면 변경
                if(str1.charAt(n) > str2.charAt(n)){return 1;}
                //정렬될게 아니라면 제자리
                else if(str1.charAt(n) < str2.charAt(n)){return -1;}
                //앞과 뒤의 내용이 같다면 문자열 형식으로
                else{ return str1.compareTo(str2);}
            }
        });
        return strings;
    }
}