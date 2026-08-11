class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low = 1, high = arr.length-2; // isse index out of bound error v ahi aaye ga or last or first index kabhi v peak ho nahi sakte 
        while(low<=high){
            int middle = low+(high - low)/2;
            if(arr[middle] > arr[middle+1] && arr[middle] > arr[middle-1]){
                return middle;
            }
            else if(arr[middle] > arr[middle - 1] && arr[middle] < arr[middle + 1]){
                low = middle+1;
            }
            else { // (arr[middle] < arr[middle - 1] && arr[middle] > arr[middle + 1])
                high = middle-1;
            }
        }
        return 0;
    }
}