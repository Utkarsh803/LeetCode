class Solution {
    //backtracting...permutations..patterns
    public List<String> generateParenthesis(int n) {
        List<String> output= new ArrayList();
        backtrack(output, "", 0, 0, n);//pass in an empty string and 2 pointers
        return output;
    }
    public void backtrack(List<String> output, String input, int open, int close, int max){
        if(input.length()==max*2){
            output.add(input);
            return;
        }
        if(open<max){//add an opening 
            backtrack(output, input+"(", open+1, close, max);
        }
        if(close<open){//
            backtrack(output, input+")", open, close+1, max);
        }
    }
}