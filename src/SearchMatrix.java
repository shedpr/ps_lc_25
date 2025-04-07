public class SearchMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0)
            return false;
        int n = matrix[0].length;

        int low = 0, high = m*n-1;
        while (low <= high) {
            int mid = low + high / 2;
            int midVal = matrix[mid/n][mid%n];
            if(midVal == target) {
                return true;
            } else if (midVal < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return false;
    }
}
