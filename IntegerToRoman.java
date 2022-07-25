public class IntegerToRoman {
    
}
class Solution {
    public String intToRoman(int num) {
        
        if(num <= 0) return "";
	    String[] roman = {"M", "CM","D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    int[] integr = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
	    
        //using string builder to make the number
        StringBuilder b = new StringBuilder();
	    
        //keep subtract the highest num until the end 
        for(int i = 0; num != 0; i++){
            System.out.println("i is "+i+"num is "+num);
	           while(num >= integr[i]){
                   System.out.println("While"+num+">="+integr[i]);
	               System.out.println(num+"="+num+"-"+integr[i]);
                   num = num - integr[i];
                   System.out.println("Append "+roman[i]); 
	               b.append(roman[i]);
                  
	            }
	        }
	        return b.toString();
    }
}