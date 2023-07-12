public class GasStation {
    /*
     * Input: gas = [1,2,3,4,5], cost = [3,4,5,1,2]
     * Output: 3
     * Explanation:
     * Start at station 3 (index 3) and fill up with 4 unit of gas. Your tank = 0 +
     * 4 = 4
     * Travel to station 4. Your tank = 4 - 1 + 5 = 8
     * Travel to station 0. Your tank = 8 - 2 + 1 = 7
     * Travel to station 1. Your tank = 7 - 3 + 2 = 6
     * Travel to station 2. Your tank = 6 - 4 + 3 = 5
     * Travel to station 3. The cost is 5. Your gas is just enough to travel back to
     * station 3.
     * Therefore, return 3 as the starting index.
     */
    static int checkJourney(int gas[], int cost[]) {
        int startingPoint = 0;
        int loss = 0;
        int remainingGas = 0;
        for (int i = 0; i < gas.length; i++) {
            remainingGas += gas[i] - cost[i];
            if (remainingGas < 0) {
                startingPoint = i + 1;
                loss += remainingGas;
                remainingGas = 0;
            }
        }
        return loss + remainingGas >= 0 ? startingPoint : -1;

    }

    public static void main(String[] args) {
        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };
        System.out.println(checkJourney(gas, cost));
    }
}
