class Solution {
    public int mySqrt(int x) {
       if(x == 0) return 0;
       int low = 1, high = x;
       while(low<=high){
        int middle = low + (high-low) / 2;
       // if(middle*middle == x) return middle;
        if(middle == x/middle) return middle;
        else if(middle > x/middle) high = middle-1;
        else //(middle*middle < x)
            low = middle+1;
       } 
       return high;
    }
}