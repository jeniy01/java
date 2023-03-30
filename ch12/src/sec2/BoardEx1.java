package sec2;

public class BoardEx1 {
	public static void main(String[] args) {
		Board b1 = new Board();
		b1.setBno(1);
		b1.setTitle("이마크 솔로");
		b1.setContent("마크 솔로 응원해!");
		System.out.println(b1.getBno());
		System.out.println(b1.getTitle());
		System.out.println(b1.getContent());
	}
}
