package learn;

public class Prime {

    public static void main(String[] args) {
        int target = 100;
        if (isPrime(target)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }

    private static boolean isPrime(int target) {
        if (target < 2) return true;
        if (target == 2) return true;
        if (target % 2 == 0) return false;

        int sqrt = (int) Math.sqrt(target);

        for (int i = 3; i <= sqrt; i += 2) {
            if (target % i == 0) return false;
        }

        return true;
    }

    private static boolean isPrimePure(int target) {
        int sqrt = (int) Math.sqrt(target);

        for (int i = 2; i <= sqrt; i++) {
            if (target % i == 0) return false;
        }

        return true;
    }
}
