class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        if (s == null || s.equals("")) {
            return 0;
        }
        
        int start = 0;
        int end = 0;
        Set<Character> map = new HashSet<>();
        int maxLength=0;
        
        while(end<s.length()){
            if(map.add(s.charAt(end))){
                end++;
                maxLength=Math.max(maxLength, map.size());
            }
            else{
                map.remove(s.charAt(start));
                start++;
            }
        }
        return maxLength;
    }
}