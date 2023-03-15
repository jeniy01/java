package sec1;

public class Example3 {
	public static void main(String[] args) {
		int edps=70;
		int sp=90;
		int db=80;
		int tot=edps+sp+db;
		double avg=tot/3.0f;
		String hak="";
		//컴퓨터일반, 스프레드시트일반, 데이터베이스일반 점수를 변수로 입력받아 총점과 평균을 계산한 후
		//평균이 96~100 A+, 93~95 A0, 90~92 A-
		//평균이 86~89 B+, 83~85 B0, 80~82 B-
		//평균이 76~79 C+, 73~75 C0, 70~72 C-
		//평균이 66~69 D+, 63~65 D0, 60~62 D-
		//평균이 60미만이면 F로 학점을 계산
		
		//if~else if~else문으로 hak을 계산
		if(avg>=90){
			hak="A";
		} else if(avg>=80){
			hak="B";
		} else if(avg>=70){
			hak="C";
		} else if(avg>=60){
			hak="D";
		} else{
			hak="F";
		}
		//if~else if~else문으로 평균의 나머지를 정수로 바꾸어 +, 0, -를 hak 추가
		if((int)avg%10>=6){
			hak=hak+"+";
		} else if((int)avg%10>=3){
			hak=hak+"0";
		} else{
			hak=hak+"-";
		}
		if((int)avg==100){
			hak="A+";
		}
		if(avg<60) hak="F";
		
		System.out.println("최종 학점 : "+hak);
		System.out.println("평균 : "+avg);
	}

}
