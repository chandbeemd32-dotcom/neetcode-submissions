class Solution {
    private void reverse(int[] nums,int i,int j)
    {
        while(i<j)
        {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        int left=0;
        int right=n-1;
        k=k%n;
        reverse(nums,left,right);
        reverse(nums,left,k-1);
        reverse(nums,k,right);
    }
}