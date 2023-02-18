package LearnJava.Section1;

import java.util.Scanner;

public class BigAndSmallChange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        String input2 = "";
        for (char s : str.toCharArray()) {
            if (Character.isLowerCase(s)) {
               input2 +=Character.toUpperCase(s);
            } else {
               input2 += Character.toLowerCase(s);
            }
        }
        System.out.println(input2);
        return;
    }

}
