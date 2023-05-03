package optionalLearn.duplicate;

import java.util.ArrayList;
import java.util.List;

public class DuplicateAlpha {

    public static List<String> duplicateAlpha(List<String> stringList){
        List<String> result = new ArrayList<>();
         stringList.stream()
                .filter(s-> s.toLowerCase().startsWith("a"))
                .forEach(result::add);
        return result;
    }
}
