package Programmers.level2;

import java.util.*;

public class VirusPipe {
    static int answer = 0;

    public static void main(String[] args) {
        VirusPipe sol = new VirusPipe();

        System.out.println("sol = " + sol.solution(10, 1,
                new int[][]{
                        {1, 2, 1}, {1, 3, 1}, {1, 4, 3}, {1, 5, 2},
                        {5, 6, 1}, {5, 7, 1}, {2, 8, 3}, {2, 9, 2}, {9, 10, 1}
                }, 2));

        System.out.println("sol = " + sol.solution(7, 6,
                new int[][]{
                        {1, 2, 3}, {1, 4, 3}, {4, 5, 1},
                        {5, 6, 1}, {3, 6, 2}, {3, 7, 2}
                }, 3));

    }

    public int solution(int n, int infection, int[][] edges, int k) {
        answer = 0;

        Node[] nodes = new Node[n + 1];
        init(nodes, edges);

        char[] choices = {'A', 'B', 'C'};
        char[] result = new char[k];

        dfs(0, k, choices, result, nodes, infection, n);

        return answer;
    }

    private static void init(Node[] nodes, int[][] edges) {
        for (int i = 1; i < nodes.length; i++) {
            nodes[i] = new Node();
        }

        for (int[] edge : edges) {
            int x = edge[0];
            int y = edge[1];
            int type = edge[2];

            nodes[x].pipes.add(new Pipe(type, y));
            nodes[y].pipes.add(new Pipe(type, x));
        }
    }

    static class Node {
        List<Pipe> pipes = new ArrayList<>();
    }

    static class Pipe {
        char type;
        int linkNumber;

        public Pipe(int type, int linkNumber) {
            if (type == 1) {
                this.type = 'A';
            } else if (type == 2) {
                this.type = 'B';
            } else {
                this.type = 'C';
            }
            this.linkNumber = linkNumber;
        }
    }

    static void dfs(int depth, int k, char[] choices, char[] result, Node[] nodes, int infection, int n) {
        if (depth == k) {
            simulate(result, nodes, infection, n);
            return;
        }

        for (char choice : choices) {
            if (depth > 0 && result[depth - 1] == choice) {
                continue;
            }

            result[depth] = choice;
            dfs(depth + 1, k, choices, result, nodes, infection, n);
        }
    }

    private static void simulate(char[] result, Node[] nodes, int infection, int n) {
        boolean[] infected = new boolean[n + 1];
        infected[infection] = true;

        for (char openType : result) {
            spread(nodes, infected, openType, n);
        }

        int score = 0;
        for (int i = 1; i <= n; i++) {
            if (infected[i]) {
                score++;
            }
        }

        answer = Math.max(answer, score);
    }

    private static void spread(Node[] nodes, boolean[] infected, char openType, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[n + 1];

        for (int i = 1; i <= n; i++) {
            if (infected[i]) {
                queue.offer(i);
                visited[i] = true;
            }
        }

        while (!queue.isEmpty()) {
            int current = queue.poll();

            for (Pipe pipe : nodes[current].pipes) {
                if (pipe.type != openType) {
                    continue;
                }

                int next = pipe.linkNumber;

                if (visited[next]) {
                    continue;
                }

                visited[next] = true;
                infected[next] = true;
                queue.offer(next);
            }
        }
    }
}

