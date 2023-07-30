package Programmers.level2;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PhoneNumberList {

    public static void main(String[] args) {
        String[] phone_book = new String[]{"123", "456", "789"};
        PhoneNumberList sol = new PhoneNumberList();
        System.out.println("sol = " + sol.solution(phone_book));
    }

    public boolean solution(String[] phone_book) {
        Map<String, Integer> phoneBook = new HashMap<>();

        for (int i = 0; i < phone_book.length; i++) {
            phoneBook.put(phone_book[i], i);
        }
        for (String value : phone_book) {
            for (String s : phoneBook.keySet()) {
                if (!s.equals(value) && s.startsWith(value)) {
                    return false;
                }
            }
        }

        return true;
    }
}
