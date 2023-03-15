package sec2;

public class Example2 {
	public static void main(String[] args) {
		//자동 형변환 : 작은 -> 큰
		byte a = 10;
		short b = a;
		int c = b;
		float d = c;
		long e = (long) d;	//단, 실수 -> 정수로 변환시에는 자동 형변환이 되지 않으므로 강제 형변환을 해줘야 한다.(데이터 유실 가능성 있음)
		double f = e;
		//강제 형변환은 형변환 연산자()로 함
	}

}
