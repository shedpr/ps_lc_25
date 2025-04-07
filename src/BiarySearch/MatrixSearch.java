package BiarySearch;

public class MatrixSearch {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0;
        int row = matrix.length;
        int col = matrix[0].length;

        if (row == 0)
            return false;

        int high = row * col - 1;

        while (low <= high) {
            int mid = (low + high)/2;
            int val = matrix[mid / col][mid%col];
            if (val == target)
                return true;
            else if (val < target)
                low = mid + 1;
            else
                high = mid - 1;
        }

        return false;
    }
}
