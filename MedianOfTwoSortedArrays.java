class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double n1=nums1.length%2;
        double n2=nums2.length%2;
        double m1=0;
        double m2=0;
        
        //length=1
       if(nums1.length==1 ||nums2.length==1 ){ 
        if(nums1.length==1){
            m1=nums1[0];
        }
        
        if(nums2.length==1){
            m2=nums2[0];
        }
       }
        else{
            if(n1==1&&n2==1){
                m1=nums1[nums1.length-1/2];
                m2=nums2[nums1.length-1/2];   
            }
           
            else if(n1==0&&n2==1){
                m2=nums2[nums1.length-1/2];
                m1=(nums1[nums1.length/2-1]+nums1[nums1.length/2])/2;
                
            }
            
            else if(n1==1&&n2==0){
                m1=nums1[nums1.length-1/2];
                m2=(nums2[nums2.length/2-1]+nums2[nums2.length/2])/2;
            }
            
            else if (n1==0&&n2==0){
                m1=(nums1[nums1.length/2-1]+nums1[nums1.length/2])/2;
                m2=(nums2[nums2.length/2-1]+nums2[nums2.length/2])/2;
            }
        
        }
    return m2;
    }
}