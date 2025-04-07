public class SumOfKSubArrays {
    int sumOfKSubArrays(int[]arr, int k) {
        int low = 0, high = 0, sum = 0;
        //{2,4,9,-10,5,1,2,0,19,-6}
        while (high < arr.length) {
            if (high - low + 1 < k) {
                sum += arr[high];
                high++;
            } else {
                sum += arr[high];
                System.out.println(sum);
                sum -= arr[low];
                low++;
                high++;
            }
        }
        return sum;
    }
}
