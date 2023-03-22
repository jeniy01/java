package sec2;

public class NonMember extends Customer {
	private String tepmId;
	private int orderNum;
	private String tempPw;
	
	//생성자함수 - 오버로딩됨
	public NonMember(){
		super();
	}
	public NonMember(String name){
		super(name);
	}
	public NonMember(String name, String tel){
		super(name, tel);
	}
	public NonMember(String name, String tel, String email){
		super(name, tel, email);
	}
	public NonMember(String name, String tel, String email, String addr){
		super(name, tel, email, addr);
	}
	public NonMember(String name, String tel, String email, String addr, int age){
		super(name, tel, email, addr, age);
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId){
		super(name, tel, email, addr, age);
		this.tepmId = tepmId;	//현재 클래스에서 추가되는 항목은 따로 this로 기재
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId, int orderNum){
		super(name, tel, email, addr, age);
		this.tepmId = tepmId;
		this.orderNum = orderNum;
	}
	public NonMember(String name, String tel, String email, String addr, int age, String tempId, int orderNum, String tempPw){
		super(name, tel, email, addr, age);
		this.tepmId = tepmId;
		this.orderNum = orderNum;
		this.tempPw = tempPw;
	}
	
	public String getTepmId() {
		return tepmId;
	}
	public void setTepmId(String tepmId) {
		this.tepmId = tepmId;
	}
	public int getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(int orderNum) {
		this.orderNum = orderNum;
	}
	public String getTempPw() {
		return tempPw;
	}
	public void setTempPw(String tempPw) {
		this.tempPw = tempPw;
	}
	
	//오버라이딩됨
	@Override
	public void getCustom() {
		System.out.println("비회원고객님 감사합니다.");
	}
}
