package sec4;
//멀티쓰레드->StringBuffer
public class StringEx4 {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("이마크");
		System.out.println(sb.toString());
		
		sb.append("솔로 화이팅~");
		System.out.println(sb.toString());
		
		sb.insert(0, "엔시티");
		System.out.println(sb.toString());
		
		sb.delete(3, 6);
		System.out.println(sb.toString());
		
		System.out.println(sb.substring(0, 3));
		System.out.println(sb.length());
	}

}
