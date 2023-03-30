package sec3;
//나노초 : 1/1000000000초
public class SystemEx3 {
	public static void main(String[] args) {
		long time1 = System.nanoTime();	//연산 전의 시간
		long sum = 0;
		for(int i=0;i<=10000000;i++){
			sum+=i;
		}
		long time2 = System.nanoTime();	//연산 후의 시간
		
		//소요시간 = 연산 후의 시간 - 연산 전의 시간
		System.out.println("합산 결과 : "+sum);
		System.out.println("소요시간(나노초) : "+(time2-time1));
	}

}
