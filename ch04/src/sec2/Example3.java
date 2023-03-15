package sec2;

public class Example3 {
	public static void main(String[] args) {
		//구구단(2단~9단)-중첩for문 활용
		for(int i=1;i<=9;i++){	//줄
			for(int j=2;j<=9;j++){	//칸(단)
				System.out.println(j+"*"+i+"="+j*i+"\t");
			}
			System.out.println();
		}
	}

}
