class Solution {
    public int romanToInt(String s) {
        if(s.equals("")) return 0;
	    
        HashMap<String,Integer> hash = new HashMap<String,Integer>();
        hash.put("M", 1000);
         hash.put("CM", 900);
         hash.put("D", 500);
         hash.put("CD", 400);
         hash.put("C", 100);
         hash.put("XC", 90);
         hash.put("L", 50);
         hash.put("XL", 40);
         hash.put("X", 10);
         hash.put("IX", 9);
         hash.put("V", 5);
         hash.put("IV", 4);
         hash.put("I", 1);
        
        int num=0;
        String f="";
        for(int i = 0; i<s.length(); i++){
            
            String letter = String.valueOf(s.charAt(i));
            
            if(letter.equals("I")){
                if((i<(s.length()-1)) && (String.valueOf(s.charAt(i+1)).equals("V")||String.valueOf(s.charAt(i+1)).equals("X"))){
                    String next = String.valueOf(s.charAt(i+1));
                    f = letter+next;
                    int val = hash.get(f);

                    num=num+val;
                    i++;
                }
                else{
                    f = letter;
                    int val = hash.get(f);
           
                    num=num+val;
                }
            }
            
            
            else if(letter.equals("X")){
                if((i<(s.length()-1))&& (String.valueOf(s.charAt(i+1)).equals("L")||String.valueOf(s.charAt(i+1)).equals("C"))){
                   
                    String next = String.valueOf(s.charAt(i+1));
                    f = letter+next;
                    int val = hash.get(f);
                    
                    num=num+val;
                    i++; 
                    
                }
                else{
                  
                    f = letter;
                    int val = hash.get(f);
                 
                    num=num+val;
                }
            }
           
            
            else if(letter.equals("C")){
                if((i<(s.length()-1)) && (String.valueOf(s.charAt(i+1)).equals("D")||String.valueOf(s.charAt(i+1)).equals("M"))){
                   
                    
                    String next = String.valueOf(s.charAt(i+1));
                    
                    f = letter+next;
                    
                    int val = hash.get(f);
                  
                    num=num+val;
                    i++;
                }
                else{
                    
                    f = letter;
                    int val = hash.get(f);
               
                    num=num+val;
                }
            }
           
            
            else{
                    f = letter;
                    int val = hash.get(f);
                
                    num=num+val;
            }
                  
	            }
        return num;
	        }
    }