class Solution {
    public int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        if(haystack.length()<needle.length()){
            return -1;
        }
        for(int i=0;i<haystack.length();i++){
            for(int y=0;y<needle.length();i++){
                if(haystack.charAt(i)==needle.charAt(y)){
                    int length=0;
                    int m = i;int n=y;
                    while(m<haystack.length()&&n<needle.length() && haystack.charAt(m)==needle.charAt(n) ){
                        length++;
                        m++;
                        n++;
                    }
                    if(length==needle.length()){
                        return i;
                    }
                    else{
                        break;
                    }
                }
                else
                {
                    break;
                }
            }   
        }
        return -1;
    }
}public class implementStrstr {
    
}
