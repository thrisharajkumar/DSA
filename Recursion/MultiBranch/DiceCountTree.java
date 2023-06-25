package Recursion.MultiBranch;

public class DiceCountTree {
    static void diceGame(int current, int end, String output) {
        // Positive Base Case
        if (current == end) {
            System.out.println(output);
            return;
        }
        // Negative Base Case
        if (current > end) {
            return;
        }

        for (int dice = 1; dice <= 6; dice++) {
            diceGame(current + 1, end, output + 1);
        }

    }

    public static void main(String[] args) {
        diceGame(0, 10, "");

    }
}
