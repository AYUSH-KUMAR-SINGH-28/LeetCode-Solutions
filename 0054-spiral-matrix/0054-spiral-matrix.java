class Solution {
    public List<Integer> spiralOrder(int[][] arr) {
 List<Integer> ans = new ArrayList<>();
        int m = arr.length; // Number of Rows
        int n = arr[0].length; // Number of Column
        int firstRow = 0;
        int firstColumn = 0;
        int lastRow = m-1;
        int lastColumn = n-1;
        int totalNumberOfElement = m*n;

        while(ans.size()<totalNumberOfElement){

            // Right
            for(int j=firstColumn; j<=lastColumn; j++){
                ans.add(arr[firstRow][j]);
            }
            firstRow++;

            if(ans.size() == totalNumberOfElement) break;

            //Down
             for(int i=firstRow; i<=lastRow; i++){
                ans.add(arr[i][lastColumn]);
            }
            lastColumn--;

            if(ans.size() == totalNumberOfElement) break;

            // Left
              for(int j=lastColumn; j>=firstColumn; j--){
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            
            if(ans.size() == totalNumberOfElement) break;

            // Up
              for(int i=lastRow; i>=firstRow; i--){
                ans.add(arr[i][firstColumn]);
            }
            firstColumn++;
        }
        return ans;



/*        List<Integer> ans = new ArrayList<>();
        int m = arr.length; // Number of Rows
        int n = arr[0].length; // Number of Column
        int firstRow = 0;
        int firstColumn = 0;
        int lastRow = m-1;
        int lastColumn = n-1;

        while(firstRow <= lastRow && firstColumn <= lastColumn){

            // Right
            for(int j=firstColumn; j<=lastColumn; j++){
                ans.add(arr[firstRow][j]);
            }
            firstRow++;
            if(firstRow > lastRow || firstColumn > lastColumn) break;

            //Down
             for(int i=firstRow; i<=lastRow; i++){
                ans.add(arr[i][lastColumn]);
            }
            lastColumn--;
            if(firstRow > lastRow || firstColumn > lastColumn) break;

            // Left
              for(int j=lastColumn; j>=firstColumn; j--){
                ans.add(arr[lastRow][j]);
            }
            lastRow--;
            if(firstRow > lastRow || firstColumn > lastColumn) break;

            // Up
              for(int i=lastRow; i>=firstRow; i--){
                ans.add(arr[i][firstColumn]);
            }
            firstColumn++;
        }
        return ans;    */
    }
}