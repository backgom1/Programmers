package learn;

import java.util.Arrays;

public class ComparableMain1 {
    public static void main(String[] args) {
        MyComparable mc1 = new MyComparable(10, "a");
        MyComparable mc2 = new MyComparable(20, "b");
        MyComparable mc3 = new MyComparable(30, "b");
        MyComparable[] comparable = new MyComparable[]{mc1,mc3,mc2};

        System.out.println(Arrays.toString(comparable));

        Arrays.sort(comparable);

        System.out.println(Arrays.toString(comparable));
    }
}
