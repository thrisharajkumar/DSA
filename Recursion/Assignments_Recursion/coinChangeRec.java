package Recursion.Assignment;

import java.util.ArrayList;

public class coinChangeRec {

    static ArrayList<String> coinChange(int cost[], int amount, int index) {
        if (amount == 0) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }
        ArrayList<String> result = new ArrayList<>();
        for (int i = index; i < cost.length; i++) {
            if (amount >= cost[i]) {
                coinChange(cost, amount - cost[i], i);
            }
            for (String temp : result) {
                result.add("" + temp);
            }

        }
        return result;
    }

    public static void main(String[] args) {
        int[] coins = { 2, 3, 5, 6 };
        ArrayList<String> result = coinChange(coins, 10, 0);
        System.out.println(result);
    }
}
