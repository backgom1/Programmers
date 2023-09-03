package contest.sonlinhighschool;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 스택을 두개를 만들어 값을 담고
 * 첫번째로 더미에 쌓인 교과서 수가 총 교과서 수보다 많다면 No
 * 그렇지 않다면 차례대로 값을 poll한다음 두번째 더미에서 -1하였을때 첫번째 더미와 같다면 진행하면 된다.
 * 안된단다면 break하고 No를 출력
 */
public class dataStructureIsAmazing {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        String result = result(M, br, N);
        System.out.print(result);
    }

    private static String result(int M, BufferedReader br, int N) throws IOException {
        Map<Integer, Stack<Integer>> floor = new HashMap<>();
        int aHeapSum = 0;
        for (int i = 0; i < M; i++) {
            int ki1 = Integer.parseInt(br.readLine());
            aHeapSum += ki1;
            String[] ki2 = br.readLine().split(" ");
            for (int j = 0; j < ki2.length; j++) {
                Stack<Integer> list = new Stack<>();
                int i1 = Integer.parseInt(ki2[j]);
                if (!floor.containsKey(j)) {
                    list.add(i1);
                    floor.put(j, list);
                } else {
                    Stack<Integer> integers = floor.get(j);
                    integers.add(i1);
                    floor.put(j, integers);
                }

            }
        }
        if (N != aHeapSum) {
            return "No";
        } else {
            for (int i = 0; i < floor.size(); i++) {
                Stack<Integer> floorList = floor.get(i);
                int currentPop = floorList.pop()-1;
                while (!floorList.isEmpty()) {
                    int futurePop = floorList.pop();
                    if (currentPop != futurePop) {
                        return "No";
                    }
                }
            }
        }
        return "Yes";
    }
}
