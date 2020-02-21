class Solution { //重点是optimal算法的思路有点奇特
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) return false;
        int flen = matrix.length, nlen = matrix[0].length;
        if(target < matrix[0][0] || target > matrix[flen-1][nlen-1])
            return false;   //注意：这个思路是从直觉得到的，更简便的方法可以从右上角开始，不断向左向下。
        int first = 0, next = 0;  
        while(next<matrix[0].length &&matrix[first][next]<target) 
            next++;
            if(next<matrix[0].length&&matrix[first][next] == target)                return true;
            next--;
        while(first < matrix.length) {
            while(first<matrix.length&&matrix[first][next]<target)                  first++;
            if(first == matrix.length) return false;
            if(matrix[first][next] == target) return true;
            
            while(next >= 0 && matrix[first][next] > target) next--;
            if(next < 0) return false;
            if(matrix[first][next] == target) return true;
        }
        return false;
    }
}