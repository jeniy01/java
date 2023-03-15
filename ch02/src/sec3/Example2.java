package sec3;

public class Example2 {
	public static void main(String[] args) {
		//정수, 문자열, 실수 지시자 세부적으로 출력 지시(제어)
		int d = 1234;
		double f = 2345.123456789d;
		String s = "I\'m a Girl";
		System.out.printf("%d\n", d);	//그대로 출력
		System.out.printf("%6d\n", d);	//자릿수 6자리보다 작으면 해당 숫자를 출력하고, 왼쪽에 남은 자릿수 만큼 공백 발생
		System.out.printf("%-6d\n", d);	//자릿수 6자리보다 작으면 해당 숫자를 출력하고, 오른쪽에 남은 자릿수 만큼 공백 발생
		System.out.printf("%06d\n", d);	//자릿수 6자리보다 작으면 해당 숫자를 출력하고, 왼쪽에 남은 자릿수 만큼 0으로 채우기
		//System.out.printf("%.2d\n", d);
		System.out.println("*** 실수 출력 ***");
		System.out.printf("%f\n", f);	//그대로 출력
		System.out.printf("%15f\n", f);	//숫자가 15자리 미만인 경우 남은 자릿수 만큼 왼쪽에 공백 발생
		System.out.printf("%-15f\n", f);	//숫자가 15자리 미만인 경우 남은 자릿수 만큼 오른쪽에 공백 발생
		System.out.printf("%.8f\n", f);	//소수점 이하 8자리까지 출력
		System.out.printf("9.4%f\n", f);	//소수점 이하 4자리를 출력하고 전체 9자리를 출력하고 남은 자릿수
		System.out.println("*** 문자열 출력 ***");
		System.out.printf("%s\n", s);	//그대로 출력
		System.out.printf("%15s\n", s);	//15자리로 출력하되, 왼쪽에 남은 자릿수만큼 왼쪽에 공백 발생
		System.out.printf("%-6s\n", s);	//15자리로 출력하되, 왼쪽에 남은 자릿수만큼 오른쪽에 공백 발생
	}

}
