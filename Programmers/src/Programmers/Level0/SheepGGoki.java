package Programmers.Level0;

public class SheepGGoki {

    public int solution(int n, int k) {
        int drinkDiscount = n/10;

        if(k>0){
            k = k-drinkDiscount;
        }

        return (n*12000) + (k*2000);
    }
}
