package sec2;

public class Example2 {
	public static void main(String[] args) {
		String data="박지현은 천사";	//공백 포함
		int len=data.length();	//문자열 길이
		System.out.println("data의 글자수 : "+len);
		
		//문자열 전체 변경
		data="박지현은 천재 ~ 천사 넘침";
		System.out.println("data : "+data);
		
		//문자열의 일부를 변경
		data=data.replace("천사","사랑둥이");
		data=data.replace("~","");
		System.out.println("data : "+data);
		
		//문자열 잘라내기
		String ju="201225-4789123";
		//20년 12월 25일
		String year=ju.substring(0,2);	//문자열변수.substring(시작인덱스,끝인덱스);
		String month=ju.substring(2,4);	//시작 인덱스는 포함, 끝 인덱스는 불포함(끝나는 번호 바로 앞까지만 출력)
		String day=ju.substring(4,6);
		System.out.println(year+"년 "+month+"월 "+day+"일");
		
		//특정 문자의 위치 찾기
		int pos=ju.indexOf("-");	//ju가 숫자니까 int
		System.out.println("-의 위치는 "+pos+"입니다.");
		int pos2=ju.indexOf("*");
		//System.out.println("*의 위치는 "+pos2+"입니다.");	 *는 없으므로 -1이 출력된다.
		if(pos2<0){
			System.out.println("못찾음");
		} else{
			System.out.println("*의 위치는 "+pos2+"입니다.");
		}
		
		//문자열 분리
		String dates="1979-12-25";
		String names="변백현-도경수-나재민-이제노";
		//문자열의 배열로 분리 - 문자열에서 특정 구분자(token)을 기준으로 또 다른 여러 문자열로 분리
		String[] date=dates.split("-");
		String[] name=names.split("-");
		//Array.length : 문자열 배열의 길이
		for(int i=0;i<date.length;i++){
			System.out.println(date[i]);
		}
		System.out.println();
		for(int i=0;i<name.length;i++){
			System.out.println(name[i]);
		}
	}

}
