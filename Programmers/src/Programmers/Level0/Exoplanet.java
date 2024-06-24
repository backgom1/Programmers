package Programmers.Level0;

import java.util.HashMap;
import java.util.Map;

public class Exoplanet {

    private Map<String, String> englishConverter = new HashMap<>();

    public String solution(int age) {
        initConverter();
        String value = String.valueOf(age);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < value.length(); i++) {
            String splitStr = String.valueOf(value.charAt(i));
            sb.append(englishConverter.get(splitStr));
        }
        return sb.toString();
    }

    private void initConverter() {
        englishConverter.put("0", "a");
        englishConverter.put("1", "b");
        englishConverter.put("2", "c");
        englishConverter.put("3", "d");
        englishConverter.put("4", "e");
        englishConverter.put("5", "f");
        englishConverter.put("6", "g");
        englishConverter.put("7", "h");
        englishConverter.put("8", "i");
        englishConverter.put("9", "j");
    }
}
