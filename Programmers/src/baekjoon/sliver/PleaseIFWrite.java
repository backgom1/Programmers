package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 칭호의 개수 N (1<=N <=10^5)
 * 칭호를 출력해야하는 캐릭터 개수 M ( 1<= M <= 10^5 )
 * 칭호가 여러 개인 경우 가장 먼저 입력된 칭호 하나만 출력
 * 여러 개의 칭호를 만들고 a 100 b 100 c 200 d 300 e 301 f 302 g 400 h 350일 경우
 * 칭호에 값을 담을때 해당 key의 값이 들어가있을 경우 값을 넘어간다. 아마 칭호를 담는것은 map으로 관리할꺼같음
 * 해당 칭호를 list에 저장한후 최고값과 최소값을 더한다음 나누어서 해당 타겟과 비교를 한다.
 * 만약 크면 절반 ~ 최대 작으면 최소 ~ 절반 으로 계속 탐색하면된다.
 */
public class PleaseIFWrite {
    static Map<Integer, String> userMap = new HashMap<>();
    static List<Integer> totalList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] testSplit = bf.readLine().split(" ");
        int N = Integer.parseInt(testSplit[0]);
        int M = Integer.parseInt(testSplit[1]);

        // 칭호를 담는법
        for (int i = 0; i < N; i++) {
            String[] mapSplit = bf.readLine().split(" ");
            Integer powerNum = Integer.valueOf(mapSplit[1]);
            String title = mapSplit[0];
            if (!userMap.containsKey(powerNum)) {
                userMap.put(powerNum, title);
            }
            totalList.add(powerNum);
        }



        for (int i = 0; i < M; i++) {
            int lowNum = 0;
            int highNum = (totalList.size() - 1);
            int midNum = 0;
            int targetNum = Integer.parseInt(bf.readLine());
            if(userMap.containsKey(targetNum)){
                System.out.println(userMap.get(targetNum));
            }else {
                while (lowNum != highNum) {
                    midNum = (int) Math.ceil((lowNum + highNum) / 2);
                    if (targetNum > totalList.get(midNum)) {
                        lowNum = midNum+1;
                    } else {
                        highNum = midNum;
                    }
                }
                System.out.println(userMap.get(totalList.get(lowNum)));
            }
        }

    }




}
