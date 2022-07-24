public class Solution {
    public boolean isValid(String s) {
       Stack<Character> stac = new Stack<>();
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)=='{'||s.charAt(i)=='('||s.charAt(i)=='['){
               System.out.println("if, encountered"+ s.charAt(i));
                stac.push(s.charAt(i)); 
                 System.out.println("Pushed "+ s.charAt(i));
            }
            else if(s.charAt(i)=='}'){
               System.out.println("else if, encountered"+ s.charAt(i));
                if(stac.empty() || stac.peek()!='{'){
                    return false;
                }
                else{
                    stac.pop();
                     System.out.println("Popped "+s.charAt(i));
                }
        }  
    
                else if(s.charAt(i)==')'){
               System.out.println("else if, encountered"+ '(');
                if(stac.empty() || stac.peek()!='('){
                    return false;
                }
                else{
                    stac.pop();
                     System.out.println("Popped "+s.charAt(i));
                }
        }  
             else if(s.charAt(i)==']'){
               System.out.println("else if, encountered"+ s.charAt(i));
                if(stac.empty() || stac.peek()!='['){
                    return false;
                }
                else{
                    stac.pop();
                     System.out.println("Popped "+s.charAt(i));
                }
        }  
    }
                   
          return stac.empty(); 
  }
} validParenthesis {
    
}
