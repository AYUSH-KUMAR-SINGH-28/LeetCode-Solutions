class Solution {
    public int[] searchRange(int[] nums, int target) {

        // First Occurrence 
        int low = 0;
        int high = nums.length-1;
        int firstIndex = -1;
        while(low <= high){
            int middle = low + (high-low)/2; //Isse integer overflow ka risk nahi hota.
            if(nums[middle] > target){
                high = middle-1;
            }
            else if(nums[middle] < target){
                low = middle+1;
            }
            else{ //Middle == Target
                firstIndex = middle;
                high = middle-1;
            }
        }
    

         // Last Occurrence 
        low = 0;
        high = nums.length-1;
        int lastIndex = -1;
        while(low <= high){
            int middle = low + (high-low)/2; //Isse integer overflow ka risk nahi hota.
            if(nums[middle] > target){
                high = middle-1;
            }
            else if(nums[middle] < target){
                low = middle+1;
            }
            else{ //Middle == Target
                lastIndex = middle;
                low = middle+1;
            }
        }
        
        return new int[]{firstIndex , lastIndex};
    }
}