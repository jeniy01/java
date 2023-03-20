package sec3;

public class MemberEx1 {
	public static void main(String[] args) {
		Member mem1 = new Member();
		mem1.setId("bbh");
		mem1.setPw("920506");
		mem1.setName("변백현");
		mem1.setTel("010-9205-0604");
		mem1.setEmail("bhlight@naver.com");
		
		System.out.println(mem1.toString());
	}

}
