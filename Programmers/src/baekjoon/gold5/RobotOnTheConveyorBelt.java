package baekjoon.gold5;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RobotOnTheConveyorBelt {

    public static void main(String[] args) {
        LinkedList<Integer> lk = new LinkedList<>();
        LinkedList<Integer> robotLocation = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();

        for (int i = 0; i < N * 2; i++) {
            lk.add(sc.nextInt());
        }

        for (int i = 0; i < N*2 ; i++) {
            robotLocation.add(0);
        }


        int zeroCnt = 0;
        int step = 0;
        while (true) {
            //4. 0이 몇개 있는지 판별하는 함수
            for (Integer zero : lk) {
                if (zero == 0) {
                    zeroCnt++;
                }
            }
            if (K <=zeroCnt) break;

            //1.한바퀴 돌림
            Integer lastNum = lk.removeLast();
            lk.addFirst(lastNum);
            Integer lastRobotNum = robotLocation.removeLast();
            robotLocation.addFirst(lastRobotNum);
            robotLocation.set(N-1, 0);

            //2. 가장 먼저 벨트에 올라간 로봇부터, 벨트가 회전하는 방향으로 한 칸 이동할 수 있다면 이동한다. 만약 이동할 수 없다면 가만히 있는다.
            //2.1 로봇이 이동하기 위해서는 이동하려는 칸에 로봇이 없으며, 그 칸의 내구도가 1 이상 남아 있어야 한다.
            for (int i = 0; i < robotLocation.size(); i++) {
                if (robotLocation.get(i) == 1) {
                    Integer conveyorBelt = lk.get(i+1);
                    if (conveyorBelt != 0 && robotLocation.get(i+1)!=1) {
                        conveyorBelt = conveyorBelt - 1;
                        lk.set(i+1, conveyorBelt);
                        //로봇을 이동해하는 메서드가 있어야함
                        robotLocation.set(i,0);
                        robotLocation.set(i+1,1);
                    }// 0,1,2 // 3,4,5
                    robotLocation.set(N-1, 0);
                }
            }

            //3.올리는 위치에 있는 칸의 내구도가 0이 아니면 올리는 위치에 로봇을 올린다.
            if (lk.get(0) != 0) {
                robotLocation.set(0, 1);
                Integer currentNum = lk.get(0);
                currentNum = currentNum - 1;
                lk.set(0, currentNum);
            }


            zeroCnt = 0;
            step++;

        }
        System.out.println(step);
    }
}
