class Solution {
    public int divide(int dividend, int divisor) {
        
        int quotient=0;
        int num=0;
        
        if(divisor==0){
            return 0;
        }
         if(dividend >0 && divisor>0){
            while(num<=dividend){
                System.out.println("Num: "+num+"divisor :"+divisor);
                num=num+divisor;
                quotient++;
            }
            quotient--;
            if(quotient>((2^31)-1)){
                return (2^31)-1;
            }
            else{
                return quotient;
            }
        }
               
        else if (dividend > 0 && divisor<0){
            int pDivisor = -1 * divisor;
             while(num<=dividend){
                num=num+pDivisor;
                quotient++;
            }
            quotient--;
            quotient=quotient * -1;
            
            if(quotient<(-(2^31))){
                return -(2^31);
            }
            else{
                return quotient;
            }
        }
        else if(dividend<0 && divisor<0){
            System.out.println("Entered <<");
            divisor = -1 * divisor;
            dividend = -1 * dividend;
              System.out.println("Num: "+num+"divisor :"+divisor+"dividend"+dividend);
             while(num<=dividend){
                num=num+divisor;
                quotient++;
            }
            quotient--;
            
            
            if(quotient<(-(2^31))){
                return -(2^31);
            }
            else if(quotient>((2^31)-1)){
                return ((2^31)-1);
            }
            else{
                return quotient;
            }
        }
        else if(dividend<0 && divisor>0){
            dividend = -1 * dividend;
             while(num<=dividend){
                num=num+divisor;
                quotient++;
            }
            quotient--;
            quotient=quotient * -1;
            
            if(quotient<(-(2^31))){
                return -(2^31);
            }
            else if(quotient>((2^31)-1)){
                return ((2^31)-1);
            }
            else{
                return quotient;
            }
        }
    return quotient;
    }
               }