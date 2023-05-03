package optionalLearn.lengthFive;

import java.util.List;
import java.util.Optional;

public class LengthFive {

    public static Optional<String> lengthFive(List<String> list){
        if(list ==null){
            Optional.empty();
        }
        return list.stream()
                .filter(s -> s.length()<= 5)
                .reduce((first, second) -> second);
    }
}
