package sec3;

public class Quiz2 {
	public static void main(String[] args) {
		String grade="B";	//grade값 입력
		int score1=0;	//score1 초기화
		switch(grade){	//grade가
			case "A":	//"A"이면
				score1=100;	//score1은 100
				break;
			case "B":	//"B"이면
				score1=80;	//score1은 80
				break;
			default:	//나머지는
				score1=60;	//score는 60
				
		}
	}

}
