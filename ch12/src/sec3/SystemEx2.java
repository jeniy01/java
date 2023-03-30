package sec3;

public class SystemEx2 {
	public static void main(String[] args) throws Exception {
		//유니코드(아스키코드포함) : 0(48)~z(122)
		//System.in.read() : 10진수 정수인 아스키코드값으로 반환
		//int a = System.in.read();
		
		int speed = 0;
		int keyCode = 0;
		
		while(true){
			keyCode = System.in.read();
			if(keyCode != 13 && keyCode != 10){
				if(keyCode == 49){	//숫자 1을 누르면 속도 증가
					speed++;
				} else if(keyCode == 50){	//숫자 2를 누르면 속도 감소
					speed--;
				} else if(keyCode == 51){	//숫자 3을 누르면 끝
					break;
				}
			}
		}
		System.out.println("현재 속도 : "+speed);
		System.out.println("프로그램이 종료되었습니다.");
	}
}