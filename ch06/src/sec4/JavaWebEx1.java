package sec4;

public class JavaWebEx1 {
	public static void main(String[] args) {
		JavaWeb j1 = new JavaWeb();
		JavaWeb j2 = new JavaWeb();
		JavaWeb j3 = new JavaWeb();
		j1.dm = "이제노";
		j2.dm = "나재민";
		j3.dm = "황인준"; //dm은 static으로 공유데이터 즉, 정적멤버이므로 앞에서 선언한 것들은 전부 마지막 j3로 통일되서 출력됨
		
		j1.partName = "C언어";
		j2.partName = "자바";
		j3.partName = "파이썬";	//partName은 정적멤버가 아니라 인스턴스 멤버이므로 각기 다르게 출력됨
		
		System.out.println("j1 : "+j1.dm+", "+j1.partName);
		System.out.println("j2 : "+j2.dm+", "+j2.partName);
		System.out.println("j3 : "+j2.dm+", "+j3.partName);
		System.out.println("j0 : "+JavaWeb.dm);	//실제로 사용할 땐 new키워드로 객체를 생성(j1, j2, j3)하지 않고 이렇게 사용
	}

}
