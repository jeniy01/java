package sec2;

public class Example1 {
	public static void main(String[] args) {
		//문자열과 문자 배열
		String str1="java program";
		char[]c_arr={'j','a','v','a',' ','p','r','o','g','r','a','m'};
		//str1.length():문자열의 글자수
		//c_arr.length():배열의 개수
		
		//기본출력
		System.out.println(str1);
		System.out.println(c_arr);
		System.out.println();
		
		//개별 문자요소 접근
		for(char data : c_arr){	//문자 배열 요소 접근, 문자열
			System.out.print(data);
		}
		System.out.println();
		for(int i=0;i<str1.length();i++){	//문자열의 개별요소 접근, 문자
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		
		//문자열인 주민번호의 성별코드를 이요한 성별 구하기
		String jumin="123456-1891723";
		char m=jumin.charAt(7);	//인덱스는 0부터 시작
		System.out.println(m);
		switch(m){
		case '1':	//char니까 ''사용
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		default:
			System.out.println("외국인");
		}
	}
}
