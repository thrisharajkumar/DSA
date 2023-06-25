package Recursion.MultiBranch;

public class MazePathTree {
    static void printMaze(int currentRow, int endRow, int currentCol, int endCol, String output) {
        // Positive BC
        if (currentRow == endRow && currentCol == endCol) {
            System.out.println(output);
            return;
        }

        // Negatie BC
        if (currentRow > endRow || currentCol > endCol) {
            return;
        }

        // Horizontal
        printMaze(currentRow + 1, endRow, currentCol, endCol, output + "V");
        printMaze(currentRow, endRow, currentCol + 1, endCol, output + "H");
    }

    public static void main(String[] args) {
        printMaze(0, 2, 0, 2, "");
    }
}
