class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        Arrays.sort(nums);
        
        List<List<Integer>> res = new LinkedList<>();
        
        //idea a+b+c=0
        
        for(int i=0;i<nums.length-2;i++){//triplets
            
            if(i==0 || (i>0 && (nums[i]!=nums[i-1]))){//avoid a as duplicate
                
                int lo =i+1, hi = nums.length-1, sum = 0- nums[i];
                
                while(lo<hi){
                    if(nums[lo] + nums[hi]== sum){
                        res.add(Arrays.asList(nums[i], nums[lo], nums[hi]));
                        while(lo<hi && nums[lo] ==nums[lo+1]) lo++;
                        while(lo<hi && nums[hi] ==nums[hi-1]) hi--;
                        lo++; hi--;
                    }
                    else if (nums[lo]+ nums[hi]<sum) lo++;
                    
                    else hi--;
                }
            }          
         }
         return res;
        }
   
}

//TC=O(N X N)
//S=O(M), auxiliary =O(1)