package sec2;

public class Example6 {
	public static void main(String[] args) {
		//10진수를 n진수로 변환
		int i = 237;	//10진수 = decimal
		System.out.println("2진수로 변환 : "+Integer.toBinaryString(i));
		System.out.println("8진수로 변환 : "+Integer.toOctalString(i));
		System.out.println("16진수로 변환 : "+Integer.toHexString(i));
		
		int a = 0b1101001;	//2진수 = binary
		int b = 0476;	//8진수 = octal
		int c = 0x3ED;	//16진수 = hex
		System.out.println("a를 10진수 : "+a);
		System.out.println("b를 10진수 : "+b);
		System.out.println("c를 10진수 : "+c);
		
	}

}
