package sec1;

public class Member {
	public String id;	//private가 아니므로 getter~setter는 필요 없음
	public String pw;
	
	public Member(){}	//밑에 String id, pw가 있으므로 생성자 선언 필수
	
	public Member(String id){
		this.id = id;
	}
	public Member(String id, String pw){
		this.id = id;
		this.pw = pw;
	}

	@Override
	public boolean equals(Object obj) {	//boolean과 (매개변수)는 바꿀 수 없음
		if(obj instanceof Member){
			return true;
		}
		return super.equals(obj);
	}
}