package Programmers.level2;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class CutWires {

    public static void main(String[] args) {
        CutWires sol = new CutWires();

        System.out.println("sol = " + sol.solution(9,
                new int[][]{
                        {1, 3}, {2, 3}, {3, 4}, {4, 5},
                        {4, 6}, {4, 7}, {7, 8}, {7, 9}
                }));

        System.out.println("sol = " + sol.solution(4,
                new int[][]{
                        {1, 2}, {2, 3}, {3, 4}
                }));

        System.out.println("sol = " + sol.solution(7,
                new int[][]{
                        {1, 2}, {2, 7}, {3, 7},
                        {3, 4}, {4, 5}, {6, 7}
                }));
    }

    public int solution(int n, int[][] wires) {
        int answer = Integer.MAX_VALUE;
        Node[] nodes = new Node[n + 1];

        for (int[] wire : wires) {
            init(n, wires, nodes);
            boolean[] visited = new boolean[n + 1];
            int[] divide = new int[2];
            int currentNode = wire[0];
            int cutNode = wire[1];
            nodes[currentNode].cutNode(cutNode);
            nodes[cutNode].cutNode(currentNode);

            Queue<Node> q = new LinkedList<>();
            boolean offside = false;
            for (int i = 1; i <= n; i++) {

                if (visited[i]) {
                    continue;
                }

                int count = 1;

                visited[i] = true;

                Node node = nodes[i];

                List<Integer> links = node.links;

                for (Integer link : links) {
                    if(!visited[link]) {
                        count++;
                        visited[link] = true;
                        q.add(nodes[link]);
                    }
                }

                while (!q.isEmpty()) {

                    Node node1 = q.poll();


                    List<Integer> links1 = node1.links;

                    for (Integer link : links1) {
                        if (!visited[link]) {
                            count++;
                            visited[link] = true;
                            q.add(nodes[link]);
                        }

                    }
                }

                if (!offside) {
                    divide[0] = count;
                    offside = true;
                } else {
                    divide[1] = count;
                }


            }

            int temp = 0;

            if (divide[0] > divide[1]) {
                temp = divide[0] - divide[1];
            } else if (divide[0] < divide[1]) {
                temp = divide[1] - divide[0];
            }

            if (temp < answer) {
                answer = temp;
            }
        }


        return answer;
    }

    private void init(int n, int[][] wires, Node[] nodes) {
        for (int i = 1; i <= n; i++) {
            nodes[i] = new Node();
        }
        for (int[] wire : wires) {
            int currentNode = wire[0];
            int links = wire[1];
            nodes[currentNode].setLinks(links);
            nodes[links].setLinks(currentNode);
        }
    }


    static class Node {

        List<Integer> links = new ArrayList<>();

        public void setLinks(int links) {
            this.links.add(links);
        }

        public void cutNode(int cutNode) {
            this.links.remove((Integer) cutNode);
        }
    }
}
