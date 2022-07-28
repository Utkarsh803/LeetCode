public class removeDuplicatesFromSortedArray {
    
}
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int dynamicLength=nums.length;
        for(int i=0;i<dynamicLength;i++){
            System.out.println("DL:"+ dynamicLength);
            if(i<nums.length-1 && nums[i]==nums[i+1]){
                for(int j=i+1;j<nums.length-1;j++){
                    nums[j]=nums[j+1];
                }
                nums[nums.length-1]=nums[i];
                System.out.println("Removed:"+ nums[i]);
                dynamicLength--;
                if(i<dynamicLength-1 && nums[i]==nums[i+1]){
                    i--;
                }
            }
        }
    return dynamicLength;
    }
    
}