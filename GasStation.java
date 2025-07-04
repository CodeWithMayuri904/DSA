class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {

        int totalCost = 0;
        int totalGas = 0;
        int start = 0;
        int tank = 0;
        int n = gas.length;

        for(int i=0; i<n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];

            tank += gas[i] - cost[i];
            if(tank<0) {
                start = i+1;
                tank = 0;
            }
        }
        // return (totalGas < totalCost) ? -1 : start;
        if (totalGas < totalCost) {
            return -1;
        } else {
            return start;
        }

    }
}
