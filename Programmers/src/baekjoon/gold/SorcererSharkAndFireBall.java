package baekjoon.gold;

import java.util.*;

public class SorcererSharkAndFireBall {
    //마법사 상어가 크기가 N×N인 격자에 파이어볼 M개를 발사
    //i번 파이어볼의 위치는 (ri, ci), 질량은 mi이고, 방향은 di, 속력은 si이다.
    public static Map<Integer, int[]> directionMove = new HashMap<>();

    public static void main(String[] args) {


        init();
        int answer = 0;
        List<FireBall> splitFireball = new ArrayList<>();
        List<FireBall> fireBalls = new ArrayList<>();


        Scanner sc = new Scanner(System.in);


        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < M; i++) {
            int ri = sc.nextInt();
            int ci = sc.nextInt();
            int mi = sc.nextInt();
            int si = sc.nextInt();
            int di = sc.nextInt();

            fireBalls.add(new FireBall(ri, ci, mi, si, di));
        }


        for (int i = 0; i < K; i++) {
            if (!splitFireball.isEmpty()) {
                fireBalls.addAll(splitFireball);
                splitFireball.clear();
            }
            for (int j = 0; j < M; j++) {
                FireBall fireBall = fireBalls.get(j);
                //방향 설정
                int[] fireballSetDirectionMove = directionMove.get(fireBall.getDi());
                //속도만큼 이동시키기
                moveFireballPosition(fireBall, fireballSetDirectionMove, N);
            }

            //이동한 파이어 볼을 넣어 주는 작업
            for (int j = 0; j < fireBalls.size(); j++) {
                FireBall fireBall = fireBalls.get(j);
                int ri = fireBall.getRi();
                int ci = fireBall.getCi();
            }


        }



        if (!splitFireball.isEmpty()) {
            for (FireBall fireBall : splitFireball) {
                int mi = fireBall.getMi();
                answer += mi;
            }
        }

        if (!fireBalls.isEmpty()) {
            for (FireBall fireBall : fireBalls) {
                int mi = fireBall.getMi();
                answer += mi;
            }
        }

        System.out.println(answer);
    }

    private static void moveFireballPosition(FireBall fireBall, int[] fireballSetDirectionMove, int N) {
        int ri = fireBall.getRi();
        int ci = fireBall.getCi();
        for (int k = 0; k < fireBall.getSi(); k++) {
            ri += fireballSetDirectionMove[0];
            ci += fireballSetDirectionMove[1];

            if (ci >= N) {
                ci = 0;
            }
            if (ci < 0) {
                ci = N - 1;
            }
            if (ri >= N) {
                ri = 0;
            }
            if (ri < 0) {
                ri = N - 1;
            }
        }
        fireBall.setRi(ri);
        fireBall.setCi(ci);
    }

    private static void init() {
        directionMove.put(0, new int[]{-1, 0});
        directionMove.put(1, new int[]{-1, 1});//대각
        directionMove.put(2, new int[]{0, 1});
        directionMove.put(3, new int[]{1, 1});//대각
        directionMove.put(4, new int[]{1, 0});
        directionMove.put(5, new int[]{1, -1});//대각
        directionMove.put(6, new int[]{0, -1});
        directionMove.put(7, new int[]{-1, -1});//대각
    }


    static class FireBall {

        int ri; // 로우
        int ci; // 컬럼
        int mi; // 질량
        int si; // 속력
        int di; // 방향


        public FireBall(int ri, int ci, int mi, int si, int di) {
            this.ri = ri;
            this.ci = ci;
            this.mi = mi;
            this.si = si;
            this.di = di;
        }

        public int getRi() {
            return ri;
        }

        public void setRi(int ri) {
            this.ri = ri;
        }

        public int getCi() {
            return ci;
        }

        public void setCi(int ci) {
            this.ci = ci;
        }

        public int getMi() {
            return mi;
        }

        public void setMi(int mi) {
            this.mi = mi;
        }

        public int getSi() {
            return si;
        }

        public void setSi(int si) {
            this.si = si;
        }

        public int getDi() {
            return di;
        }

        public void setDi(int di) {
            this.di = di;
        }
    }


}
