package learn;

import java.util.Arrays;
import java.util.Comparator;

public class SortMain1 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr, new AscComparator().reversed());//직접 비교자를 넣어 내가 만든 커스텀으로 넣으면된다.

    }

    static class AscComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return o1 - o2;
        }
    }

    static class DescComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer o1, Integer o2) {
            return (o1 < o2) ? -1 : ((o1.equals(o2)) ? 0 : 1) * -1; // 내림차순으로 변경
        }
    }
}
