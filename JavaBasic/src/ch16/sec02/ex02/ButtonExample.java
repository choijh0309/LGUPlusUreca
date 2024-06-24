package ch16.sec02.ex02;

public class ButtonExample {

	public static void main(String[] args) {
		Button btnOk = new Button();
		btnOk.setClickListener(() -> System.out.println("OK Button click"));
		btnOk.click();
		
		Button btnCancel = new Button();
		btnCancel.setClickListener(() -> System.out.println("Cancel Button click"));
		btnCancel.click();
	}

}
