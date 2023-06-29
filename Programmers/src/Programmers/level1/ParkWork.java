package Programmers.level1;

public class ParkWork {
    public int[] solution(String[] park, String[] routes) {
        String[][] park_map = new String[park.length][park[0].length()];
        int x = 0;
        int y = 0;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                park_map[i][j] = String.valueOf(park[i].charAt(j));
            }
        }

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park_map[i][j].equals("S")) {
                    x = j;
                    y = i;
                }
            }
        }

        for (String s : routes) {
            String way = s.split(" ")[0];
            int len = Integer.parseInt(s.split(" ")[1]);
            int nx = x;
            int ny = y;

            for (int i = 0; i < len; i++) {
                if (way.equals("E")) {
                    nx++;
                }
                if (way.equals("W")) {
                    nx--;
                }
                if (way.equals("S")) {
                    ny++;
                }
                if (way.equals("N")) {
                    ny--;
                }
                if (nx >= 0 && ny >= 0 && ny < park_map.length && nx < park_map[0].length) {
                    if (park_map[ny][nx].equals("X")) {
                        break;
                    }

                    if (i == len - 1) {
                        x = nx;
                        y = ny;
                    }
                }
            }

        }
        int[] answer = {y,x};
        return answer;
    }
}
