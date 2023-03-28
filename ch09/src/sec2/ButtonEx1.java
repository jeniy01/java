package sec2;

public class ButtonEx1 {
	public static void main(String[] args) {
		Button btnOk = new Button();
		
		btnOk.setClickListener(new Button.ClickListener(){
			@Override
			public void onClick() {
				System.out.println("Ok 버튼 클릭~!");
			}
		});

		btnOk.click();
		
		Button btnCancle = new Button();
		
		btnCancle.setClickListener(new Button.ClickListener(){
			@Override
			public void onClick() {
				System.out.println("Cancle 버튼 클릭~!");
			}
		});

		btnCancle.click();
	}
}
