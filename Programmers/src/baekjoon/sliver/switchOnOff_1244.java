package baekjoon.sliver;

import java.io.*;

/**
 * @link {<a href="https://www.acmicpc.net/problem/1244">...</a>}
 */
public class switchOnOff_1244 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int totalStudents = Integer.parseInt(br.readLine());

        int[] studentArrays = new int[totalStudents];

        String[] inputArr = br.readLine().split(" ");

        for (int i = 0; i < inputArr.length; i++) {
            studentArrays[i] = Integer.parseInt(inputArr[i]);
        }

        int switchCnt = Integer.parseInt(br.readLine());

        for (int i = 0; i < switchCnt; i++) {
            String[] splitInfo = br.readLine().split(" ");
            int studentType = Integer.parseInt(splitInfo[0]);
            int studentLocation = Integer.parseInt(splitInfo[1])-1;

            if (studentType == 1) { //남학생일 경우
                for (int j = studentLocation; j < totalStudents; j += studentLocation+1) {
                    studentArrays[j] = switchOnOff(studentArrays[j]);
                }
            } else {//여학생일 경우
                int left = studentLocation;
                int right = studentLocation;
                studentArrays[studentLocation] = switchOnOff(studentArrays[studentLocation]);
                while (left >= 0 && right < totalStudents && studentArrays[left] == studentArrays[right]) {
                        studentArrays[left] = switchOnOff(studentArrays[left]);
                        studentArrays[right] = switchOnOff(studentArrays[right]);
                        left--;
                        right++;
                }
            }

        }
        StringBuilder result= new StringBuilder();
        for (int i = 0; i < studentArrays.length; i++) {
            if (i>0 && i % 20 == 0)
            {
                result.substring(0, result.length() - 1);
                result.append("\n");
            }

            result.append(studentArrays[i]);


            if (i == studentArrays.length - 1)
            {
                result.substring(0, result.length() - 1);
            }
        }
        bw.write(result.toString());
    }

    private static int switchOnOff(int switchNum) {
        if (switchNum == 0) {
            switchNum = 1;
        } else {
            switchNum = 0;
        }
        return switchNum;
    }
}
