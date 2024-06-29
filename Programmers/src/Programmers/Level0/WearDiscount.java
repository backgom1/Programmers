package Programmers.Level0;


/**
 * 10~30만원미만 5% , 30~50만원미만 10% , 50민원이상 20%
 * 구간을 나눠서 할인율을 넣어주면 될꺼같다.
 */
public class WearDiscount {

    public static void main(String[] args) {
        int price = 580000;
        WearDiscount wearDiscount = new WearDiscount();
        int solution = wearDiscount.solution(price);
        System.out.println(solution);
    }

    public int solution(int price) {

        if (price >= 100000 && price < 300000) {
            return (int) (price * 0.95);
        }

        if (price >= 300000 && price < 500000) {
            return (int) (price * 0.9);
        }

        if (price >= 500000) {
            return (int) (price * 0.8);
        }

        return price;
    }
}
