package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Number_BaseBall_2508 {
    static class Guess {
        int number;   // 민혁이가 물어본 3자리 수 (예: 873)
        int strike;   // 영수의 대답 스트라이크 수 (예: 2)
        int ball;     // 영수의 대답 볼 수 (예: 0)
        public Guess(int number, int strike, int ball) {
            this.number = number;
            this.strike = strike;
            this.ball = ball;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 1) 질문 횟수 N 입력
        int N = Integer.parseInt(br.readLine());

        // 2) N개의 질문(3자리 수, 스트라이크, 볼)을 저장
        Guess[] guesses = new Guess[N];
        for (int i = 0; i < N; i++) {
            String[] inputs = br.readLine().split(" ");
            int number = Integer.parseInt(inputs[0]); // ex) 873
            int strike = Integer.parseInt(inputs[1]); // ex) 2
            int ball   = Integer.parseInt(inputs[2]); // ex) 0
            guesses[i] = new Guess(number, strike, ball);
        }

        // 3) 가능한 모든 3자리 수(1~9 서로 다른 숫자) 체크
        int answerCount = 0;
        for (int candidate = 123; candidate <= 987; candidate++) {
            if (!isValid(candidate)) {
                continue; // 0이 포함되거나 중복 숫자면 스킵
            }

            // 현재 candidate가 모든 질문/답변과 일치하는지 검사
            boolean possible = true;
            for (Guess g : guesses) {
                int s = getStrike(candidate, g.number);
                int b = getBall(candidate, g.number);
                if (s != g.strike || b != g.ball) {
                    possible = false;
                    break;
                }
            }
            if (possible) {
                answerCount++;
            }
        }

        // 4) 출력
        System.out.println(answerCount);
    }

    // candidate(예: 324)에 0이 들어있거나, 숫자가 중복되면 false
    private static boolean isValid(int num) {
        String str = String.valueOf(num);
        if (str.length() != 3) return false;  // 혹시라도 2자리 이하인 경우

        // 각 자리 숫자가 '0'이 아닌지, 그리고 중복이 없는지 검사
        char a = str.charAt(0);
        char b = str.charAt(1);
        char c = str.charAt(2);
        if (a == '0' || b == '0' || c == '0') return false;
        if (a == b || b == c || a == c) return false;
        return true;
    }

    // 두 수(예: 324와 429)를 비교했을 때의 스트라이크 수 계산
    private static int getStrike(int candidate, int guess) {
        String c = String.valueOf(candidate);//순환
        String g = String.valueOf(guess);//추측
        int strikeCount = 0;
        for (int i = 0; i < 3; i++) {
            if (c.charAt(i) == g.charAt(i)) {
                strikeCount++;
            }
        }
        return strikeCount;
    }

    // 두 수(예: 324와 429)를 비교했을 때의 볼 수 계산
    private static int getBall(int candidate, int guess) {
        String c = String.valueOf(candidate);
        String g = String.valueOf(guess);
        int ballCount = 0;
        for (int i = 0; i < 3; i++) {
            // 자리는 다르지만 숫자는 포함되어 있으면 볼
            if (c.charAt(i) != g.charAt(i) && c.indexOf(g.charAt(i)) != -1) {
                ballCount++;
            }
        }
        return ballCount;
    }
}