package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SerialNumber_1431 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());

        String[] serialNumber = new String[count];
        for (int i = 0; i < count; i++) {
            serialNumber[i] = br.readLine();
        }

        Arrays.sort(serialNumber, (a, b) -> {

            if (a.length() != b.length()) {
                return a.length() - b.length();
            }

            int sumA = getDigitSum(a);
            int sumB = getDigitSum(b);
            if (sumA != sumB) {
                return sumA - sumB;
            }

            return a.compareTo(b);
        });

        for (String s : serialNumber) {
            System.out.println(s);
        }
    }

    private static int getDigitSum(String str) {
        int sum = 0;
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                sum += c - '0';
            }
        }
        return sum;
    }
}
