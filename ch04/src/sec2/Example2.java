package sec2;

public class Example2 {
	public static void main(String[] args) {
		/*
		 
		 * 
		 **
		 ***
		 ****
		 
		 위 모양대로 출력
		 */
		for(int i=1;i<=4;i++){	//줄
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();	//줄 띄우기
		}
		
		/*
		 
		 ****
		 ***
		 **
		 *
		 
		 위 모양대로 출력
		 */
		for(int i=1;i<=4;i++){
			for(int j=1;j<=5-i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i=4;i>=1;i--){
			for(int j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
