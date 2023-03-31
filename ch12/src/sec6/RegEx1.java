package sec6;

import java.util.regex.Pattern;
/*
정규표현식(Regular Expression) : 입력 또는 저장된 데이터가 특정 형식에 맞는지 검증할 수 있는 식
정규 표현식			설명
^[0-9]*$		숫자
^[a-zA-Z]*$		영문자
^[가-힣]*$		한글
\\w+@\\w+\\.\\w+(\\.\\w+)?		E-Mail
^\d{2,3}-\d{3,4}-\d{4}$			전화번호
^01(?:0|1|[6-9])-(?:\d{3}|\d{4})-\d{4}$		휴대전화번호
\d{6} \- [1-4]\d{6}		주민등록번호
^\d{3}-\d{2}$		우편번호
 */
public class RegEx1 {
	public static void main(String[] args) {
		String pattern = "^[0-9]*$";	//숫자만
		String val = "a123456789";	//대상 문자열
		
		boolean regex = Pattern.matches(pattern, val);
		System.out.println(regex);
		
		String name = "이마크";
		String tel = "010-1234-5678";
		String email = "lmk08021@naver.com";
		
		//유효성 검사
		boolean name_check = Pattern.matches("^[가-힣]*$", name);
		boolean tel_check = Pattern.matches("^01(?:0|1|[6-9])-(?:\\d{3}|\\d{4})-\\d{4}$", tel);
		boolean email_check = Pattern.matches("\\w+@\\w+\\.\\w+(\\.\\w+)?", email);
		
		//출력
		System.out.println("이름 : "+name_check);
		System.out.println("전화번호 : "+tel_check);
		System.out.println("이메일 : "+email_check);
	}

}
