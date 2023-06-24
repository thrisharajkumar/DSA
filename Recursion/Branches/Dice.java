package Recursion.Branches;

import java.util.ArrayList;

public class Dice {
    // ["22222"], ["3331"], ["55"],["442"], ["64"]
    static ArrayList<String> game(int currentValue, int target) {

        // Base case
        // Add the current value when it reaches the target
        if (currentValue == target) {
            ArrayList<String> list = new ArrayList<>();
            // There is a empty double quotes for

            list.add("");
            return list;
        }

        // negative base case
        // return the empty list when the currentvalue
        // is greater than target
        if (currentValue > target) {
            ArrayList<String> list = new ArrayList<>();
            return list;
        }

        // using for loop to roll the dice 6 times
        ArrayList<String> result = new ArrayList<>();

        for (int dice = 1; dice <= 6; dice++) {

            // Stores in newValue the currentValue + no on the dice
            // calls itself with the newvalue as currentvalue, target
            int newValue = currentValue + dice;
            ArrayList<String> temp = game(newValue, target);
            for (String s : temp) {
                result.add(dice + s);
            }
        }
        return result;

    }

    public static void main(String[] args) {
        ArrayList<String> res = game(0, 10);
        System.out.println(res);
        System.out.println(res.size());

    }

}

/*
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 1
 * 2 3 4 5 6 >10 target therefor
 * negative base case will be used
 * every case falls back and checks
 * for each iteration.
 * 
 * 
 */
