class Solution {
    public int myAtoi(String s) {
        int neg=0;
        int num=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=' '&&Character.isDigit(s.charAt(i))||(s.charAt(i)=='+'||s.charAt(i)=='-')){
                if(s.charAt(i)=='-'){
                neg=1;
                }
                else{
                    System.out.println(s.charAt(i));
                    int no =s.charAt(i) - '0';
                if ((num > Integer.MAX_VALUE / 10)|| 
                (num == Integer.MAX_VALUE / 10 && num> Integer.MAX_VALUE % 10)) {     
                // If integer overflowed return 2^31-1, otherwise if underflowed return -2^31.    
                return neg == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
               // int no=Integer.parseInt(String.valueOf(s.charAt(i)));
                
                    num=num*10+no;
                }
            }
        }
        if(neg==1){
            num=num*-1;
        }
        return num;
    }
}
