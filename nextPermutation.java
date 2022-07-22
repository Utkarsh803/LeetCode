class Solution {
    public void nextPermutation(int[] nums) {
        int swapA=-1;
        for(int i=nums.length-1;i>0;i--){
            if (nums[i]>nums[i-1]){
                swapA=i-1;
                break;
            }
        }
        
        if (swapA == -1) {
        reverse(nums, 0, nums.length - 1);
        return;
        }
        
        int lim=nums.length-1;
        for(int i =nums.length-1;i>=swapA+1;i--){
            if(nums[i]>nums[swapA]){
                lim=i;
                break;
            }
        }
        
        swap(nums, swapA, lim);
        reverse(nums, swapA+1, nums.length-1);
        
    }
    
    public void swap(int[] nums, int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    
    public void reverse(int[] nums, int i, int j) {
        while(i<j){
           swap(nums, i, j);
            i++;
            j--;
        }
    }
}