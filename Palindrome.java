class Solution {
    public boolean isPalindrome(int x) {
        int l=0;
        int h=(String.valueOf(x)).length()-1;
        String s=String.valueOf(x);
        while(l<h){
            if(s.charAt(l)==s.charAt(h)){
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