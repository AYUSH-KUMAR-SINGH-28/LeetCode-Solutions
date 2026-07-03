class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        // Reverse the Whole array
        reverse(nums, 0, n-1);

        // Reverse the first Kth term 
        reverse(nums, 0, k-1);

        // Reverse the after k array
        reverse(nums, k, n-1);
    }

    private void reverse(int[]nums , int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start]=nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}

/*Complexity

Time Complexity: O(n)

Reverse whole array → O(n)
Reverse first k elements → O(k)
Reverse remaining n-k elements → O(n-k)

Total:

O(n) + O(k) + O(n-k) = O(2n) = O(n)
Space Complexity: O(1)
Only one temporary variable (temp) is used during swapping.*/