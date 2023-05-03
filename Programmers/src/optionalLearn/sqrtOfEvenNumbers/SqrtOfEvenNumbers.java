package optionalLearn.sqrtOfEvenNumbers;


import java.util.List;
import java.util.stream.Collectors;

public class SqrtOfEvenNumbers {
    public static List<Double> getSqrtOfEvenNumbers(List<Integer> numbers) {
        return numbers.stream()
                .filter(s -> s % 2 == 0)
                .map(Math::sqrt)
                .collect(Collectors.toList());
    }

}
