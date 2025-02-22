package assignment.week3;

public class FindIntersection {

	public static void main(String[] args) {
		
		int a[] = {3,2,11,4,6,7};
		int b[] = {1,2,8,4,9,7};
		
		int [] array1 = new int[6];
		
		int[] array2 = new int[6];
		
		for(int i=0;i<a.length;i++) {
			
			for(int j=0;j<b.length;j++) {
				
				if(a[i]==b[j]) {
					
					System.out.println( a[i]);
				}
			}
		}
		
		
	}

}
