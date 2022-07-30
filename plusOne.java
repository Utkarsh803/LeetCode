public class Solution {
    public int[] plusOne(int[] digits) {
        
        if(digits.length==0){
            int[] res=new int[0];
            return res;
        }
        
        int num=0;
        int mul=1;
        for(int i=digits.length-1; i>=0;i--){
            num=num+(digits[i] * mul);
            System.out.println("d: "+digits[i]+"m: "+mul+" = "+digits[i]*mul);
            mul=mul * 10;
        }
        System.out.println("Number is :"+ num);
        int number = num + 1;
        System.out.println("Added one is :"+ number);
        String numm = Integer.toString(number);
        
        int[] res=new int[numm.length()];
            
        for(int j=0; j<res.length;j++){
            res[j]=Integer.parseInt(String.valueOf(numm.charAt(j)));
        }
    return res;
    }
} 
