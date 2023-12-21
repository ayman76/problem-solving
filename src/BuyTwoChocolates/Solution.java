package BuyTwoChocolates;

import java.util.Arrays;

public class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);

        int currentMoney = money;
        for(int i = 0; i < 2; i++){
            if(currentMoney - prices[i] < 0){
                return money;
            }
            else{
                currentMoney -= prices[i];
            }
        }

        return currentMoney;
    }
}
