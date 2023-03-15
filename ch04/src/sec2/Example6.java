package sec2;

public class Example6 {
	public static void main(String[] args) {
		//continue, break
		//break : 무한루프상에서 더이상 실행을 하지 않으려고 할 경우 중지할 때 사용
		int n=0;
		int sum=0;
		for(;;){
			n++;
			sum+=n;
			if(n>=100) break;
		}
		System.out.println("0~100의 합계 : "+sum);
		
		//3의 배수가 아닌 값의 합계
		//continue : 해당 카운트 변수의 값을 실행하지 않고 건너뛸 경우 사용
		for(int i=0;i<=100;i++){
			if(i%3==0) continue;	//3의 배수는 건너뛰기
			sum+=i;
		}
		System.out.println("3의 배수가 아닌 값의 합계 : "+sum);
	}

}
