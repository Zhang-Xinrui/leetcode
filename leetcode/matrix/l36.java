class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int k = 0; k < 3; k++) //暴力求解
        for(int i = 0; i < 9; i++) {
            boolean[] count = new boolean[10];
            for(int j = 0; j < 9; j++) {
                if(k == 0) {
                    if(board[i][j] >= '0' && board[i][j] <= '9') {
                     if(count[board[i][j]-'0'])return false;
                        count[board[i][j] - '0'] = true;
                    }
                } else if(k == 1) {
                    if(board[j][i] >= '0' && board[j][i] <= '9') {
                     if(count[board[j][i]-'0'])return false;
                        count[board[j][i] - '0'] = true;
                    }
                } else {
                    int index1 = 3 * (i/3)+j/3, index2=3*(i%3)+j%3;
                    if(board[index1][index2]>='0'&&board[index1][index2]<='9') {
                        if(count[board[index1][index2]-'0'])return false;
                        count[board[index1][index2]-'0'] = true;
                    }
                }
            }
        }
        return true;
    }
}