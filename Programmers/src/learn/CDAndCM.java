package learn;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CDAndCM {

    public static void main(String[] args) {
        int target = 20;
        List<Integer> cd = cd(target);
        List<Integer> cm = cm(target);
        System.out.println(Arrays.toString(cd.toArray()));
        System.out.println(Arrays.toString(cm.toArray()));
    }

    private static List<Integer> cd(int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            if (target % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

    private static List<Integer> cm(int target) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= target; i++) {
            if (target % i == 0) {
                list.add(target * i);
            }
        }
        return list;
    }
}
