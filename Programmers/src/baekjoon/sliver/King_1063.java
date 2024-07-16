package baekjoon.sliver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class King_1063 {

    static Map<String, Integer> mapConvertor = new HashMap<>();
    static Map<String, int[]> moveCommand = new HashMap<>();

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] command = br.readLine().split(" ");
        int count = Integer.parseInt(command[2]);

        initialize();

        String[] kingArea = command[0].split("");
        Integer kingCol = mapConvertor.get(kingArea[0]);
        int kingRow = Integer.parseInt(kingArea[1]);

        String[] stoneArea = command[1].split("");
        Integer stoneCol = mapConvertor.get(stoneArea[0]);
        int stoneRow = Integer.parseInt(stoneArea[1]);


        for (int i = 0; i < count; i++) {
            String move = br.readLine();
            int[] moveArea = moveCommand.get(move);
            int newKingRow = kingRow + moveArea[0];
            int newKingCol = kingCol + moveArea[1];

            if (newKingRow >= 1 && newKingRow < 9 && newKingCol >= 1 && newKingCol < 9) {

                if (newKingRow == stoneRow && newKingCol == stoneCol) {
                    int newStoneRow = stoneRow + moveArea[0];
                    int newStoneCol = stoneCol + moveArea[1];
                    if (newStoneRow >= 1 && newStoneRow < 9 && newStoneCol >= 1 && newStoneCol < 9) {
                        kingRow += moveArea[0];
                        kingCol += moveArea[1];
                        stoneRow += moveArea[0];
                        stoneCol += moveArea[1];
                    }
                }else {
                    kingRow += moveArea[0];
                    kingCol += moveArea[1];
                }
            }

        }

        for (Map.Entry<String, Integer> entry : mapConvertor.entrySet()) {
            if (kingCol == entry.getValue()) {
                System.out.println(entry.getKey() + kingRow);
                break;
            }

        }

        for (Map.Entry<String, Integer> entry : mapConvertor.entrySet()) {
            if (stoneCol == entry.getValue()) {
                System.out.print(entry.getKey() + stoneRow);
                break;
            }
        }
    }


    private static void initialize() {
        mapConvertor.put("A", 1);
        mapConvertor.put("B", 2);
        mapConvertor.put("C", 3);
        mapConvertor.put("D", 4);
        mapConvertor.put("E", 5);
        mapConvertor.put("F", 6);
        mapConvertor.put("G", 7);
        mapConvertor.put("H", 8);

        moveCommand.put("R", new int[]{0, 1});
        moveCommand.put("L", new int[]{0, -1});
        moveCommand.put("B", new int[]{-1, 0});
        moveCommand.put("T", new int[]{1, 0});
        moveCommand.put("RT", new int[]{1, 1});
        moveCommand.put("LT", new int[]{1, -1});
        moveCommand.put("RB", new int[]{-1, 1});
        moveCommand.put("LB", new int[]{-1, -1});

    }

}
