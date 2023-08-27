package baekjoon.gold;

import java.util.*;

public class Gear {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<LinkedList<Integer>> arrayListOfLinkedLists = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            LinkedList<Integer> innerLinkedList = new LinkedList<>();
            String inputGear = sc.nextLine();

            for (int k = 0; k < inputGear.length(); k++) {
                int parseInt = Integer.parseInt(inputGear.charAt(k) + "");
                innerLinkedList.add(parseInt);
            }
            arrayListOfLinkedLists.add(innerLinkedList);
        }

        int K = sc.nextInt();

        for (int i = 0; i < K; i++) {
            int gearNo = sc.nextInt() - 1;
            int rotation = sc.nextInt();

            rotateGears(arrayListOfLinkedLists, gearNo, rotation);
        }

        System.out.println(topGearToothSum(arrayListOfLinkedLists));
    }

    public static void rotateGears(ArrayList<LinkedList<Integer>> arrayListOfLinkedLists, int gearNo, int rotation) {
        int[] rotationArray = new int[4];
        rotationArray[gearNo] = rotation;

        for (int j = gearNo; j > 0; j--) {
            LinkedList<Integer> currentGear = arrayListOfLinkedLists.get(j);
            LinkedList<Integer> beforeGear = arrayListOfLinkedLists.get(j - 1);
            if (beforeGear.get(2) != currentGear.get(6)) {
                rotationArray[j - 1] = -rotationArray[j];
            } else {
                break;
            }
        }


        for (int j = gearNo; j < 3; j++) {
            LinkedList<Integer> currentGear = arrayListOfLinkedLists.get(j);
            LinkedList<Integer> futureGear = arrayListOfLinkedLists.get(j + 1);
            if (futureGear.get(6) != currentGear.get(2)) {
                rotationArray[j + 1] = -rotationArray[j];
            } else {
                break;
            }
        }


        for (int j = 0; j < 4; j++) {
            int rotationType = rotationArray[j];
            LinkedList<Integer> currentGear = arrayListOfLinkedLists.get(j);
            if (rotationType == 1) {
                currentGear.addFirst(currentGear.removeLast());
            } else if (rotationType == -1) {
                currentGear.addLast(currentGear.removeFirst());
            }
        }
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
