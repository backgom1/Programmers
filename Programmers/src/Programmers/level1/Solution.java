package Programmers.level1;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] id_list = new String[]{"muzi", "frodo", "apeach", "neo"};
        String[] report = new String[]{"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
        int k =2;
        Solution solution = new Solution();
        int[] answer = solution.solution(id_list, report, k);

        for(int i =0; i<answer.length; i++){
            System.out.println(answer[i]);
        }
    }

    public int[] solution(String[] id_list, String[] report, int k) {

        report = Arrays.stream(report).distinct().toArray(String[]::new);

        Map<String, Integer> user_id = new HashMap<String, Integer>();
        Map<String, Integer> mail_id = new HashMap<String, Integer>();
        Map<String, List<String>> declaration = new HashMap<String, List<String>>();

        //0으로 초기화 하는작업
        for (String input_id : id_list) {
            user_id.put(input_id, 0);//무지
            mail_id.put(input_id, 0);
        }


        for (String input_report : report) {
            List<String> list = new ArrayList<String>();


            //신고자를 cnt
            //split[0] 신고자 split[1] 신고 당한사람
            String[] split_report = input_report.split(" ");

            Integer cnt_s = user_id.get(split_report[1]);//무지의 0번가져오는겅
            cnt_s++;
            user_id.put(split_report[1],cnt_s);

            list.add(split_report[0]);


            declaration.put(split_report[1], list);


            //메일을 보내는쪽

                if (k == user_id.get(split_report[1])) {
                    for (String split : declaration.get(split_report[1])) {
                        int num = mail_id.get(split);
                        num++;
                        mail_id.put(split_report[0],num);
                    }
                }
            }

        int[] answer = new int[id_list.length];
        List<Integer> answerList = new ArrayList<>();
        for(int i = 0 ; i<mail_id.size(); i++){
           answer[i] = mail_id.get(id_list[i]);
        }


        //반복
        //answer에 담기

        return answer;
    }
}


