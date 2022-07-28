class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> output = new ArrayList<String>();
       
        HashMap<Integer,String> hash = new HashMap<Integer,String>();
        hash.put(2, "abc");
        hash.put(3, "def");
        hash.put(4, "ghi");
        hash.put(5, "jkl");
        hash.put(6, "mno");
        hash.put(7, "pqrs");
        hash.put(8, "tuv");
        hash.put(9, "wxyz");
        
        
         if(digits.length()==1){
             
             
          String letters = hash.get(Integer.valueOf(digits));
             
             
             for(int y=0;y<letters.length();y++){
                  String f = Character.toString(letters.charAt(y));
                  output.add(f);
             }
            
         }
        
        else if(digits.length()==0){
            return output;
        }
        
        else{
            
            output.add("");
    
            output = findComb(digits, output, hash);  
            
            return output;
      }   
   return output;
    }
    
    
    public List<String> findComb(String number,List<String> output, HashMap<Integer,String> hash){
      
        if(number.length()==0){
            return output; 
        }
        
        List<String> temp = new ArrayList<String>();
        
        int digit =  Integer.parseInt(String.valueOf(number.charAt(0)));
        
        String letters = hash.get(digit);
        
         for(int j=0;j<letters.length();j++){
                    
                for(int l=0;l<output.size();l++){
                    
                    System.out.println("f"+output.get(l));
                    
                    System.out.println("s"+String.valueOf(letters.charAt(j)));
                    
                    String element = output.get(l)+String.valueOf(letters.charAt(j));
                    
                     System.out.println(element);
                    
                    temp.add(element);
              }
                    
                    
           }
            
        number=number.substring(1,number.length());
        List<String> finl = findComb(number, temp, hash);
        
        return finl;
    }
}