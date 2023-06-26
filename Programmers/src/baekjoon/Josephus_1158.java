package baekjoon;

import java.util.*;

public class Josephus_1158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
       int N =  sc.nextInt();
       int K = sc.nextInt();
        List<Integer> answer = new ArrayList<>();
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 1; i <= N; i++) {
            queue.offer(i); // 큐에 사람들을 순서대로 추가
        }

        while (queue.size() > 0) {
            for (int i = 0; i < K - 1; i++) {
                int removedPerson = queue.poll(); // K번째 이전의 사람들을 큐의 뒤로 이동
                queue.offer(removedPerson);
            }
            answer.add(queue.poll()); // K번째 사람을 큐에서 제거
        }
        sb.append("<");
            for(int i : answer){

                sb.append(i+", ");
                if(answer.size() ==1){

                }
            }
        sb.append(">");
        System.out.print(sb);
    }
}
