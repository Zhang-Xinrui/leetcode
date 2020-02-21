class Solution {
    public void solve(char[][] board) {
        if(board.length <= 1 || board[0].length <= 1) return;
        int len1 = board.length, len2 = board[0].length;
        for(int i = 0; i < len1; i++) {//board[i][0] board[i][len2-1]
            help(board, i, 0); help(board, i, len2 - 1);
        }
        for(int i = 1; i < len2 - 1; i++) {
            help(board, 0, i); help(board, len1 - 1, i);
        }
        for(int i = 0; i < len1; i++)
            for(int j = 0; j < len2; j++)
                if(board[i][j] == 'o') board[i][j] = 'O';
                else if(board[i][j] == 'O') board[i][j] = 'X';
        return;
    }
    private void help(char[][] board, int index1, int index2) {
        if(index1 < 0 || index2 < 0 || index1 >= board.length || index2 >= board[0].length || board[index1][index2] != 'O') return;
        board[index1][index2] = 'o';
        help(board, index1 + 1, index2);
        help(board, index1 - 1, index2);
        help(board, index1, index2 + 1);
        help(board, index1, index2 - 1);
    }
}