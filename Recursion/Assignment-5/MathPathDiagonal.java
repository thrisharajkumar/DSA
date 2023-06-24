package Recursion.Branches;

import java.util.ArrayList;

public class MazePathDiagonal {

    // Step 1: Define function and its arguments

    static ArrayList<String> getMaze(int currentRow, int currentCol, int endRow, int endCol, int remainingMoves) {

        // Positive Base Case:
        // If you reach the end of the grid and have used exactly 3 moves

        if (currentRow == endRow && currentCol == endCol && remainingMoves == 0) {
            ArrayList<String> temp = new ArrayList<>();
            temp.add("");
            return temp;
        }

        // Negative Base Case
        if (currentRow > endRow || currentCol > endCol || remainingMoves <= 0) {
            return new ArrayList<>(); // return an empty list
        }

        ArrayList<String> result = new ArrayList<>();

        // Move one step Diagonal
        // currentCol + 1 & currentRow + 1

        ArrayList<String> diagonalResult = getMaze(currentRow + 1, currentCol + 1, endRow, endCol, remainingMoves - 1);
        for (String temp : diagonalResult) {
            result.add("D" + temp);
        }

        // Move one step Vertical
        // currentRow + 1

        ArrayList<String> verticalResult = getMaze(currentRow + 1, currentCol, endRow, endCol, remainingMoves - 1);
        for (String temp : verticalResult) {
            result.add("V" + temp);
        }

        // Move one step Horizontal
        // currentCol + 1

        ArrayList<String> horizontalResult = getMaze(currentRow, currentCol + 1, endRow, endCol, remainingMoves - 1);
        for (String temp : horizontalResult) {
            result.add("H" + temp);
        }

        return result;
    }

    public static void main(String[] args) {
        ArrayList<String> res = getMaze(0, 0, 2, 2, 3);
        System.out.println(res);
    }
}
