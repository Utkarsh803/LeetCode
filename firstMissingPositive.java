
class Solution {
    public int firstMissingPositive(int[] nums) {
        int res=0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int max =0;
        for(int y=0;y<nums.length;y++){
            int difference = nums[y]-1;
           // System.out.println("difference="+difference);
            if(max<difference){
                max=difference;
            //     System.out.println("max="+max);
            }
        map.put(difference,nums[y]);

        }
         for(int i=0;i<=max;i++){
            //  System.out.println("map.get("+i+") = "+ map.get(i));
        if(map.get(i)==null){
            return i+1;
        }
    }       
        return max+2;
    }
}
