class Solution {
    public String longestPalindrome(String s) {
        String pal=Character.toString(s.charAt(0));
        int len=0;
        if(s.length()==1){
            return s;
        }
        for(int i=0;i<s.length()-1;i++){
                for(int j=s.length()-1;j>i;j--){
                    if(s.charAt(i)==s.charAt(j)){
                        if(isPalindrome(s.substring(i, j+1))){
                            if(len<(s.substring(i, j+1)).length()){
                            len=(s.substring(i, j+1)).length();
                            pal=s.substring(i, j+1);
                            }
                        }
                    }
                }
                }
        return pal;
        }
         public boolean isPalindrome(String x) {
        int l=0;
        int h=x.length()-1;
        while(l<h){
            if(x.charAt(l)==x.charAt(h)){
                l++;
                h--;
            }
            else{
                return false;
            }
        }
        return true;
    }
    }