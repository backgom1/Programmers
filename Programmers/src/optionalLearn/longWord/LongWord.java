package optionalLearn.longWord;


import java.util.List;
import java.util.Optional;

public class LongWord {

    public static Optional<String> findLongestString(List<String> stringList) {
        if (stringList == null || stringList.isEmpty()) {
            return Optional.empty();
        }
        return stringList.stream()
                .max((s1, s2) -> Integer.compare(s1.length(), s2.length()));
    }
}
