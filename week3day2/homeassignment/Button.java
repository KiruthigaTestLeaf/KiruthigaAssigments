package week3day2.homeassignment;

	public class Button extends WebElement {
		public static void submit() {
			System.out.println("Submitted");

	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Button button = new Button();
			button.click();
			button.setString("Text1");
			button.submit();

}
	}
