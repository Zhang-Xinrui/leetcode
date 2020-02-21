class Solution {
    public int numIslands(char[][] grid) {
        if(grid.length == 0 || grid[0].length == 0) return 0;
        int count = 0, len1 = grid.length, len2 = grid[0].length;
        for(int i = 0; i < len1; i++) {
            for(int j = 0; j < len2; j++) {
                if(grid[i][j] == '1') {
                    count++;
                    help(grid, i, j);
                }
            }
        }
        return count;
    }
    private void help(char[][] grid, int i, int j) {
        //使用回溯法BFS？？
        if(i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == '0')
            return;
        grid[i][j] = '0';
        help(grid, i, j + 1);
        help(grid, i, j - 1);
        help(grid, i + 1, j);
        help(grid, i - 1, j);
    }
}