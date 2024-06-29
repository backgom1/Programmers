package Programmers.level1;


/**
 * 빵-야채-고기-빵 으로 쌓인 햄버거만 포장
 * 빵-야채-고기-빵-야채-고기-빵 이런식으로 연속으로 재료를 쌓을수있다.
 * 배열을 돌면서 1부터 시작을 하면 count를 쌓는다. 그이후 2가 들어오면 count 다른게 들어온다면 0으로 반환 그런식으로 차례대로 4가 채워지면 answer++를해준다.
 * 만약에 다음 1다음 2가 된다면 ++이 아닌 +2로 시작한다. 만약 count가 4이고, 2가 시작되었을때에 대해 2로 시작을 진행하고 그러다 깨지면 0 그런식으로 쌓아나가면될꺼같다.
 * 순서를 판단하는 기능
 */
public class MakeHamburger {


    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1};
        MakeHamburger makeHamburger = new MakeHamburger();
        System.out.println(makeHamburger.solution(ingredient));
    }

    public int solution(int[] ingredient) {
        int answer = 0;
        String pattern2 = "1231";
        StringBuilder fullIngredient = new StringBuilder();

        for (int j : ingredient) {
            fullIngredient.append(j);
        }

       int  index = 0;
        while ((index = fullIngredient.indexOf(pattern2, index)) != -1) {
            fullIngredient.delete(index, index + pattern2.length());
            answer++;
            index = Math.max(0, index - pattern2.length()); // 패턴이 삭제된 부분 이전으로 이동하여 중복된 패턴 체크
        }

        return answer;
    }
}
