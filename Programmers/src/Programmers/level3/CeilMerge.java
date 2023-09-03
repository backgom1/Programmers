package Programmers.level3;

import java.util.ArrayList;
import java.util.List;

/*
   위 r , 왼쪽 c (r,c)
   1. "UPDATE r c value" -> value값으로 변경
   2. "UPDATE value1 value2" -> value1의 값을 value2로 전체 변경
   3. "MERGE r1 c1 r2 c2"-> r1, c1) 위치의 셀과 (r2, c2) 위치의 셀을 선택하여 병합합니다.
     같은 셀 일경우 무시 만약에 둘다 값을 가지고 있을 경우 (r1,c1)위치이 셀값을 가지게 됨
   4. "UNMERGE r c" -> (r, c) 위치의 셀을 선택하여 해당 셀의 모든 병합을 해제합니다.
      병합을 해제하기 전 셀이 값을 가지고 있었을 경우 (r, c) 위치의 셀이 그 값을 가지게 됩니다.
   5. "PRINT r c" -> 해당 위치 출력 없으면 empty

   1. r,c 값에 대한 값을 입력해주면된다. update(r,c,value)
   2. value의 값을 찾아서 만약에 같다면 value2의 값으로 변경해주면된다. update(value1, value2)
   3. marge(x1,y1,x2,y2) Map에 key(x1,y1) value(List<Integer>)로 관리하여 값을 넣어 주면될꺼같다.
    3-1. 만약에 병렬된것에서 병렬을 진행할경우 해당 위치의 좌표에 대한 값을 가져오고 list를 합쳐준다음 r1,c1에 값으로 넣어준다.
   4. 해당 위치의 r,c 값을 넣어주고 r,c의 포함되어있는 map 지워준다.UNMERGE (x1,y1)
   5. 이건 출력 값이 ""면 empty로 변환

 */
public class CeilMerge {
    static Cell[][] cells = new Cell[50][50];


    public static void main(String[] args) {
        String[] commands = new String[]{"UPDATE 1 1 menu", "UPDATE 1 2 category", "UPDATE 2 1 bibimbap", "UPDATE 2 2 korean",
                "UPDATE 2 3 rice", "UPDATE 3 1 ramyeon", "UPDATE 3 2 korean", "UPDATE 3 3 noodle", "UPDATE 3 4 instant", "UPDATE 4 1 pasta",
                "UPDATE 4 2 italian", "UPDATE 4 3 noodle", "MERGE 1 2 1 3", "MERGE 1 3 1 4", "UPDATE korean hansik",
                "UPDATE 1 3 group", "UNMERGE 1 4", "PRINT 1 3", "PRINT 1 4"};

        CeilMerge ceilMerge = new CeilMerge();
        String[] solution = ceilMerge.solution(commands);
        for (String sol : solution) {
            System.out.println(sol);
        }
    }

    public String[] solution(String[] commands) {
        List<String> answer = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                cells[i][j] = new Cell();
            }
        }
        for (String command : commands) {
            String[] splitCommand = command.split(" ");
            switch (splitCommand[0]) {
                case "UPDATE":
                    update(command);
                    break;
                case "MERGE":
                    merge(command);
                    break;
                case "UNMERGE":
                    unMerge(command);
                    break;
                case "PRINT":
                    String print = print(Integer.parseInt(splitCommand[1]) - 1, Integer.parseInt(splitCommand[2]) - 1);
                    answer.add(print);
                    break;
            }
        }
        return answer.toArray(new String[0]);
    }


    public void update(String command) {
        String[] updateCommand = command.split(" ");


        //사이즈가 4일 경우 -> 값을 삽입해주는 과정
        if (updateCommand.length > 3) {
            int r = Integer.parseInt(updateCommand[1]) - 1;
            int c = Integer.parseInt(updateCommand[2]) - 1;
            String value = updateCommand[3];
            cells[r][c].setValue(value);
        } else {
            String updateTargetStr = updateCommand[1];
            String targetStr = updateCommand[2];
            for (int i = 0; i < 50; i++) {
                for (int j = 0; j < 50; j++) {
                    if (!cells[i][j].getValue().isEmpty() && cells[i][j].getValue().equals(updateTargetStr)) {
                        cells[i][j].setValue(targetStr);
                    }
                }
            }
        }
    }

    //"MERGE 1 2 1 3"
    public void merge(String command) {
        String[] mergeCommand = command.split(" ");
        List<Cell> cell = new ArrayList<>();
        List<Cell> cell2 = new ArrayList<>();
        int r1 = Integer.parseInt(mergeCommand[1])-1;
        int c1 = Integer.parseInt(mergeCommand[2])-1;

        int r2 = Integer.parseInt(mergeCommand[3])-1;
        int c2 = Integer.parseInt(mergeCommand[4])-1;

        //r1c1이 없을경우
        if (cells[r1][c1].getValue().isEmpty() && !cells[r2][c2].getValue().isEmpty()) {
            cells[r1][c1].setValue(cells[r2][c2].getValue());
            cell.add(cells[r1][c1]);
            cell2.add(cells[r2][c2]);
            cells[r1][c1].setAdjacent(cell2);
            cells[r2][c2].setAdjacent(cell);

            //r2c2가 없을경우
        } else if (!cells[r1][c1].getValue().isEmpty() && cells[r2][c2].getValue().isEmpty()) {
            cells[r2][c2].setValue(cells[r1][c1].getValue());
            cell.add(cells[r1][c1]);
            cell2.add(cells[r2][c2]);
            cells[r1][c1].setAdjacent(cell2);
            cells[r2][c2].setAdjacent(cell);

            //둘다 있을 경우
        } else if (!cells[r1][c1].getValue().isEmpty() && !cells[r2][c2].getValue().isEmpty()) {
            cells[r2][c2].setValue(cells[r1][c1].getValue());
            cell.add(cells[r1][c1]);
            cell2.add(cells[r2][c2]);
            cells[r1][c1].setAdjacent(cell2);
            cells[r2][c2].setAdjacent(cell);


        }


    }

    //UNMERGE 1 4
    public void unMerge(String command) {
        String[] unMergeCommand = command.split(" ");
        int unMergeR = Integer.parseInt(unMergeCommand[1]);
        int unMergeC = Integer.parseInt(unMergeCommand[2]);

        List<Cell> adjacent = cells[unMergeR][unMergeC].getAdjacent();
        for (Cell cell : adjacent) {
            List<Cell> sonAdjacent = cell.getAdjacent();
            sonAdjacent.clear();
        }
    }

    public String print(int r, int c) {
        if (!cells[r][c].getValue().isEmpty()) {
            return cells[r][c].getValue();
        } else {
            return "EMPTY";
        }
    }


    static class Cell {
        String value ="";
        List<Cell> adjacent = new ArrayList<>();


        public Cell() {
        }


        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<Cell> getAdjacent() {
            return adjacent;
        }

        public void setAdjacent(List<Cell> adjacent) {
            this.adjacent = adjacent;
        }
    }
}
