package sec2;

public class Example1 {
	public static void main(String[] args) {
		//반복실행문 : 특정 조건이 만족하는 동안 반복 실행하는 문장
		//for~, while~, do~while
		//for(초기값;조건식;증감식){반복할 실행문장들;}
		int sum=0;	//계산결과
		for(int i=0;i<=100;i++){	//i:카운트변수-유효범위(반복문 안에서만 유효)
			sum+=i;
			System.out.println("i="+i);
		}
		System.out.println("0~100합계:"+sum);
		
		sum=0; //초기화
		for(int i=0;i<=100;i+=2){
			sum+=i;
		}
		System.out.println("0~100의 짝수의 합계1 : "+sum);
		
		sum=0; //초기화
		for(int i=0;i<=100;i++){
			if(i%2==0) sum+=i;
		}
		System.out.println("0~100의 짝수의 합계2 : "+sum);
		
		sum=0;
		for(int i=0;i<=100;i+=2){
			sum+=i;
		}
		System.out.println("0~100의 홀수의 합게1 : "+sum);
		
		sum=0;
		for(int i=0;i<=100;i++){
			if(i%2!=0) sum+=i;
		}
		System.out.println("0~100의 홀수의 합게2 : "+sum);
	}

}
