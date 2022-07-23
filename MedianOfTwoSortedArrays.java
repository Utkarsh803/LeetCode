class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    
        int[] mergedArray = new int[nums1.length+nums2.length];
        
        mergedArray = mergeArray(nums1, nums2);
        
        double median=0;
        
        for(int s=0;s<mergedArray.length;s++){
        System.out.println(mergedArray[s]);}
        
        if(mergedArray.length%2 != 0){
            median = mergedArray[mergedArray.length/2];
        }
        else{
            
            double sum =((mergedArray[(mergedArray.length/2)-1] + mergedArray[mergedArray.length/2])*1) ;
            System.out.println(sum);
            median = sum/2;
        }
        
       return median; 
    }
    
    private int[] mergeArray(int[] nums1, int[] nums2){
        //create a new array 
        int[] finalArray = new int[nums1.length+nums2.length];
        
        //pointer for n3
        int i=0;
        
        //pointers for n1 and n2
        int a = 0;
        int b = 0;
        
        for(i=0;i<finalArray.length;i++){
            
            
             //case1:if a or b is null
            if(a >=nums1.length|| b >=nums2.length){
                System.out.println("Case 1 : a="+a+" b="+b);
                if(b >=nums2.length){
                   
                     while(a<nums1.length){
                        finalArray[i]=nums1[a];
                        i++;
                        a++;
                    }
                }
                else if (a >=nums1.length){
                    System.out.println("Inside : a="+a+" b="+b);
                    
                    while(b<nums2.length){
                        System.out.println("assigning : i="+i+" b="+b);
                        finalArray[i]=nums2[b];
                        i++;
                        b++;
                    }
        
                }
                return finalArray;
            }
            
            //case 2: if a and b are not null
            if(a<nums1.length && b<nums2.length){
                
                 System.out.println("Case 2 : a="+a+" b="+b);
                
                //case A:a==b
                if(nums1[a]==nums2[b]){
                    finalArray[i]=nums1[a];
                    a++;  
                }
                //case B:a>b
                else if(nums1[a]>nums2[b]){
                    finalArray[i]=nums2[b];
                    b++;
                }
                
                //case B:a<b
                else{
                    finalArray[i]=nums1[a];
                    a++;
                    
                }
                
            }
            
        }
        return finalArray;
    }
}