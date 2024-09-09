//converting 1D to 2D array of size m*n
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
                int[][] matrix=new int[m][n];
         
                if(m*n!=original.length)
                     return new int[0][0];
      for(int i=0;i<original.length;i++){
          int row=i/n;
          int column=i%n;
          matrix[row][column]=original[i];
      }
      return matrix;
    }
}
