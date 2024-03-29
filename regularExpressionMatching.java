class Solution {
    public boolean isMatch(String s, String p) {
return helper(s, p, 0, 0);
}
private boolean helper(String s, String p, int i, int j) {
if (i >= s.length() && j >= p.length()) {
return true;
}
if (j < p.length() - 1 && p.charAt(j + 1) == '*') {
if (helper(s, p, i, j + 2)) {
return true;
}
if (p.charAt(j) == '.') {
for (int k = i; k < s.length(); k++) {
if (helper(s, p, k + 1, j + 2)) {
return true;
}
}
} else {
for (int k = i; k < s.length(); k++) {
if (s.charAt(k) == p.charAt(j)) {
if (helper(s, p, k + 1, j + 2)) {
return true;
}
} else {
break;
}
}
}
} else if (i < s.length() && j < p.length() && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')) {
return helper(s, p, i + 1, j + 1);
}
return false;
}
}
/*    public boolean choice(String s, String p, int a, int b) {
        if(p==".*"){
            return true;
        }
        else if(s==""&& p==""){
            return true;
        }
        
        return true;
    }
public void dfs(int i, int j){
    if( i>=s.length()  && j>=s.length()){
        return true;
    }
    if(j>= s.length()){
        return false;
    }
    if(i<s.length() && s.chatAt(i)==p.charAt(j) || p.charAt(j)='.'){
        
    }
    if((j+1)<p.length() && p.charAt(j+1)=='*'){
        dfs(i, j+2); //dont use the star
    }
}*/