package sec3;

import java.util.Scanner;

public class SystemEx1 {
	public static void main(String[] args) {
		//.out : 콘솔에 그 내용을 출력
		System.out.println();
		
		//.err : 콘솔에 에러 내용을 출력
		try {
			int val = Integer.parseInt("A1004");
			System.out.println(val);
		} catch(Exception e){
			System.out.println("에러");
			System.out.println(e.getMessage());
		}
		
		//.in
		System.out.println("내용 입력 : ");
		Scanner sc = new Scanner(System.in);
		String msg = sc.nextLine();
		System.out.println("입력된 내용 : "+msg);
		
		//exit() : 시스템 종료
		if(msg.equals("변백현")){
			System.out.println("시스템을 종료합니다.");
			System.exit(0);
		}
		//currentTimeMillis() : 시스템의 현재 시간을 밀리초로 반환
		System.out.println("현재 시간(밀리초) : "+System.currentTimeMillis());
		
		//nanoTime() : 현재 시간을 나노초로 변환
		System.out.println("현재 시간(나노초) : "+System.nanoTime());
		
		//getPropety() : 시스템 운영체제의 사용자 정보 반환
		System.out.println(System.getProperty("os.name"));
		System.out.println(System.getProperty("user.name"));
		System.out.println(System.getProperty("user.home"));
		System.out.println(System.getProperty("java.home"));
		System.out.println(System.getProperty("user.dir"));
		
		//getenv() : 시스템 운영체제의 환경변수 정보 반환
		System.out.println(System.getenv());
	}
}
