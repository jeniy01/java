package dao;

public class Product {	//하나의 클래스 안에 public은 한 개만 있어야 함
	public String name;	//상품명, 접근제한 : public
	String pid;	//상품코드, 접근제한 : 선언 안했으므로 default
	protected String style;	//종류, 접근제한 : protected
	private int acount;	//상품 수량, 접근제한 : private
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPid() {
		return pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getAcount() {
		return acount;
	}
	public void setAcount(int acount) {
		this.acount = acount;
	}
}
//default 접근제한 타입의 클래스
class Stuff extends Product{	//Product클래스로 부터 상속
	public double gram;
}