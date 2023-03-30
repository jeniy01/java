package sec4;

public class StringEx2 {
	public static void main(String[] args) {
		String data = "자바";
		String data2 = new StringBuilder().append("홍길동").toString();
		System.out.println(data);
		System.out.println(data2);
		
		data = new StringBuilder().append("웹").toString();
		System.out.println(data);
		StringBuilder sb = new StringBuilder(data);
		
		sb.append("프로그래밍데이터");	//특정 문자열 추가
		System.out.println(sb.toString());
		
		sb.delete(6,  9);	//특정 문자열 삭제
		System.out.println(sb.toString());
		
		sb.insert(0, "자바");	//특정 문자열 중간 삽입
		System.out.println(sb.toString());
		System.out.println(sb.substring(2, 8));	//특정 문자열 추출
		System.out.println("문자열 길이 : "+sb.length());	//문자열 길이
		System.out.println("거꾸로 : "+sb.reverse());	//글자를 거꾸로
	}
}
