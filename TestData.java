package assignment.week3.day2;

public class TestData {

	
	public void enterCredentials() {
		
		System.out.println("credentials entered");
	}
	
	public  void navigateToHomePage() {
		
		System.out.println("page navigated successfully");
		
	}
	public static void main(String[] args) {
		
		TestData test = new TestData();
		
		test.enterCredentials();
		test.navigateToHomePage();
		

	}

}
