package sec1;

public class MemberEx1 {
	public static void main(String[] args) {
		Member<Integer, String> m1 = new Member<>();
		m1.setNo(22);
		m1.setId("ljn");
		System.out.println(m1.getNo()+", "+m1.getId());
		
		Member<String, Integer> m2 = new Member<>();
		m2.setNo("1004");
		m2.setId(288);
		System.out.println(m2.getNo()+", "+m2.getId());
	}
}
