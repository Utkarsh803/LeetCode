class Solution {
    public String longestCommonPrefix(String[] strs) {
    String p="";
        if(strs.length==1){
            return strs[0];
        }
        for(int i=0;i<strs.length-1;i++){
        if(i==0){
        p=getPrefix(strs[i], strs[i+1]);
        }
        else{
        p=getPrefix(p, strs[i+1]);
        }   
        }
        return p;
    }       
        private String getPrefix(String a, String b){
        String prefix ="";
        int i=0;
        
        while(i<a.length() && i<b.length() && a.charAt(i)==b.charAt(i) ){
              prefix=prefix+a.charAt(i);
              i++;
        }
         
        return prefix;
    }
    }
    
