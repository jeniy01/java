package sec2;

public class Example4 {
	public static void main(String[] args) {
		String[] str1={"java", "python", "c-language"};
		String[] str2={"java", "python", "c-language"};
		String[] str3;
		String[] str4=new String[5];
		str3=str2;	//얕은 복제 : 같은 기억 장소를 가르키고 있음
		//깊은 복제 : 다른 기억장소를 가르키도록 데이터를 복제
		System.arraycopy(str2, 0, str4, 0, str2.length);
		System.out.println(str1==str2);	//주소 비교로 인해서 false
		System.out.println(str2==str3);
		System.out.println(str3==str4);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		
	}

}
