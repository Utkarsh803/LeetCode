public class Solution {
    public int search(int[] nums, int target) {
        
        int res = binarySearch(nums, 0, nums.length-1, target);
        return res;
        
    }

        public int binarySearch(int[] nums, int l, int r, int target){
            if(l>r) 
                return -1;

            int m = l + (r-l)/2;

            if(target==nums[m]){
                return m;
            }

            if(nums[l]<=nums[m]){
                if(target<nums[m] && nums[l]<=target){
                  return binarySearch(nums,l, m-1, target);
                }
                else{
                  return  binarySearch(nums, m+1, r, target);
                }
            }else {
                if(nums[m]<target&& target<=nums[r]){
                  return  binarySearch(nums,m+1, r, target);
                }
                else{
                  return  binarySearch(nums, l, m-1, target);
                }
            }
        }

} 