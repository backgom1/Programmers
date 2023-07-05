package Programmers.level1;

public class SecretMap {
    public static void main(String[] args) {
        int n = 6;
        int[] arr1 = new int[]{46, 33, 33, 22, 31, 50};
        int[] arr2 = new int[]{27, 56, 19, 14, 14, 10};
        SecretMap secretMap = new SecretMap();
        String[] solution = secretMap.solution(n, arr1, arr2);
        for (String s : solution) {
            System.out.println("s = " + s);
        }
    }

    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            String arr1_binary = Integer.toBinaryString(arr1[i]);
            String arr2_binary = Integer.toBinaryString(arr2[i]);

            if (arr1_binary.length() != n) {
                arr1_binary = "0".repeat(n - arr1_binary.length()) + arr1_binary;
            }
            if (arr2_binary.length() != n) {
                arr2_binary = "0".repeat(n - arr2_binary.length()) + arr2_binary;
            }


            String sumArrStr = addBinaryStrings(arr1_binary, arr2_binary);
            System.out.println("sumArrStr = " + sumArrStr);
            sumArrStr =  sumArrStr.replace("2", "1");

            sumArrStr = sumArrStr.replace("1","#");
            sumArrStr = sumArrStr.replace("0"," ");
            answer[i] = sumArrStr;
        }


        return answer;
    }

    public static String addBinaryStrings(String str1, String str2) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i <str1.length(); i++) {
            int sumInt = Integer.parseInt(String.valueOf(str1.charAt(i))) + Integer.parseInt(String.valueOf(str2.charAt(i)));
            result.append(sumInt);
        }
        return result.toString();
    }


}
