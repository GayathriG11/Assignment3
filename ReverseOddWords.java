package assignment.week3;

public class ReverseOddWords {

	public static void main(String[] args) {
		
		String test= "I am a software tester";
		
		char[]charArray= test.toCharArray();
		
		char[] result= new char[charArray.length/2];
		
		int k=0;
		
		for(int i=0;i<charArray.length;i++) {
			
			if(i%2==0) {
				
				result[k]=charArray[i];
				k++;
				
				System.out.println(charArray[i]);
				
				
				
			}
			
		}
		System.out.println("----------------");
		
		for(int i=result.length-1;i>=0;i--) {
			
			System.out.println(""+result[i]);
		}
		
		

	}

}
