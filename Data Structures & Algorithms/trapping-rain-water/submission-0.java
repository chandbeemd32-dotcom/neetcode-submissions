class Solution {
    public int trap(int[] height) {
        int n=height.length;
        if(n==0)
        {
            return 0;
        }
        int leftmax=height[0];
        int rightmax=height[n-1];
        int left=0;
        int right=n-1;
        int water=0;
        while(left<right)
        {
            if(height[left]<=height[right])
            {
               if(height[left]>=leftmax)
               {
                leftmax=height[left];
               }
               else
               {
                water=water+leftmax-height[left];
               }
               left++;
            }
            else
            {
               if(height[right]>=rightmax)
               {
                rightmax=height[right];
               }
               else
               {
                water=water+rightmax-height[right];
               }
               right--;
            }
        }
        return water;
    }
}
