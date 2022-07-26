class Solution {
    public List<String> letterCombinations(String digits) {
        
        List<String> output = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
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
             
             String f = Character.toString(letters.charAt(0));
             String s = Character.toString(letters.charAt(1));
             String t = Character.toString(letters.charAt(2));
              
             output.add(f);
             output.add(s);
             output.add(t);
             
         }
        
        else if(digits.length()==0){
            return output;
        }
        
        else{
            
            output.add("");
    
            for(int i=0;i<digits.length();i++){
            int number = Integer.parseInt(String.valueOf(digits.charAt(i)));
                
            if(number<2 && number>9){
                return output;
            }    
            String letters = hash.get(number);
                
            
                //abc
                
            System.out.println(letters);
            
            System.out.println(output);

             int length = output.size();   
            for(int j=0;j<letters.length();j++){
                    
                for(int l=0;l<length;l++){
                    System.out.println("f"+output.get(l));
                    
                    System.out.println("s"+String.valueOf(letters.charAt(j)));
                    
                    String element = output.get(l)+String.valueOf(letters.charAt(j));
                    
                     System.out.println(element);
                    
                    output.add(element);
              }
                     System.out.println("output");
                    
           }

   
        }      
            return output;
      }   
   return output;
    }
    
}