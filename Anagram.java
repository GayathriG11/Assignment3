package assignment.week3;

import java.util.Arrays;

public class Anagram {
	
	
	public static void main(String[] args) {
		
		String text1= "stops";
		
		String text2="potss";
		
		int lengthOfString= text1.length();
		
		System.out.println("length is"+lengthOfString);
		
		int lengthOfString2 = text2.length();
		
		System.out.println("length is"+lengthOfString2);
		


      
         char[] characters = text1.toCharArray();

         char[] characters2 = text2.toCharArray();
        
      
         Arrays.sort(characters);
         Arrays.sort(characters2);
         
         boolean result=Arrays.equals(characters,characters2);
         
         if(result) {
        	 
        	 System.out.println("the strings are anagram");
         }
         
         else {
        	 
         
          System.out.println("the strings are not anagram");
        		  
        	  }	 
        	 
         
         
         
         
         
         }


     
	}
	


