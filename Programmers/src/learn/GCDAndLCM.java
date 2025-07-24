package learn;

public class GCDAndLCM {
    public static void main(String[] args) {
        int a = 31;
        int b = 35;
        System.out.println(gcd(a, b));
        System.out.println(lcm(a, b));
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int target = b;
            b = a % b;
            a = target;
        }
        return a;
    }

    static int lcm (int a, int b){
        return a * b / gcd(a, b);
    }
}
