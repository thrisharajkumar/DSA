package Recursion.Assignment;

//GEEKSFOR GEEKS 
//tOWER OF HANOI
public class Toh {
    public static int toh(int N, int from, int to, int aux) {
        long steps = 0;
        if (N == 0) {
            return (int) steps; // Return the value of steps
        }

        steps += toh(N - 1, from, aux, to); // Accumulate steps from recursive call

        System.out.println("move disk " + N + " from rod " + from + " to rod " + to);
        steps++; // Increment the step count for the current move

        steps += toh(N - 1, aux, to, from); // Accumulate steps from recursive call

        return (int) steps; // Return the accumulated steps
    }

    public static void main(String[] args) {
        int result = toh(3, 1, 2, 3);
        System.out.println(result);
    }
}
