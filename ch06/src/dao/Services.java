package dao;

public class Services extends Product{	//Product클래스로 부터 상속
	public String sid = super.pid;
	public String stage = super.style;
	
	public String getSid(){
		return sid;
	}
	public void setSid(){
		this.sid = super.pid;
	}
	public String getStage(){
		return stage;
	}
	public void setStage(){
		this.stage = super.style;	//stage를 style로 부르고 싶을 땐(이름 바꿔 부르고 싶을 땐) super. 붙이기
	}
	//접근제한이 protected인 style 멤버 필드는 부모 클래스(super class)에 있는 속성이므로 접근 가능
	//super 객체로 접근 가능
}
