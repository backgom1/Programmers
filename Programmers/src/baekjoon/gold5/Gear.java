package baekjoon.gold5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Gear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LinkedList<Integer>> arrayListOfLinkedLists = new ArrayList<>();

        //1 담는 방법
        for (int i = 0; i < 4; i++) {
            LinkedList<Integer> innerLinkedList = new LinkedList<>();
            String inputGear = sc.nextLine();

            for (int k = 0; k < inputGear.length(); k++) {
                String[] split = inputGear.split("");
                int parseInt = Integer.parseInt(split[k]);
                innerLinkedList.add(parseInt);
            }
            arrayListOfLinkedLists.add(innerLinkedList);
        }


        //2
        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int gearNo = sc.nextInt();
            int rotation = sc.nextInt();
            int gearNumCnt;


            if (rotation == 1) {
                gearNumCnt = gearNo - 1;
                while (true) {
                    if (gearNumCnt <= 0) break;
                    LinkedList<Integer> currentGear = arrayListOfLinkedLists.get(gearNumCnt); //1
                    gearNumCnt--;
                    LinkedList<Integer> beforeGear = arrayListOfLinkedLists.get(gearNumCnt); //0
                    if (beforeGear.get(2) != currentGear.get(6)) {

                    } else {
                        break;
                    }
                }
                gearNumCnt = gearNo - 1;
                while (true) {
                    if (gearNumCnt >= 3) break;
                    LinkedList<Integer> currentGear = arrayListOfLinkedLists.get(gearNumCnt);
                    gearNumCnt++;
                    LinkedList<Integer> futureGear = arrayListOfLinkedLists.get(gearNumCnt);
                    if (futureGear.get(6) != currentGear.get(2)) {
                        Integer spin = currentGear.removeLast();
                        currentGear.addFirst(spin);
                        if (gearNumCnt == 0) {
                            Integer lastSpin = currentGear.removeLast();
                            currentGear.addFirst(lastSpin);
                            Integer beforeSpin = futureGear.removeFirst();
                            futureGear.addLast(beforeSpin);
                        }
                    } else {
                        if (gearNumCnt == 0) {
                            Integer lastSpin = currentGear.removeLast();
                            currentGear.addFirst(lastSpin);
                        }
                        break;
                    }
                }
            } else {

                gearNumCnt = gearNo - 1;
                while (true) {
                    if (gearNumCnt <= 0) break;
                    LinkedList<Integer> currentGear = arrayListOfLinkedLists.get(gearNumCnt);
                    gearNumCnt--;
                    LinkedList<Integer> beforeGear = arrayListOfLinkedLists.get(gearNumCnt);
                    if (beforeGear.get(2) != currentGear.get(6)) {
                        if (gearNumCnt == 0) {
                            Integer beforeSpin = beforeGear.removeLast();
                            beforeGear.addFirst(beforeSpin);
                            Integer spin = currentGear.removeFirst();
                            currentGear.addLast(spin);
                        }
                    } else {
                        if (gearNumCnt == 0) {
                            Integer spin = currentGear.removeFirst();
                            currentGear.addLast(spin);
                        }
                        break;
                    }
                }
                gearNumCnt = gearNo - 1;
                while (true) {
                    if (gearNumCnt >= 3) break;
                    LinkedList<Integer> currentGear = arrayListOfLinkedLists.get(gearNumCnt);
                    gearNumCnt++;
                    LinkedList<Integer> futureGear = arrayListOfLinkedLists.get(gearNumCnt);
                    if (futureGear.get(6) != currentGear.get(2)) {
                        if (gearNumCnt == 0) {
                            Integer beforeSpin = futureGear.removeLast();
                            futureGear.addFirst(beforeSpin);
                            Integer spin = currentGear.removeFirst();
                            currentGear.addLast(spin);
                        }
                    } else {
                        if (gearNumCnt == 0) {
                            Integer spin = currentGear.removeFirst();
                            currentGear.addLast(spin);
                        }
                        break;
                    }
                }
            }


        }

        //첫번째 톱니 더하는 메서드
        System.out.println(topGearToothSum(arrayListOfLinkedLists));
    }

    public static int topGearToothSum(ArrayList<LinkedList<Integer>> arrayListOfLinkedLists) {
        int answer = 0;
        for (int i = 0; i < arrayListOfLinkedLists.size(); i++) {

            LinkedList<Integer> linkedList = arrayListOfLinkedLists.get(i);
            Integer topGearTooth = linkedList.get(0);
            if (topGearTooth == 1) {
                answer += (int) Math.pow(2, i);
            }
        }
        return answer;
    }
}
