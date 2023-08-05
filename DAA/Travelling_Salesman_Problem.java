package DAA_Sorting;

public class Travelling_Salesman_Problem {

    // Function to find the minimum cost Hamiltonian cycle using recursive approach
    // (DFS)
    static int tsp(int dist[][], boolean visited[], int n, int currentPos, int cost, int count, int result) {
        // Base case: If all cities are visited and we can return to the starting city
        if (count == n && dist[currentPos][0] > 0) {
            // Update the result with the minimum cost found so far
            result = Math.min(result, cost + dist[currentPos][0]);
            return result;
        }

        // Traverse all unvisited cities from the current city using DFS
        for (int i = 0; i < n; i++) {
            if (visited[i] == false && dist[currentPos][i] > 0) {
                // Mark the next city as visited and explore it
                visited[i] = true;
                // Recur for the next city and update the result
                result = tsp(dist, visited, n, i, cost + dist[currentPos][i], count + 1, result);
                // Backtrack: Mark the next city as unvisited again before trying other options
                visited[i] = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        int dist[][] = {
                { 0, 20, 25, 30 },
                { 20, 0, 45, 35 },
                { 25, 45, 0, 40 },
                { 30, 35, 40, 0 }
        };
        int cost = 0; // The initial cost is 0
        int count = 1; // We have already visited the starting city
        int result = Integer.MAX_VALUE; // Initialize the result with the maximum value
        boolean visited[] = new boolean[n];
        visited[0] = true; // Mark the starting city as visited

        // Call the tsp function to find the minimum cost of the Hamiltonian cycle
        int ans = tsp(dist, visited, n, 0, cost, count, result);
        System.out.println(ans);
    }
}
