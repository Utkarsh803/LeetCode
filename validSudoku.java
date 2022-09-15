public class Solution {
    public boolean isValidSudoku(char[][] board) {
    Set<String> set = new HashSet();
        for(int i =0;i<board.length;i++){
             for(int j =0;j<board[0].length;j++){
                 char number = board[i][j];
                 if(number!='.'){
                     if(!set.add(number + "in row "+ i)||!set.add(number + "in column "+ j)||!set.add(number + "in grid "+ i/3+"-"+j/3)){
                         return false;
                     }
                 }
             }
        }
        return true;
    }
    
} 

//O(n^2)
