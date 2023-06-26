package Programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class RunRank {
    public static void main(String[] args) {
        String[] players = new String[]{"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = new String[]{"kai", "kai", "mine", "mine"};
        RunRank solution = new RunRank();
        solution.solution(players, callings);
    }

    public String[] solution(String[] players, String[] callings) {
        //선수 등수
        Map<Integer, String> players_rank = new HashMap<>();
        //선수 이름 숫자
        Map<String, Integer> playerList = new HashMap<>();
        for(int i = 0; i<players.length; i++){
            players_rank.put(i,players[i]);
            playerList.put(players[i],i);
        }


        for (int i = 0 ; i<callings.length; i++){
            if(playerList.containsKey(callings[i])){
                String beforeName =  players_rank.get(playerList.get(callings[i])-1);
                int beforeRank =  playerList.get(beforeName);
                players_rank.put(playerList.get(callings[i])-1,callings[i]);
                players_rank.put(playerList.get(callings[i]),beforeName);
                playerList.put(beforeName,beforeRank+1);
                playerList.put(callings[i],beforeRank);
            }
        }
        String[] answer = new String[players_rank.size()];
        for(int i = 0; i<players_rank.size(); i++){
            answer[i] = players_rank.get(i);
        }
        return answer;
    }
}
