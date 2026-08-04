class Solution {
    public boolean searchMatrix(int[][] arr, int target) {
        int m  = arr.length; 
        int n = arr[0].length;  

        int i = 0;
        int j = n-1;
        
        while(i<m && j>=0){ // TC - O(m+n)
            if(arr[i][j] > target){
                j--;
            }
            else if(arr[i][j] < target){
                i++;
            }
            else{
                return true;
            }
        }
        return false;






/*        //TC = O(n*m)
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == target){
                    return true;
                }
            }
        }
        return false;                   */
    }
}