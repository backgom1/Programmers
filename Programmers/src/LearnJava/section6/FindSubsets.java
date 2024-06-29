package LearnJava.section6;

public class FindSubsets {
    static int[] treeIncluding;
    static int L;

    public static void DFS(int n) {
        if (n == L) {
            String tmp = "";
            for (int i = 0; i < L; i++) {
                if (treeIncluding[i] == 1) tmp += (i + 1 + " ");
            }
            if (!tmp.isEmpty()) System.out.println(tmp);
        } else {
            treeIncluding[n] = 1;
            DFS(n + 1);//왼쪽
            treeIncluding[n] = 0;
            DFS(n + 1);//오른쪽
        }

    }

    public static void main(String[] args) {
        L = 10;
        treeIncluding = new int[L];
        DFS(0);
    }

}
