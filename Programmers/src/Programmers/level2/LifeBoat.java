package Programmers.level2;

import java.util.*;

public class LifeBoat {

    public static void main(String[] args) {
        LifeBoat sol = new LifeBoat();
        int[] people = {70, 50, 80, 50};
        int limit = 100;
        System.out.println("sol = " + sol.solution(people, limit));
    }

    public int solution(int[] people, int limit) {
        int answer = 0;

        Deque<Integer> queue = new LinkedList<>();
        Arrays.sort(people);

        for (int i = people.length - 1; i >= 0; i--) {
            queue.add(people[i]);
        }

        while (!queue.isEmpty()) {

            int heaviest = queue.pollFirst();


            if (!queue.isEmpty() && heaviest + queue.peekLast() <= limit) {
                queue.pollLast();
            }

            answer++;
        }

        return answer;
    }
}
