class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) return false;
        int row = matrix.length;
        int col = matrix[0].length;
        for (int i = 0; i < row - 1; i++) {
            int j = 0;
            while (j < col - 1) {
                if (matrix[i][j] != matrix[i+1][j+1]) return false;
                j++;
            }
        }
        for (int j = 0; j < col - 1; j++) {
            int i = 0;
            while (i < row - 1) {
                if (matrix[i][j] != matrix[i+1][j+1]) return false;
                i++;
            }
        }
        return true;
    }
}
