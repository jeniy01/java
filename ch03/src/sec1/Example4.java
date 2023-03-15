package sec1;

public class Example4 {
	public static void main(String[] args) {
		//비교연산자 : ==같다, !=같지않다, >초과, >=이상, <미만, <=이하
		//비교연산자의 연산결과는 true 또는 false로 출력됨
		int a=15;
		int b=17;
		System.out.println("a==b : "+(a==b));
		System.out.println("a!=b : "+(a!=b));
		System.out.println("a>b : "+(a>b));
		System.out.println("a>=b : "+(a>=b));
		System.out.println("a<b : "+(a<b));
		System.out.println("a<=b : "+(a<=b));
		
		String c="박지현";
		String d="박지현";
		System.out.println("c==d : "+(c==d));	//자연비교
		System.out.println("c==d : "+(c.equals(d)));	//실제비교 : String으로 비교할 땐 반드시 .equals()를 사용함
	}

}
