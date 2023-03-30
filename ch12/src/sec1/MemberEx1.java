package sec1;

public class MemberEx1 {
	public static void main(String[] args) {
		Member obj1 = new Member("ldh", "0606");
		Member obj2 = new Member("lmk", "0802");
		Member obj3 = new Member("ljn", "0423");
		
		System.out.println("obj1과 obj2가 같은 클래스로 부터 만들어진 객체? "+obj1.equals(obj2));
	}
}
