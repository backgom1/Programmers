package baekjoon;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Switch_OnOff_1244 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cnt = sc.nextInt();
        int[] switch_num = new int[cnt+1];

        for (int i = 1; i <= cnt; i++) {
            switch_num[i] = sc.nextInt();
        }

        int human_cnt = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < human_cnt; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine());
            String human_list = st.nextToken();
            int switch_locale = Integer.parseInt(st.nextToken());
            if (human_list.equals("1")) {
                for (int j = switch_locale; j <= cnt; j += switch_locale) {
                    switch_num[j] = onOffSwitch(switch_num[j]);
                }
            } else if (human_list.equals("2")) {
                switch_num[switch_locale] = onOffSwitch(switch_num[switch_locale]);
                int left = switch_locale - 1;
                int right = switch_locale + 1;
                while (left >= 1 && right <= cnt && switch_num[left] == switch_num[right]) {
                    switch_num[left] = onOffSwitch(switch_num[left]);
                    switch_num[right] = onOffSwitch(switch_num[right]);
                    left--;
                    right++;
                }
            }
        }

        for (int i = 1; i <= cnt; i++) {
            System.out.print(switch_num[i]);
            if(i % 20 == 0) {
                System.out.println();
            }
        }
    }

    public static int onOffSwitch(int onOff) {
        if(onOff == 1){
            onOff = 0;
        }else {
            onOff = 1;
        }
        return onOff;
    }
}
