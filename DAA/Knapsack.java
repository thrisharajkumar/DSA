package DAA_Sorting;

public class Knapsack {

    static int knapsack(int[] weights, int[] values, int max, int index) {

        // base case
        if (index == weights.length || max == 0) {
            return 0;
        }
        // if current item weight is greater than remianing capacity of bag then
        if (weights[index] > max) {
            return knapsack(weights, values, max, index + 1);
        } else {
            // the current item is having less than max weight
            int option_1 = values[index] + knapsack(weights, values, max - weights[index], index + 1);
            // do nod include this item
            int option_2 = knapsack(weights, values, max, index + 1);
            return Math.max(option_1, option_2);
        }
    }

    public static void main(String[] args) {
        int weights[] = { 10, 20, 30 };
        int values[] = { 60, 100, 120 };
        int max = 50;
        int n = values.length;
        int result = knapsack(weights, values, max, 0);
        System.out.println(result);

    }
}
