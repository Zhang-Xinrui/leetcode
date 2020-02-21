class Solution {
    public void rotate(int[][] matrix) {
        help(matrix, 0);
        return;
    }
    private void help(int[][] matrix, int index) {
        if(index == matrix.length / 2) return;
        int aindex = matrix.length - 1 - index;
        for(int i = index; i < matrix.length - 1 - index; i++){
            int anotheri = matrix.length - 1 - i, temp = matrix[index][i];
            matrix[index][i] = matrix[anotheri][index];
            matrix[anotheri][index] = matrix[aindex][anotheri];
            matrix[aindex][anotheri] = matrix[i][aindex];
            matrix[i][aindex] = temp;
        }
        help(matrix, index + 1);
    }
}