package assignment.week3.day2;

public class LoginPage extends BasePage {
	
	public void performCommonTask() {
		
		System.out.println("Common task performed successfully");
	}
	

	public static void main(String[] args) {
		
		LoginPage login = new LoginPage();
		
	login.performCommonTask();

	}

}
