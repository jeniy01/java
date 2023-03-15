package sec1;

public class Example1 {
	public static void main(String[] args) {
		//제어문 : 조건분기문, 반복문, 기타제어문으로 구성되며, 프로그램 실행의 흐름을 제어하는 문장
		//조건분기문 : 입력되어지는 데이터의 조건 만족 여부에 따라 실행 내용을 달리 하도록 하는 문장
		//if~문, switch~문
		
		//if문
		int point=80;
		
		//삼항연산자
		String res=(point>=90)?"우수":"보통";
		
		//한 줄 if문
		String res2="보통";
		if(point>=90) res2="우수";
		
		//실행할 문장이 두 줄 이상일 때
		String res3="보통";
		int bonus=0;
		if (point>=90){
			 res3="우수";
			 bonus=10;
	}
		//조건식이 만족할 때와 만족하지 않을 때를 모두 처리해야 할 경우
		String res4="";
		if (point>=90){
			res4="우수";
		} else {
			res4="보통";
		}

	}

}
