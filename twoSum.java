//O(n^2)
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        int result[]=new int[2];
        for(int i=0;i<nums.length-1;i++){
            for(int j=1;j<nums.length;j++){
                if(nums[i]+nums[j]==target){
                    result[0]= i;
                    result[1]=j;
                    return result;
                }
            }
        }
        return result;
    }
}

//<O(n^2)

class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> hash = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            Integer diff = (Integer)(target - nums[i]);
            if(hash.containsKey(diff)){
                int toReturn[] = {hash.get(diff), i};
                return toReturn;
            }
            hash.put(nums[i], i);
        }       
        return null;
    }
}