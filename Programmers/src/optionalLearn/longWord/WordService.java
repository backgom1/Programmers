package optionalLearn.longWord;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WordService {

    private static WordService instance;

    private WordService() {

    }

    public static WordService getInstance() {
        if (instance == null) {
            instance = new WordService();
        }
        return instance;
    }

    public List<Integer> sameNumber(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {
            return new ArrayList<>();
        }
        return IntStream.range(0, nums.size() - 1) // 0부터 nums.size()-2까지 인덱스 범위를 스트림으로 생성
                .filter(i -> nums.get(i) + 1 == nums.get(i + 1)) // 연속된 숫자 쌍을 필터링
                .map(i -> nums.get(i + 1) - nums.get(i)) // 숫자 차이 계산
                .boxed() // IntStream을 Stream<Integer>로 변환
                .collect(Collectors.toList()); // 결과를 List<Integer>로 수집
    }

    public int bigSmall(List<Integer> nums) {
        if (nums == null || nums.isEmpty()) {

        }

        Optional<Integer> max = nums.stream().max(Integer::compareTo);
        Optional<Integer> min = nums.stream().min(Integer::compareTo);
        //(s1, s2) -> Integer.compare(s1.length(), s2.length())
        return max.get() - min.get();

    }

    public int duplicate(List<Integer> intList) {

        if (intList == null || intList.isEmpty()) {
            return 0;
        }
        long startTime = System.currentTimeMillis();
        int result = intList.stream()
                .distinct()
                .mapToInt(Integer::intValue)
                .sum();

        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        System.out.println("elapsedTime = " + elapsedTime);

        return result;



    }

}
