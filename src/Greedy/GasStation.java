package Greedy;

public class GasStation {
    /**
     * iterate -
     * @param gas
     * @param cost
     * @return
     */
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int size = gas.length;
        int itr;
        int gasFilled = 0;

        for (int i =0; i < gas.length; i++) {
            if (cost[i] >= gas[i]) {
                continue;
            }
            int count = 0;
            itr = i;
            gasFilled = gas[itr];
            itr++;
            while (count < size) {
                gasFilled = gasFilled + gas[itr] - cost[itr];
                if (gasFilled <=0 ){
                    break;
                }
                itr++;
                count++;
                if (itr >= size) {
                    itr = itr%size;
                }
            }
            if(count == size) {
                return i;
            }
        }
        return -1;
    }
}
