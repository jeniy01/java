package ex3;

public class Ssang {
	public static void main(String[] args) {
		for(int p=1;p<= 10;p++) {
 			for(int d=1;d<=10;d++) {
				if( (4*p+5*d)==60) {
					System.out.println("("+p+", "+d+")");
				}
			}
		}
	}

}
