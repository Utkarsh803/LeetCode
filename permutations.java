class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        
        if(nums.length==1){
            for(int i =0;i<nums.length;i++)
            {
                list.add(nums[i]);
            }
            result.add(list);
            return result;
        }
        else{
            for(int i=0;i<nums.length;i++){
                if(visited[i]==false){
                    visited[i]=true;
                    
                }
            }
        }
    return result;
    }
}