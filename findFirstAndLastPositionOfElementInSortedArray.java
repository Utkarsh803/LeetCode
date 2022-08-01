class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l =0;
        int r = nums.length-1;
        int[] res = new int[2];
        int first = binarySearchFirst(target, nums, l, r);
        int last = binarySearchLast(target, nums, l, r);
        res[0]=first;
        res[1]=last;
        return res;
        
    }
    public int binarySearchFirst(int target, int[] nums, int l, int r){
        
        int m = (l +((r-l)/2));
        System.out.println("l: "+l+"r:"+r+"m:"+m);
        int fail = -1 ;
        
        if(r<l){
           return fail;
        }
        
        if((m==0||(target > nums[m - 1])) && nums[m] == target){
            return m;
        }
        else if(nums[m]>=target){
            return binarySearchFirst(target,nums, l, m-1);
        }
        else{
            return binarySearchFirst(target,nums, m+1, r);
        }
    }
    
    public int binarySearchLast(int target, int[] nums, int l, int r){
        
        int m = (l +((r-l)/2));
        int fail = -1;
        
        if(r<l){
           return fail;
        }
        
        else if((m==(nums.length-1)||(target < nums[m + 1])) && nums[m] == target){
            return m;
        }
        else if(nums[m]>target){
            return binarySearchLast(target,nums, l, m-1);
        }
        else{
            return binarySearchLast(target,nums, m+1, r);
        }
    }
    
}