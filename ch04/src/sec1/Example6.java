package sec1;

public class Example6 {
	public static void main(String[] args) {
		float num1=(float)Math.random();
		int num=(int)(Math.random()*6)+1;
		System.out.println("임의의 수[1-6] : "+num);
		
		if(num==1 || num==2){
			System.out.println("하위수");
		}
			else if(num==3 || num==4){
				System.out.println("중위수");
			}
			else{
				System.out.println("상위수");
			}
		
		switch (num){
		case 1:
		case 2:
			System.out.println("하위수");
			break;
		case 3:
		case 4:
			System.out.println("중위수");
			break;
		default:
			System.out.println("상위수");
		}
	}

}
