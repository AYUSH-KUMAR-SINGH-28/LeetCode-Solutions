class Solution {
    public int singleNonDuplicate(int[] arr) {
        int n = arr.length;
        if(n==1) return arr[0];
        if(arr[0] != arr[1]) return arr[0];
        if(arr[n-1] != arr[n-2]) return arr[n-1];
        int low = 0;
        int high = n-1;
        
        while(low<=high){
            int middle = low + (high - low) / 2;
            if(arr[middle] != arr[middle-1] && arr[middle] != arr[middle+1]) return arr[middle];
            
            int middFirst = middle; 
            int middSecond = middle;
            
            if(arr[middle] == arr[middle-1]) middFirst = middle-1;
            else //(arr[middle] == arr[middle+1])
                middSecond = middle+1;
            
            int leftCount = middFirst - low;
            int rightCount = high - middSecond;
            if(leftCount%2 == 0) low = middSecond+1;
            else high = middFirst-1;
        }
        return 0;
    }
}