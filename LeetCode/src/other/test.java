package other;

import java.util.HashSet;

public class test {

	public static void main(String[] args) {
		
		System.out.print(sortString("aaaabbbbcccc"));
		
	}
	
	 public static String sortString(String s) {
	        char[] ar = s.toCharArray();
	        int[] ls = new int[26];
	        /**
	            count duplicate characters by them index in array
	        **/
	        for(char n: ar){
	            ++ls[n - 'a'];
	        }     
	        /**
	            increase and decrease
	        **/
	        int count = s.length();
	        StringBuilder newString = new StringBuilder();
	        boolean dir = true;
	        while(count > 0){
	            for(int i = 0; i < 26; i++){
	                if(dir == false) i = 25 - i; 
	                System.out.println(ls[i] + "        " + i);
	                if( ls[i] > 0) {
	                    newString.append( (char)(i+'a') );
	                    ls[i] = ls[i] -1;
	                    count --;
	                    //System.out.println(count);
	                 }                
	            }
                System.out.println(dir);
	            dir = !dir;
	        }        
	        return newString.toString(); 
	    }
    
}
