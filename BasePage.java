package assignment.week3.day2;

public class BasePage {
	
	public void findElement() {
		
		System.out.println("Element finded");
		
	}
	
	public void clickElement() {
		
		System.out.println("Element clicked successfully");
	}
	
	public void enterText() {
		
		System.out.println("Text entered");
	}
	
	public void performCommonTask() {
		
		
		
		System.out.println("Common task performed");
	}

	public static void main(String[] args) {
		
		BasePage base = new BasePage();
		
		base.findElement();
		base.clickElement();
		base.enterText();
		base.performCommonTask();
	}

}
