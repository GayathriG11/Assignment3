package assignment.week3;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		int[] input = {1,4,3,2,8,6,7};
		
		Arrays.sort(input);  //{ 1,2,3,4,6,7,8 }
		
		int sum=0;
		
		for(int i=0;i<input.length;i++) {
			
			sum=sum+input[i]; //0+1 1+2 3+3 6+4 10+6 16+7 23+8
		}                     //31
    System.out.println(sum);
    
    int sum1=0;
    
    for(int j=1;j<=8;j++) {
    	
    	sum1=sum1+j; // 0+1 1+2 3+3 6+4 10+5 15+6 21+7 28+8
    	             //36
    	
    }
    System.out.println(sum1);
    
    System.out.println("Missing Element is" + (sum1-sum)); //36-31 = 5
	}

}
