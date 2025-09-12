class Solution {
    public int max = 0;
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        while(left < right){
            int mul = Math.min(height[left], height[right]) * (right - left);
            max = Math.max(mul, max);
            if(height[left] >= height[right]){
                right-=1;
            }else{
                left+=1;
            }
        }
    return max;   
    }
}