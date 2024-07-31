public class SearchInMetrix {
    public static void main(String[] args) {

    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int n = matrix.length;
        int m = matrix[0].length;

        int s = 0;
        int e = (n * m) - 1;

        while (s <= e) {
            int mid = (s + e) / 2;
            int row = mid / m;
            int col = mid % m;

            if (matrix[row][col] == target)
                return true;
            else if (matrix[row][col] < target)
                s = mid + 1;
            else
                e = mid - 1;
        }
        return false;
    }
}
