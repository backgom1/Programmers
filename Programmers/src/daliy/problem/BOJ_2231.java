package daliy.problem;

import java.io.*;


/**
 * 자릿수를 구해 for문을 반복을 진행하고 만약 for문 밖으로 나가면 0으로 반환한다.
 */
public class BOJ_2231 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        String command = br.readLine();

        int answer = 0;
        for (int i = 1; i <= 1000000; i++) {
            String temp = String.valueOf(i);
            int sum = Integer.parseInt(temp);

            for (int j = 0; j < temp.length(); j++) {
                sum += Integer.parseInt(String.valueOf(temp.charAt(j)));
            }
            if (sum == Integer.parseInt(command)) {
                bw.write(i + "");
                bw.flush();
                bw.close();
                return;
            }

        }

        bw.write("0");
        bw.flush();
        bw.close();


//        String command = br.readLine();
//        int length = command.length();
//        int number = Integer.parseInt(command);
//
//        int start = (int) Math.pow(10, length - 1);
//        int end = (int) Math.pow(10, length);
//
//        int answer = 0;
//        for (int i = start; i < end; i++) {
//            String temp = String.valueOf(i);
//            int sum = Integer.parseInt(temp);
//            for (int j = 0; j < temp.length(); j++) {
//                sum += Integer.parseInt(String.valueOf(temp.charAt(j)));
//            }
//
//            if (sum == number) {
//                answer = i;
//                break;
//            }
//        }


    }
}
