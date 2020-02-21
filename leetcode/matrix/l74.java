class Solution {
    int mnow,nnow;
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int m = matrix.length, n = matrix[0].length;
        if(target > matrix[m - 1][n - 1] || target < matrix[0][0]) return false;
        int low = 0, high = m * n, mid = 0;
        while(low < high) {
            mid = low + (high - low) / 2;
            help(m, n, mid);
            if(matrix[mnow][nnow] < target) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        help(m, n, low);
        if(matrix[mnow][nnow] == target) return true;
        return false;
    }
    private void help(int m, int n, int mid) {
        mnow = mid / n; nnow = mid % n;
        return;
    }
}