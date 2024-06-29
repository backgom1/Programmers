package Programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 순서를 돌리는 방법은 4로 가정을 시작하면 1,2,3,4 ... 를 진행하고 n의 -1대로 반복을 진행하면된다.
 * 5,6,7 -> 3
 * 8,9 -> 2
 * 10 -> 1
 * 순서로 삼각형을 구현하면될꺼같습니다.
 * <p>
 * 문제는 어떻게 담을것이냐?
 * 총 피라미드 수는 n개이므로 Map으로 방을 나눈다. 그리고
 * n번을 3번 반복했을때 나온 마지막 숫자에 대해서 2칸씩 내려서 시작한다. 그리고 남아있는 n에 대해서 반복
 * 첫번째 반복에서는 인덱스를 순차적으로 담고 2번째는 제일 아래에 대한것에 대해 담고 , 마지막도 동일하게 최고점에서 배열을 담아주면된다.
 **/
public class TriangleSnail {

    static Map<Integer, List<Integer>> trangle = new HashMap<>();

    public int[] solution(int n) {
        int[] answer = {};
        init(n);

        int seq = 1;
        while (n == 0) {
            int depth = 1;
            int count = 1;
            for (int i = 1; i < 4; i++) { //삼각형을 돌리는 for
                //1,3
                if (i == 1) {
                    for (int j = seq; j < n; j++) {
                        List<Integer> depthTrangle = trangle.get(depth);
                        depthTrangle.add(count);
                    }
                }

                //2
                if (i == 2) {
                    for (int j = seq; j < n; j++) {
                        List<Integer> depthTrangle = trangle.get(depth);
                        depthTrangle.add(count);
                    }
                }

                if (i == 3) {
                    for (int j = seq; j < n; j++) {
                        List<Integer> depthTrangle = trangle.get(depth);
                        depthTrangle.add(count);
                    }
                }

                n--;
            }
        }

        return answer;
    }


    private void init(int n) {
        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            trangle.put(i, list);
        }
    }
}
