package assignment.week3.day2;

public class LoginTestData extends TestData {
	
	public void enterUserName() {
		
		System.out.println("User name entered");
	}
	
	public void enterPassword() {
		
		System.out.println("Password entered");
	}

	public static void main(String[] args) {
		
		LoginTestData login = new LoginTestData();
		
		login.enterPassword();
		login.enterUserName();
		login.enterCredentials();
		login.navigateToHomePage();
		

	}

}
