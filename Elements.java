package assignment.week3.day2;

public class Elements extends Button {
	
	public void execute() {
		
		click();
		submit();
		
		TextField text = new TextField();
		text.setText("Hello world");
		
		CheckBoxButton check = new CheckBoxButton();
		check.clickCheckButton();
		
		RadioButton radio = new RadioButton();
		radio.selectRadioButton();
		
	}

	public static void main(String[] args) {
		
		Elements element = new Elements();
		element.execute();
		
	}

}
