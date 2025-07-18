package learn.hash;

public class HashStart1 {
    public static void main(String[] args) {
        Integer[] input = new Integer[4];
        input[0] = 1;
        input[1] = 2;
        input[2] = 5;
        input[3] = 8;

        int searchValue = 5;
        for (Integer i : input) {
            if(i == searchValue){ //시간 복잡도 O(n)
                System.out.println("찾음!");
            }
        }
    }
}
