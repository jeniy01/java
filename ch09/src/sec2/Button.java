package sec2;

public class Button {
	public static interface ClickListener {
		void onClick();
	}
	private ClickListener clicklistener;
	public void setClickListener(ClickListener clicklistener){
		this.clicklistener = clicklistener;
	}
	public void click(){
		this.clicklistener.onClick();
	}
}
